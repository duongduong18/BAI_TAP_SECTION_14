package Bai2;

import java.util.Scanner;

public class ProductServiceImpl implements ProductService {

	@Override
	public void input(Product product) {
		System.out.println("nhap id");
		product.setId(new Scanner(System.in).nextInt());

		System.out.println("nhap name");
		product.setName(new Scanner(System.in).nextLine());

		System.out.println("nhap price");
		product.setPrice(new Scanner(System.in).nextInt());
		
		
	}

	@Override
	public void info(Product product) {
		System.out.println("id : " + product.getId() + "|" + "name" + product.getName() + "|" + "price" + product.getPrice());
	}

	@Override
	public Product[] inputlist() {
		System.out.println("Enter SL product:");
		Scanner scan = new Scanner(System.in);

		Product[] products = new Product[scan.nextInt()];

		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
			this.input(products[i]);
		}

		return products;
		
	}
	@Override
	public void infolist(Product[] list) {
		
		for (Product product : list) {
			this.info(product);
		}
	}
}
