package controller.login;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.TbBloguserMapper;
import pojo.TbBloguser;

@Controller
public class ConfirmLoginController {
	@Autowired
	TbBloguserMapper mapper;
	//�̳߳�
	public static ExecutorService exec = Executors.newCachedThreadPool();
	@RequestMapping("/login")
	public String LoginConfirm(String number, String password,HttpSession session) throws InterruptedException, ExecutionException {
		
		//�����̳߳�����������û�ͬʱ��¼ʱ���龰
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
						System.out.println("��½ʧ�ܣ�����");
						return "redirect:/Login";
					}
					
				} 
				/*��ȡ�û����ǳ�*/
				TbBloguser user = mapper.selectByPrimaryKey(number);
				session.setAttribute("UserName", user.getBlogusername());
				session.setAttribute("UserNumber", user.getBlogusernumber());				
				currentUser.logout();
				return "redirect:/home.jsp";
			}
		});							
		return future.get();		
	}
}