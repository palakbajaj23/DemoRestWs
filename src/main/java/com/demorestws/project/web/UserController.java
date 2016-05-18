package com.demorestws.project.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	// find users by first name
	@RequestMapping(value = UserUriConstants.FIND_USERS_BY_FIRSTNAME, method = RequestMethod.GET)
	public List<User> getUsersByFirstname(@PathVariable("firstname") String firstname) {
		System.out.println("here");
		List<User> userlist = userService.findUserByFirstname(firstname);
		return userlist;
	}

	// find users by city
	@RequestMapping(value = UserUriConstants.FIND_USERS_BY_CITY, method = RequestMethod.GET)
	public List<User> getUsersByCity(@PathVariable("city") String city) {
		System.out.println("here");
		List<User> userlist = userService.findUserByAddress_City(city);
		return userlist;
	}

	// getting a list of user by firstname
	/*
	 * @RequestMapping(value = "/hello") public String getGreeting() { return
	 * "Hello World form geeting"; }
	 */
}
