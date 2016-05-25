package com.demorestws.project.web;

import java.util.List;

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
		List<User> userlist = userService.findUserByFirstname(firstname);
		return userlist;
	}

	// find users by city
	@RequestMapping(value = UserUriConstants.FIND_USERS_BY_CITY, method = RequestMethod.GET)
	public List<User> getUsersByCity(@PathVariable("city") String city) {
		List<User> userlist = userService.findUserByCity(city);
		return userlist;
	}

	// find user by account type
	@RequestMapping(value = UserUriConstants.FIND_USERS_BY_ACCOUNTTYPE, method = RequestMethod.GET)
	public List<User> getUsersByAccounttype(@PathVariable("accounttype") String accounttype) {
		List<User> userlist = userService.findUserByAccounttype(accounttype);
		return userlist;
	}

	// find user by city and account type
	@RequestMapping(value = UserUriConstants.FIND_USERS_BY_CITY_AND_ACCOUNTTYPE, method = RequestMethod.GET)
	public List<User> getUsersByCityAndAccounttype(@PathVariable("city") String city,
			@PathVariable("accounttype") String accounttype) {
		List<User> userlist = userService.findUserByCityAndAccounttype(city, accounttype);
		return userlist;
	}

	// search user
	@RequestMapping(value = UserUriConstants.SEARCH_USER, method = RequestMethod.GET)
	public List<User> searchUser(@PathVariable("searchterm")String searchterm) {
		List<User> userlist = userService.searchWith(searchterm);
		return userlist;
	}
}
