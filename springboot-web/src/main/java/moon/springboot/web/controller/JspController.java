package moon.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:41:54 
* 类说明 :jsp相关操作
*/

@Controller
@RequestMapping("/jsp")
public class JspController {
	
	@GetMapping("/index")
	public String toIndex(Model model) {
		model.addAttribute("name", "古乃亮");
		model.addAttribute("address", "荔园新村");
		return "index";
	}

}
