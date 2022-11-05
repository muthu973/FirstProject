import java.util.*;
public class MaxEx {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(5,23,54,23,14,56));
		Integer maxNum=nums.stream().max(Integer::compare).get();
		System.out.println(maxNum);

	}

}
