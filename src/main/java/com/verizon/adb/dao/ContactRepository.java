package com.verizon.adb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.adb.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	boolean existsByEmailId(String emailId);
	boolean existsByMobileNumber(String mobileNumber);
	Contact findByMobileNumber(String mobileNumber);
	Contact findByEmailId(String emailId);
	List<Contact> findAllByLastName(String lastName);
	
	
}
