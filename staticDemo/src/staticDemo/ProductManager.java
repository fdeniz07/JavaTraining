package staticDemo;

public class ProductManager {
	public void add(Product product) {
			
		if (ProductValidator.isValid(product)) {
			System.out.println("Product is added");
		} else {
			System.out.println("Product is invalid.");
		}
	}

}
