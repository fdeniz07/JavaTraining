package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3]; // [] Cities [] Regions

		cities[0][0] = "Istanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Kocaeli";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Eskisehir";
		cities[2][0] = "Antalya";
		cities[2][1] = "Adana";
		cities[2][2] = "Kahramanmaras";

		for (int i = 0; i <= 2; i++) { // nested loop -- ic ice döngü
			System.out.println("----------------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
