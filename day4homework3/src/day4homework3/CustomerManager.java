package day4homework3;

public class CustomerManager {
    public void add(Customer customer){
        if (CustomerValidator.isValid(customer)){
            System.out.println("Sisteme ho� geldin "+customer.getFirstName());
        }else{
            System.out.println("Bilgileriniz yanl��");
        }
    }
}