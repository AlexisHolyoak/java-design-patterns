package factorymethod6;

public class Client {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println("Blog Pages: " + site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println("Shop Pages: " + site.getPages());
	}

}