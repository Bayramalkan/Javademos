package day4homework3;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        SalesManager salesManager = new SalesManager();
        CampaignManager campaignManager = new CampaignManager();

        Customer customer = new Customer(1,2000,"11111111111","Bayram","ALKAN","11111111111111111111");
        Product product = new Product(1,50,"COD","en güzel oyun");
        Campaign campaign = new Campaign(10);

        customerManager.add(customer);
        salesManager.Sell(customer,product);
        campaignManager.addDiscount(product,campaign);
        campaignManager.updateDiscount(product,campaign,20);
        campaignManager.removeDiscount(product,campaign);
    }
}
