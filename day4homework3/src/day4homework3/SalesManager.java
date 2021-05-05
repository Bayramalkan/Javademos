package day4homework3;

public class SalesManager {
    public void Sell(Customer customer, Product product){//satýþ iþlemi
        System.out.println(customer.getFirstName()+" "+product.getName()+" oyununu "+product.getPrice()+" fiyatýna satýn aldý");
    }
}