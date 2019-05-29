package controller.registe;

import java.net.URLEncoder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.SimpleHash;
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
	//ThreadLocal����
	private static ThreadLocal<String> name=new ThreadLocal<>(); 
	
	@Autowired
	private Resgister register;

	@RequestMapping("/Register")
	public String Register(String number, String password, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("asd*********");
		System.out.println(number+"/"+password);
		//线程池
		Future<String> future = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				try {
					String changepassword=URLEncoder.encode(password, "utf-8");
					String hashAlgorithmName = "MD5";
					String credentials = changepassword;
					int hashIterations = 1024;
					Object salt = number;
					Object Password = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
					//System.out.println(Password.toString());
					TbBloguser user = new TbBloguser();
					// ����number
					user.setBlogusernumber(number);
					// ���ó�ʼ���ǳ�
					user.setBlogusername(number);
					// ��������
					user.setBloguserpassword(Password.toString());
					boolean flag = register.insert(user);
					return flag == true ? "redirect:/Login" : "redirect:/Registe";
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return "redirect:/Registe";
				}
			}
		});
		name.set(future.get());
		return name.get();

	}
}