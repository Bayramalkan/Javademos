package day5homework1.business.concretes;

import java.util.List;

import day5homework1.business.abstracts.CustomerService;
import day5homework1.dataAccess.abstracts.CustomerDao;
import day5homework1.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;

	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
		
	}

	@Override
	public void checkCustomerSingUp(Customer customer) {
		if(!customer.getEmail().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,6}$")
			&& customer.getName().length()>=2 
			&& customer.getLastName().length()>=2
			&& customer.getPassword().length()>=6
			&& customer.getEmail()!=""
			&& customer.getPassword()!="") {
			System.out.println("Kay�t bilgileriniz do�ruland�. Linke t�klay�n�z "+customer.getEmail());
		}else {
			System.out.println("Kay�t bilgileriniz hatal� l�tfen kontrol ediniz. ");
			return;
		}
		this.customerDao.singUp(customer);
		
	}
	
	@Override
	public void checkCustomerSingIn(Customer customer) {
		if(customer.getEmail()=="bayramalkan@ogrenci.beykoz.edu.tr"
			&& customer.getPassword()=="123456") {
			this.customerDao.singIn(customer);
		}else {
			System.out.println("Giri� bilgileriniz hatal�.");
		}
		
		
	}
	
	@Override
	public void checkCustomerEmail(Customer customer, Customer customer2) {
		if(customer.getEmail()==customer2.getEmail()) {
			System.out.println("Bu E-posta daha �nce kullan�lm��.");
		}
		
	}


	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	


}
