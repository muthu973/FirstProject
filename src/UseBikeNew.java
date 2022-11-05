
public class UseBikeNew {
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(20,500,60,"Himalaya",150000,"g6","Petrol");
		System.out.println(mb);
		System.out.println(mb.findMileage("Diesel"));
		System.out.println(mb.climbingSpeed(450, 40));
	}

}
