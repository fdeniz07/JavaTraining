package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 }; // New process is done in the background
		double max = myList[0];
		double total = 0;
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Sum = " + total);
		System.out.println("Max Number = " + max);

	}

}
