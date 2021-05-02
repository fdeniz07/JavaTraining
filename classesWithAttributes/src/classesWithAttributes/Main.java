package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",5000,2,"metalic grey");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setStockAmount(3);
//		product.setPrice(5000);
//		product.setColor("metalic grey");
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}

}
