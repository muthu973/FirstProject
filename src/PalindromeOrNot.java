import java.util.*;
public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Value:");
		String s=sc.next();	
		sc.close();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
	    if(s==reverse) {
				System.out.println("The given String is  palindrome");
			}else {
				System.out.println("The given string is not a palindrome");
			}
			
		}
	}


