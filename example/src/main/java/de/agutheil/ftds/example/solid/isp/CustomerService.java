package de.agutheil.ftds.example.solid.isp;

import java.util.List;

public interface CustomerService {
	public Customer createCustomer(Customer c);
	
	public Customer findCustomerById(Integer id);
	
	public List<Customer> allCustomers();
	
	public Customer updateCustomer(Customer c);
	
	public Customer deleCustomer(Customer c);
}
