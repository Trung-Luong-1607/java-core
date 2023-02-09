package fa.training.final_access_modifier;

public class Magazine {
	private String name;
	private double price;
		
	public Magazine(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed!");
	}
	
	
}
