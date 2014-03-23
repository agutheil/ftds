package de.agutheil.ftds.example.solid.isp;

public interface CustomerCommandService {
	public Customer createCustomer(Customer c);
	
	public Customer updateCustomer(Customer c);
	
	public Customer deleCustomer(Customer c);
}
