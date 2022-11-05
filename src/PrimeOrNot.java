import java.util.*;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n=s.nextInt();
		s.close();
		boolean isPrime=true;
		if(n%2==0) {
			isPrime=false;
		}
		
		if(isPrime==true) {
			System.out.println("The given Number "+n+" is a prime");
		}else {			
		System.out.println("The given Numer "+n+" is Not a Prime");
		}
			
		
		}		
	
		}
