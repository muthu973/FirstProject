
public class UseMobile {
	public static void main(String[] args) {
		App app1 = new App("Facebook", 2.5d, "50MB");
		Battery battery1 = new Battery("2 YEARS", 4000, "6 MONTHS");
		Mobile mobile1 = new Mobile("SAMSUNG", 20000.50f, "ANDROID", "WHITE", 190, app1, battery1);
		System.out.println("MOBILE 1 DETAILS:");
		System.out.println(mobile1);
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("APP 1 Deatils:");
		System.out.println(app1);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("BATTERY 1 Details:");
		System.out.println(battery1);
		System.out.println("---------------------------------------------------------------------------");
		
		App app2 = new App();
		app2.setName("WAHTSAPP");
		app2.setVersion(25.55d);
		app2.setSize("35MB");
		Battery battery2 = new Battery();
		battery2.setWarranty("1 YEAR");
		battery2.setCapacity(4500);
		battery2.setLifeTime("12  MONTHS");
		Mobile mobile2 = new Mobile();
		mobile2.setBrand("OPPO F19S");
		mobile2.setPrice(25000.50f);
		mobile2.setOs("ANDROID");
		mobile2.setColor("WHITE");
		mobile2.setNetWeight(188);
		mobile2.setApp(app2);
		mobile2.setBattery(battery2);
		System.out.println("MOBILE 2 Deatils:");
		System.out.println(mobile2);
	}
}
