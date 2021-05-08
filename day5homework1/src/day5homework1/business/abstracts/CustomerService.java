package day5homework1.business.abstracts;

import java.util.List;

import day5homework1.entities.concretes.Customer;

public interface CustomerService {
	void checkCustomerSingUp(Customer customer);
	void checkCustomerSingIn(Customer customer);
	void checkCustomerEmail(Customer customer, Customer customer2);
	List<Customer> getAll();
}
