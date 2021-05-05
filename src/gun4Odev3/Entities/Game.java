package gun4Odev3.Entities;

public class Game {
	private int id;
	private String name;
	private double price;
	private String description;
	private double campaignPrice;

	public Game() {
	}

	public Game(int id, String name, double price, String description, double campaignPrice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.campaignPrice = campaignPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCampaignPrice(Campaign campaign) {
		campaignPrice = price - (price * campaign.getDiscountRate() / 100);
		return campaignPrice;
	}

}
