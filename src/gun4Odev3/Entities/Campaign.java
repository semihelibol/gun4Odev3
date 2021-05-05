package gun4Odev3.Entities;

public class Campaign {
	
	private int id;
	private String name;
	private double discountRate;
	private boolean isActive;
	
	public Campaign() {}

	public Campaign(int id, String name, double discountRate, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.isActive = isActive;
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
