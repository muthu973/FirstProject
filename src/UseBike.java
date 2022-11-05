
public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.brand = "TVS";
		b1.model = "APACHE";
		b1.cc = 160;
		b1.price = 90000;
		b1.taxAmount = 2000;
		System.out.println(b1.findNetPrice());
		Bike b2 = new Bike();
		b2.brand = "HERO HONDA";
		b2.model = "SPLENDER";
		b2.cc = 100;
		b2.price = 60000;
		b2.taxAmount = 1500;
		System.out.println(b2.findNetPrice());
		Bike b3 = new Bike();
		b3.brand = "BAJAJ";
		b3.model = "PULSAR";
		b3.cc = 180;
		b3.price = 100000;
		b3.taxAmount = 5000;
		System.out.println(b3.findNetPrice());
		System.out.println(b1.getCheapestBikePrice(b2, b3));
		Bike[] bikes = { b1, b2, b3 };
	    b1.getCostlyBike(bikes).print();

	}

}
