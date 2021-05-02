package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations dortIslem = new FourOperations();
		System.out.println(dortIslem.add(2, 3));
		dortIslem.add2(2, 3, 5);
	}

}
