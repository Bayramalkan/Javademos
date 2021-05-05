package day4homework3;

public class CampaignManager {
    public void addDiscount(Product product, Campaign campaign){
        campaign.setBeforePrice(product.getPrice());
        product.setPrice(product.getPrice()-campaign.getDiscount());
        System.out.println(product.getName()+" oyunu "+campaign.getBeforePrice()+" -> "+product.getPrice()+" d��t�");
    }
    public void removeDiscount(Product product, Campaign campaign){
        int price = product.getPrice();
        product.setPrice(campaign.getBeforePrice());
        System.out.println(product.getName()+" oyunundaki indirim KALKTI");
    }
    public void updateDiscount(Product product, Campaign campaign,int newDiscount){
        product.setPrice(campaign.getBeforePrice());
        campaign.setDiscount(newDiscount);
        System.out.println(product.getName()+" oyunundaki indirim g�ncellendi");
        addDiscount(product,campaign);
    }
}
