package controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import serviceImpl.UpdateRedisImpl;

@Controller
public class TestController {
	@RequestMapping("/Test")
	public String test() throws Exception{
		
		UpdateRedisImpl res = new UpdateRedisImpl();
		res.updateredis();
		return "redirect:/Login";
	}
}
