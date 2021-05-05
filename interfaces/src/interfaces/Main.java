package interfaces;

public class Main {

	public static void main(String[] args) {
		// interface lerin referansýný new leyebilirsin
		/*
		 * ICustomerDal customerDal = new OracleCustomerDal(); customerDal.add();
		 */
		
		/*
		 * CustomerManager customerManager = new CustomerManager(); CustomerManager
		 * customerManager2 = new CustomerManager(); customerManager.customerDal = new
		 * OracleCustomerDal(); customerManager2.customerDal = new MySqlCustomerDal();
		 * customerManager.add(); customerManager2.add();
		 */
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	
	
	}

}
