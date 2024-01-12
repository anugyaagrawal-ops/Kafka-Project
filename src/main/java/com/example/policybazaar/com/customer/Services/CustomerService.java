package com.example.policybazaar.com.customer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.policybazaar.com.customer.Entity.Customer;
import com.example.policybazaar.com.customer.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> saveCustomerAll(List<Customer> c){
		return repository.saveAll(c);
	}
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
	
	public Customer findByName(String name) {
		return repository.findByFirstName(name);
	}
	public Customer getCustomerByCustId(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteCustomer(int id) {
		repository.deleteById(id);
	}
	public Customer updateCustomer(Customer customer) {
		Customer cust1 = repository.findById(customer.getCustomerId()).orElse(null);
		cust1.setFirstName(customer.getFirstName());
		cust1.setLastName(customer.getLastName());
		cust1.setMobileNo(customer.getMobileNo());
		return repository.save(cust1);
	}
	

}
