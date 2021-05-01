package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String student1 = "Engin";
		String student2 = "Derin";
		String student3 = "Salih";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		System.out.println("--------------------------------");

		String[] students = new String[4]; // [4] Number of array elements
		students[0] = "Engin"; // [0] index number, index number starts from 0
		students[1] = "Derin";
		students[2] = "Salih";
		students[3] = "Ahmet";
		// students[4] = "Ali"; --> ArrayIndexOutOfBoundsException

		for (int i = 0; i < students.length; i++) {  //Klassic For Loop
			System.out.println(students[i]);
		}

		System.out.println("--------------------------------");

		for (String student : students) {  // Foreach Loop
			System.out.println(student);
		}
	}

}
