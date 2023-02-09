package fa.training.final_access_modifier;

public class Vehicle {
	private String reg_num; // Registration number
	private String brand; // Brand
	private Color color; // Colour
	private Person owner; // Owner
	
	public Vehicle() {
		
	}

	public Vehicle(String reg_num, String brand, Color color, Person owner) {
		super();
		this.reg_num = reg_num;
		this.brand = brand;
		this.color = color;
		this.owner = owner;
	}

	public String getReg_num() {
		return reg_num;
	}

	public void setReg_num(String reg_num) {
		this.reg_num = reg_num;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	

}
