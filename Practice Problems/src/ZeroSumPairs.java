import java.util.*;

public class ZeroSumPairs {

	public static boolean findPairs(ArrayList<Integer> input) {
		
		Set<Integer> nums = new HashSet<Integer>(input);
		
		for (int element : input) {
			if (nums.contains(-element)) {
				return true;
			}
		} 
		return false;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		test.add(5);
		test.add(-5);
		
		System.out.println(findPairs(test));
		
	}
}
