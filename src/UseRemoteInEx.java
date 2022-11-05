public class UseRemoteInEx {
	public static void main(String[] args) {
		NormalRemote nr=new NormalRemote();
		System.out.println(nr.findBatteryLife(15));
		System.out.println(nr.findAccessDistance(30));
		System.out.println(nr.findRemotePrice(300));
		System.out.println(nr.isOnOff());
		
	}

}
