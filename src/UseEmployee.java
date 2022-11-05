
public class UseEmployee {
	public static void main(String[] args) {
		PrivateEmployee pe=new PrivateEmployee(101,"Prabha",20000,10,12);
		System.out.println(pe);
		System.out.println(pe.findNetSalary(25000));
		System.out.println(pe.findHierarchy(12));
	}

}
