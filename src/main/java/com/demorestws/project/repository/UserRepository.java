package com.demorestws.project.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demorestws.project.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<List<User>> findUserByFirstname(String firstname);

	public Optional<List<User>> findUserByAddress_City(String city);

	public Optional<List<User>> findUserByAccounts_Accounttype(String accounttype);

	public Optional<List<User>> findUserByAddress_CityAndAccounts_Accounttype(String city, String accounttype);

	@Query("SELECT u FROM user u WHERE u.firstname LIKE %:searchterm%")
	public Optional<List<User>> searchWithFirstname(@Param("searchterm") String searchterm);
}
