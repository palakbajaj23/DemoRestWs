package com.demorestws.project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demorestws.project.constant.UserUriConstants;
import com.demorestws.project.domain.User;
import com.demorestws.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	// for register a user
	@RequestMapping(value = UserUriConstants.REGISTER_USER, method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	/*@RequestMapping(value = "/hello")
	public String getGreeting() {
		return "Hello World form geeting";
	}*/
}
