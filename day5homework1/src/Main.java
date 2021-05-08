import day5homework1.business.abstracts.CustomerService;
import day5homework1.business.concretes.CustomerManager;
import day5homework1.dataAccess.concretes.FacebookDao;
import day5homework1.dataAccess.concretes.GoogleDao;
import day5homework1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new GoogleDao());
		
		
		Customer customer = new Customer("bayram","alkan","bayramalkan@ogrenci.beykoz.edu.tr","123456");
		Customer customer2 = new Customer("bayram","alkan","bayramalkan1111@ogrenci.beykoz.edu.tr","123456");
		Customer customer3 = new Customer("bayram", "alkan","bayramalkan@ogrenci.beykoz.edu.tr","123456");
		Customer customer4 = new Customer("bayram","alkan","","123456");
		Customer customer5 = new Customer("bayram","alkan","bayramalkan@ogrenci.beykoz.edu.tr","");

		customerService.checkCustomerSingUp(customer);
		customerService.checkCustomerSingIn(customer);
		customerService.checkCustomerEmail(customer, customer3);
		customerService.checkCustomerSingUp(customer4);
		customerService.checkCustomerSingUp(customer5);
		
		System.out.println("\n-------------------------------------------------------------------------------------\n");
		
		CustomerService customerService2 = new CustomerManager(new FacebookDao());

		
		Customer customer6 = new Customer("bayram","alkan","bayramalkan@facebook.com","123456");
		Customer customer7 = new Customer("bayram","alkan","bayramalkan1111@facebook.com","123456");
		Customer customer8 = new Customer("bayram", "alkan","bayramalkan@facebook.com","123456");
		Customer customer9 = new Customer("bayram","alkan","","123456");
		Customer customer10 = new Customer("bayram","alkan","bayramalkan@facebook.com","");

		customerService2.checkCustomerSingUp(customer6);
		customerService2.checkCustomerSingIn(customer6);
		customerService2.checkCustomerEmail(customer6, customer8);
		customerService2.checkCustomerSingUp(customer9);
		customerService2.checkCustomerSingUp(customer10);

		
	}

}
