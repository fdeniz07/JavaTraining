package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		String newMessage = getCity();
		System.out.println(newMessage);
		int number = sum(15, 7);
		System.out.println(number);
		int total= sum2(2,3,4,5,6,10);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sum2(int... numbers) { //int... numbers : Working with Variable Arguments
		int total=0;
		for (int number:numbers) {
			total+=number;
		}
		return total;
	}

	public static String getCity() {
		return "Ankara";
	}
}
