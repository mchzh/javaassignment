import java.util.Scanner;

public class FindSingleOne {
	
	public static void main(String arg[]){
		int[] array={0,0,1,1,2,2,3,4,4,3,5,6,7,5,6,7,11,13,13,11,34};
		int value=0;
		value = singleNumber(array);
		System.out.println("Single number result -> " + value);
	}

	public static int singleNumber(int[] nums){
		int res = 0;
		// XOR: XOR own equal zero
		for(int i=0; i<nums.length; i++){
			res = res^nums[i];
		}
		return res;
	}
}
