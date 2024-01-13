package com.example.policybazaar.com.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.policybazaar.com.customer.Entity.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

		public Customer findByFirstName(String name);
}
