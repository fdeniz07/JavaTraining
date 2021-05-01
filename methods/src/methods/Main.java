package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	// camel casing
	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchNumber = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == searchNumber) {
				isThere = true;
				break;
			}
		}
		String message="";
		if (isThere) {
			message="Number is valid: " + searchNumber;
			giveAMessage(message);
		} else {
			giveAMessage("Number is invalid: " + searchNumber);
		}
	}

	public static void giveAMessage(String message) {
		System.out.println(message);
	}
}
