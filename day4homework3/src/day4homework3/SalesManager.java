package day4homework3;

public class SalesManager {
    public void Sell(Customer customer, Product product){//sat�� i�lemi
        System.out.println(customer.getFirstName()+" "+product.getName()+" oyununu "+product.getPrice()+" fiyat�na sat�n ald�");
    }
}