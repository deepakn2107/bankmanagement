package com.npci.customer_transaction_project.customer_repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.npci.customer_transaction_project.customer_entity.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

	
	
	
	@Query(value = "select * from customers where age= :age", nativeQuery = true)
	public List<Customers> getCustomerByAge(@Param("age") int age);

	@Query(value = "select * from customers where first_name = :first_name", nativeQuery = true)
	public List<Customers> getCustomerByusername(@Param("first_name") String first_name);


	

}
