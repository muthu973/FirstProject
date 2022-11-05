
public class FibonacciSeries {
	public static void main(String[] args) {
		int temp=10,next;
		int first=0,second=1;
		System.out.println("Fibonacci series upto 50 is:");
		for(int i=1;i<=temp;++i) {
			System.out.print(+first+",");
		    next=first+second;
			first=second;
			second=next;
			
			
		}
	}

}
