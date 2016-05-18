package com.demorestws.project.service;

import java.util.List;
import java.util.Optional;

import com.demorestws.project.domain.User;

public interface UserService {
	public User saveUser(User user);

	public void deleteUser(User user);

	public List<User> findUserByFirstname(String firstname);

	public List<User> findUserByAddress_City(String city);
}
