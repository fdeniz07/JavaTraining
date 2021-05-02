package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		System.out.println("Product added " + product.getName());
	}

	public void Add2(int id, String name, String description, int stockAmaount, double price, String color) {

	}

}
