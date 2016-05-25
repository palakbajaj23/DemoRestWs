package com.demorestws.project.service;

import java.util.List;

import com.demorestws.project.domain.User;

public interface UserService {
	public User saveUser(User user);

	public void deleteUser(User user);

	public List<User> findUserByFirstname(String firstname);

	public List<User> findUserByCity(String city);

	public List<User> findUserByAccounttype(String accounttype);

	public List<User> findUserByCityAndAccounttype(String city, String accounttype);
	
	public List<User> searchWith(String searchterm);
}
