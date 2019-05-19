package controller.login;

import java.net.URLEncoder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmLoginController {

	// 线程池
	public static ExecutorService exec = Executors.newCachedThreadPool();

	@RequestMapping("/login")
	public String LoginConfirm(String number, String password, ModelMap model)
			throws InterruptedException, ExecutionException, Exception {
		String changepassword=URLEncoder.encode(password, "utf-8");	
		// 采用线程池来管理多个用户同时登录时的情景
		Future<String> future = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				//ThreadContext.remove(ThreadContext.SUBJECT_KEY);
				Subject currentUser = SecurityUtils.getSubject();
				if (!currentUser.isAuthenticated()) {
					UsernamePasswordToken token = new UsernamePasswordToken(number, changepassword);
					token.setRememberMe(false);
					try {
						currentUser.login(token);
					} catch (AuthenticationException ae) {
						System.out.println("登陆失败！！！");
						return "redirect:/Login";
					}
				}
				model.put("UserNumber", number);
				currentUser.logout();
				return "redirect:/Home";
			}
		});
		return future.get();
	}
}
