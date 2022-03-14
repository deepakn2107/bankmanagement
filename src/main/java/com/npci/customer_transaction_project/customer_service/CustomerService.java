package com.npci.customer_transaction_project.customer_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npci.customer_transaction_project.customer_entity.Customers;
//import com.npci.customer_transaction_project.transaction_entity.Transaction;

@Service
public interface CustomerService {

	public List<Customers> getAllCustomers();

	public Customers getCustomersById(int customer_Id);

	public Customers addOrUpdate(Customers customer) throws Exception;

	public Customers deleteCustomers(int customer_Id) throws Exception;

	public List<Customers> getCustomerByAge(int age);

	public List<Customers> getCustomerByFirstName(String first_name);

	
	
	
	


	
	
}
