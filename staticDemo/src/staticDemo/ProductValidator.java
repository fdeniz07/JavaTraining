package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static constructor worked");
	}

	public ProductValidator() {

		System.out.println("Constructor worked");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void things() {

	}

	public static class OtherClass {
		public static void Delete() {

		}
	}

}
