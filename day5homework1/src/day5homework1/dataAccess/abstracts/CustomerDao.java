package day5homework1.dataAccess.abstracts;

import day5homework1.entities.concretes.Customer;

public interface CustomerDao {
	void singUp(Customer customer);
	void singIn(Customer customer);
	
}
