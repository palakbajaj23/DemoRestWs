package com.demorestws.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorestws.project.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
