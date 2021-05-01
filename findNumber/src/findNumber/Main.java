package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchNumber = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == searchNumber) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			System.out.println("Number is valid");
		}
		else {
			System.out.println("Number is invalid");
		}
	}

}
