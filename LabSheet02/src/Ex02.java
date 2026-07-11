import java.util.Scanner;

public class Ex02 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0;i<=nums.length-1;i++) {
			System.out.print("Enter number index " + i + ": ");
			nums[i] = sc.nextInt();
		}
		
		NumberArrayController numbers = new NumberArrayController();
		numbers.setNums(nums);
		numbers.display("\nPrint all elements:");
	}
}
