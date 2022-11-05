
public class BikeNew {
	private String brand;
	private int price;
	private String model;
	private String fuelType;
	
	public int findMileage(String fuelType) {
		if(fuelType.equals("petrol")) {
			return 40;
		}else {
			return 30;
		    
		}
		
	}
	
	public BikeNew(String brand,int price,String model,String fuelType) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.fuelType=fuelType;
	}
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public void setFuelType(String fuelType) {
		this.fuelType=fuelType;
	}
	public String getFuelType() {
		return this.fuelType;
	}
	
	public String toString() {
		return "Brand: "+brand+", Price: "+price+", Model: "+model+", Fuel Type: "+fuelType;
	}
	
	
}
