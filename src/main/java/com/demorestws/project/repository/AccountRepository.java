package com.demorestws.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorestws.project.domain.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
