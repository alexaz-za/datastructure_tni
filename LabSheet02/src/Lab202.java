import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		for (int nums : initial_numbers) {
			numbers.add(nums);
		}
		
		System.out.print("Input number :");
		int input_num = sc.nextInt();
		
		System.out.print("Insert number :");
		int insert_num = sc.nextInt();
		
		int last_index = 4;
		
		int delete_index = 6;
		
		int update_index = 6;
		
		numbers.add(input_num);
		numbers.add(last_index, insert_num);
		numbers.remove(delete_index);
		numbers.set(update_index,9);
		
		System.out.println("All elements = " + numbers);

	}

}
