package controller.login;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmLoginController {	
	//线程池
	public static ExecutorService exec = Executors.newCachedThreadPool();
	@RequestMapping("/login")
	public String LoginConfirm(String number, String password) throws InterruptedException, ExecutionException {
		//采用线程池来管理多个用户同时登录时的情景
		Future<String> future = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Subject currentUser = SecurityUtils.getSubject();
				if (!currentUser.isAuthenticated()) {
					UsernamePasswordToken token = new UsernamePasswordToken(number, password);
					token.setRememberMe(true);
					try {		
							currentUser.login(token);
					} catch (AuthenticationException ae) {
						System.out.println("登陆失败！！！");
						return "redirect:/Login";
					}
				}
				return "redirect:/home.jsp";
			}
		});
		return future.get();
		
	}
}
