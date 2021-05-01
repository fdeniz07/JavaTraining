package friendlyNumber;

public class Main {

	public static void main(String[] args) {
		// Friendly number -- Arkadas Sayilar
		// 220-284 en kücük arkadas sayidir
		// Kendileri haric, pozitif tam bölenleri toplaminin birbirine esit olan
		// sayilara arkadas sayilar denir

		int number1 = 220;
		int number2 = 284;
		int divisiorSum1 = 0; // bölenlerin toplami
		int divisiorSum2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				divisiorSum1 = divisiorSum1 + i;
			}
		}

		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				divisiorSum2 = divisiorSum2 + i;
			}
		}

		// Method: 1

		if (number1 == divisiorSum2) {
			if (number2 == divisiorSum1) {
				System.out.println("Number1 and Number2 are friendly numbers");
			} else {
				System.out.println("Number1 and Number2 aren't friendly numbers");
			}
		}

		System.out.println("------------------------------------------------------------");

		// Method: 2

		if (number1 == divisiorSum2 && number2 == divisiorSum1) {
			System.out.println("Number1 and Number2 are friendly numbers");
		} else {
			System.out.println("Number1 and Number2 aren't friendly numbers");
		}
	}
}
