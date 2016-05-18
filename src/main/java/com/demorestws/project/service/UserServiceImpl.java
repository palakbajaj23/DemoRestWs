package com.demorestws.project.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorestws.project.domain.User;
import com.demorestws.project.repository.AddressRepository;
import com.demorestws.project.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public User saveUser(User user) {
		addressRepository.save(user.getAddress());
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public List<User> findUserByFirstname(String firstname) {
		Optional<List<User>> userList = userRepository.findUserByFirstname(firstname);
		if (userList.isPresent())
			return userList.get();
		else
			return userList.orElseThrow(NoSuchElementException::new);

	}

	@Override
	public List<User> findUserByAddress_City(String city) {
		Optional<List<User>> userList = userRepository.findUserByAddress_City(city);
		if (userList.isPresent())
			return userList.get();
		else
			return userList.orElseThrow(NoSuchElementException::new);
	}

}
