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
 * Title: RegisteSubmit.java<／p>
 * <p>
 * Description: 注册功能<／p>
 * <p>
 * Copyright: Copyright (c) 2007<／p>
 * <p>
 * Company: LTGames<／p>
 * 
 * @author Ma
 * @date 2019年5月9日
 */
@Controller
public class RegisteSubmit {
	// 线程池
	public static ExecutorService exec = Executors.newCachedThreadPool();
	//ThreadLocal变量
	private static ThreadLocal<String> name=new ThreadLocal<>(); 
	
	@Autowired
	private Resgister register;

	@RequestMapping("/Register")
	public String Register(String number, String password, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 执行任务
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
					// 设置number
					user.setBlogusernumber(number);
					// 设置初始化昵称
					user.setBlogusername(number);
					// 设置密码
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