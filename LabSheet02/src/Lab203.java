
public class Lab203 {

	public static void main(String[] args) {
		
		String[] subjects = {"ITE-201", "BIS-112", "DAT-201", "JPN-201", "ENL-211"};
		displayArray("Original", subjects);
		System.out.println();
		
		String new_subject = "SOC-111";
		subjects = addArraySize(subjects);
		subjects[subjects.length-1] = new_subject;
		displayArray("Already apended element", subjects);
		System.out.println();
		
		int delete_index1 = 3;
		subjects = deleteElement(delete_index1, subjects);
		displayArray("Already deleted index " + delete_index1, subjects);
		System.out.println();
		
		int delete_index2 = 0;
		subjects = deleteElement(delete_index2, subjects);
		displayArray("Already deleted index " + delete_index2, subjects);
		System.out.println();
		
		int delete_index3 = subjects.length-1;
		subjects = deleteElement(delete_index3, subjects);
		displayArray("Already deleted last index", subjects);
		System.out.println();
		
		int index_update = 1;
		String element_update = "MTE-201";
		subjects = updateElement(index_update, element_update, subjects);
		displayArray("Already updated element", subjects);
	}
	
	public static void displayArray(String message, String[] subjects) {
		System.out.print(message + ": ");
		boolean first = true;
		for (String subject : subjects) {
			System.out.print((!first ? ", " : "") + subject);
			first = false;
		}
	}	
		
	public static String[] addArraySize(String[] subjects) {
		String[] expand_array = new String[subjects.length + 1];
		for (int i = 0; i < subjects.length;i++) {
			expand_array[i] = subjects[i];
		}
		return expand_array;
	}
	
	public static String[] deleteElement(int index, String[] subjects) {
		String[] newSubjects = new String[subjects.length - 1];
		int j = 0;
	    for (int i = 0; i < subjects.length; i++) {
            if (i != index) {
            	newSubjects[j] = subjects[i];
                j++;
            }
	    }
	    return newSubjects;
	}
	
	public static String[] updateElement(int index, String value, String[] subjects) {
		subjects[index] = value;
        return subjects;
	}

}
