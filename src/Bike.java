
public class Bike {
	String brand;
	String model;
	int cc;
	int price;
	int taxAmount;
	int netPrice;

	public int findNetPrice() {
		return price + taxAmount;

	}

	public void print() {
		System.out.println("BRAND=" + brand + ", MODEL=" + model + ", CC=" + cc + ", PRICE=" + price + ", TAX="
				+ taxAmount + ", NET PRICE=" +findNetPrice());
	}

	public int getCheapestBikePrice(Bike b2, Bike b3) {
		if (b2.price < b3.price) {
			return b2.price;
		} else {
			return b3.price;
		}
	}

	public Bike getCostlyBike(Bike[] bikees) {
		Bike b = bikees[0];
		for (int i = 0; i < bikees.length; i++) {
			if (bikees[i].price > b.price) {
				b = bikees[i];
			}
		}
		return b;
	}

}
