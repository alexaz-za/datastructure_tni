
public class Ex05 {

	public static void main(String[] args) {
		
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial dataset:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		// Copy data from nums -> new_nums start index 1
		for (int i = 0;i<new_nums.length;i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		// Display result
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted the last element:");
		
	}
	
}
