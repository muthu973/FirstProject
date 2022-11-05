
public class MountainBike extends BikeNew {
	int tyreThickness;
	int distance;
	int timeTaken;
	public int climbingSpeed(int distance,int timeTaken) {
		
		return distance/timeTaken;
	}
	
	public MountainBike(int tyreThickness,int distance,int timeTaken,String brand,int price,String model,String fuelType) {
		super(brand,price,model,fuelType);
		this.tyreThickness=tyreThickness;
		this.distance=distance;
		this.timeTaken=timeTaken;
	}
	
	public void setTyreThickness(int tyreThickness) {
		this.tyreThickness=tyreThickness;
		
	}
	public int getTyreThickness() {
		return this.tyreThickness;
	}
	public void setDistance(int distance) {
		this.distance=distance;
	}
	public int getDistance() {
		return this.distance;
	}
	
	public void setTimeTaken(int timeTaken) {
		this.timeTaken=timeTaken;
	}
	
	public int getTimeTaken(int timeTaken) {
		return this.timeTaken;
	}
	
	public String toString() {
		return "Tyre Thickness:"+tyreThickness+", Distance:"+distance+", Time Taken: "+timeTaken+", "+super.toString();	}
	

}
