package com.npci.customer_transaction_project.customer_service.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.npci.customer_transaction_project.customer_entity.Customers;
import com.npci.customer_transaction_project.customer_repository.CustomerRepository;
import com.npci.customer_transaction_project.customer_service.CustomerService;

import com.npci.customer_transaction_project.exception.ResourcesNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customers>) customerRepository.findAll();
	}

	@Override
	public Customers getCustomersById(int customer_Id) {
		// TODO Auto-generated method stub
//		return customerRepository.findById(customer_Id).orElse(null);

		return customerRepository.findById(customer_Id)
				.orElseThrow(() -> new ResourcesNotFoundException("Customer not Found with Id: " + customer_Id));
	}

	@Override
	public Customers addOrUpdate(Customers customer) throws Exception {
		// TODO Auto-generated method stub
		int customerage=customer.getAge();
//		String password =customer.getPassword();
//		
//		String encryptedPwd= passwordEncoder.encode(password);
//		customer.setPassword(encryptedPwd);
		
		if(customerage<18) {
			System.out.println("Your Age is below 18. You can't open account now. "+ customerage);
			throw new Exception("Your Age is below 18. You can't open account now. ");
		}
		
		return customerRepository.save(customer);
	}

	@Override
	public Customers deleteCustomers(int customer_Id) throws Exception {
		// TODO Auto-generated method stub

		Customers deletedcustomer = null;
		//String message = "Deleted successfully.....";

		try {
			deletedcustomer = customerRepository.findById(customer_Id).orElseThrow(null);

			if (deletedcustomer == null) {
				throw new Exception("Customer is not available in database");
				
				
			} else {
				customerRepository.deleteById(customer_Id);
				
			}

		} catch (Exception e) {
			throw e;
		}
		return deletedcustomer;
	}

	@Override
	public List<Customers> getCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByAge(age);
	}

	@Override
	public List<Customers> getCustomerByFirstName(String first_name) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByusername(first_name);
	}



	

	

}
