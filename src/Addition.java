import java.util.*;
public class Addition {
	static int rem;
	static int add;
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n=s1.nextInt();	
		s1.close();
		while(n>0) {		
			rem=n%10;
			add+=rem;
			n=n/10;
							
		}
		System.out.println("Addition is:"+add);
	}

}
