package controller.personal;

import java.net.URLEncoder;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.TbBloguser;
import service.UserInfo;

@Controller
public class ChangeMessage {
	@Autowired
	private UserInfo service;

	@RequestMapping("/ChangeMessage")
	public String changemessage(String usernumber, String username, String password) throws Exception {

		String changepassword = URLEncoder.encode(password, "utf-8");
		/* MD5加密 */
		String hashAlgorithmName = "MD5";
		String credentials = changepassword;
		int hashIterations = 1024;
		Object salt = usernumber;
		Object Password = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
		/* 更新用户 */
		TbBloguser user = new TbBloguser();
		user.setBlogusernumber(usernumber);
		user.setBlogusername(username);
		user.setBloguserpassword(Password.toString());
		service.changemessage(user);
		return "redirect:/Login";
	}
}
