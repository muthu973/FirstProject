
public class UseOverRideAndLoad {

	public static void main(String[] args) {
		OverRide obj=new OverRide();
		System.out.println(obj.findActionScenes(5));
		System.out.println(obj.findActionScenes(0));
		System.out.println(obj.findActionScenes());
		System.out.println(obj.findActionScenes(5));
		System.out.println(obj.findActionScenes("three"));
        
	}

}
