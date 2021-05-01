package wonderNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Mükemmel Sayi : Kendinden baska, pozitif tüm tam bölenlerin toplaminin
		// kendisine esit sayi
		// 6 -->1,2,3
		// 28 -->1,2,4,7,14

		int number = 100;
		int divisiorSum = 0; // bölenlerin toplami

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				divisiorSum = divisiorSum + i;
			}
		}

		if (divisiorSum == number) {
			System.out.println("Number is a WonderNumber");
		} else {
			System.out.println("Number isn't a WonderNumber");
		}
	}

}
