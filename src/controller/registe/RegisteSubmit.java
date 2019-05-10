package controller.registe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.*;
import service.Resgister;

/**
 * 
 * <p>
 * Title: RegisteSubmit.java<��p>
 * <p>
 * Description: ע�Ṧ��<��p>
 * <p>
 * Copyright: Copyright (c) 2007<��p>
 * <p>
 * Company: LTGames<��p>
 * 
 * @author Ma
 * @date 2019��5��9��
 */
@Controller
public class RegisteSubmit {
	// �̳߳�
	public static ExecutorService exec = Executors.newCachedThreadPool();
	@Autowired
	private Resgister register;

	@RequestMapping("/Register")
	public String Register(String number, String password,HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ִ������
		Future<String> future = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				try {

					TbBloguser user = new TbBloguser();
					// ����number
					user.setBlogusernumber(number);
					// ���ó�ʼ���ǳ�
					user.setBlogusername(number);
					// ��������
					user.setBloguserpassword(password);
					boolean flag = register.insert(user);
					return flag == true ? "Login/Login" : "Login/Registe";
				} catch (Exception e) {
					// �����ִ����ʱ�򣬷���ע�����
//					response.setCharacterEncoding("utf-8");
//					response.setContentType("text/html");
//					PrintWriter out = response.getWriter();
//					out.println("<script>alert('ע��ʧ�ܣ�');</script>");
//					response.getWriter().flush();
//					response.getWriter().close();
//					System.out.println("asds");
					return "Login/Registe";
				}
			}
		});
		return future.get();

	}
}