package com.demorestws.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorestws.project.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<List<User>> findUserByFirstname(String firstname);
	
	public Optional<List<User>> findUserByAddress_City(String city);
}
