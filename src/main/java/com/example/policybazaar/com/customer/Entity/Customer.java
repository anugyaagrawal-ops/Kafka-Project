package com.example.policybazaar.com.customer.Entity;






import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private long mobileNo;
	
	
}
