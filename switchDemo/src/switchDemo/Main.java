package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A': {
			System.out.println("Mükemmel : Gectiniz");
			break;
		}
		case 'B':
			System.out.println("Cok güzel : Gectiniz");
			break;
		case 'C':
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef  : Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}

	}

}
