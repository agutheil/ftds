package de.agutheil.ftds.example.solid.isp;

import java.util.List;

public interface CustomerQueryService {
	public Customer findCustomerById(Integer id);
	
	public List<Customer> allCustomers();
}
