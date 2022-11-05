import java.util.*;
public class BinaryConversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Value:");
		int num=s.nextInt();
		s.close();
		String s1=Integer.toBinaryString(num);
	    System.out.println(s1);
		
	}

}
