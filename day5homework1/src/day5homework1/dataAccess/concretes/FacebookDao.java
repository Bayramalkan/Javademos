package day5homework1.dataAccess.concretes;

import day5homework1.dataAccess.abstracts.CustomerDao;
import day5homework1.entities.concretes.Customer;

public class FacebookDao implements CustomerDao{

	@Override
	public void singUp(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Facebook hesab� ile kay�t oldunuz. " + customer.getEmail());
	}

	@Override
	public void singIn(Customer customer) {
 		System.out.println("Facebook hesab� ile giri� yapt�n�z. " + customer.getEmail());
		
	}

}
