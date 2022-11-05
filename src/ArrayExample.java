
public class ArrayExample {
	public static void main(String[] args) {
		String[] s=args[0].split(",");
		int[] nums=new int[s.length];
		for(int i=0;i<s.length;i++) {
			nums[i]=Integer.parseInt(s[i]);
			System.out.println(nums[i]);
		}
	}

}
