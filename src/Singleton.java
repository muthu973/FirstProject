
public class Singleton {
	private  int id;
	private  String password;
	private static Singleton single=null;
	
	private Singleton() {
	
	}
	
	
	public static Singleton createObj() {
		if(single==null) {
			single=new Singleton( );
			 
		}
		return single;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Singleton getSingle() {
		return single;
	}

	public static void setSingle(Singleton single) {
		Singleton.single = single;
	}

	@Override
	public String toString() {
		return "Singleton [id=" + id + ", password=" + password + "]";
	}
	
	

}
