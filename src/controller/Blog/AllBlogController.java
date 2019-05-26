package controller.Blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import pojo.TbBlogartical;
import service.AllBlog;

/**
 * 
 * <p>
 * Title: AllBlogController.java<／p>
 * <p>
 * Description: 查询所有博客Controller<／p>
 * 
 * @author Ma
 * @date 2019年5月23日
 */
@Controller
public class AllBlogController {
	@Autowired
	private AllBlog service;

	@RequestMapping("/AllBlog")
	public String allblog(String UserName, String UserNumber, ModelMap model,
			@RequestParam(value = "page", defaultValue = "1") int page) throws Exception {
		if ("".equals(UserNumber)) {
			return "redirect:/Login";
		} else {
			PageInfo<TbBlogartical> result = service.GetAllBlog(page);
			List<TbBlogartical> list = result.getList();

			if (page - 1 != 0) {
				model.put("ProPage", page - 1);
			} else {
				model.put("ProPage", page);
			}
			if ((page - 1) * 10 + list.size() == result.getTotal()) {
				model.put("NextPage", page);
			} else {
				model.put("NextPage", page + 1);
			}
			model.put("Data", list);
			model.put("UserName", UserName);
			model.put("UserNumber", UserNumber);
			return "Blog/AllBlog";
		}
	}
}
