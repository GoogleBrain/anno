package cn.hu.anno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hu.anno.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 访问路径 http://localhost:11000/user/findUserNameByTel?tel=1234567
	 * 
	 * @param tel
	 *            手机号
	 * @return userName
	 */
	@ResponseBody
	@RequestMapping("/findUserNameByTel")
	public String findUserNameByTel(@RequestParam("tel") String tel) {
		return userService.findUserName(tel);
	}
}