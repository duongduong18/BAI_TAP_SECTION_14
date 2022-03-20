package Bai2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
	private int id, price;
	private String name;

	public Product() {

	}

	public Product(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void input(Product p) {
//		System.out.println("nhap id");
//		p.setId(new Scanner(System.in).nextInt());
//
//		System.out.println("nhap name");
//		p.setName(new Scanner(System.in).nextLine());
//
//		System.out.println("nhap price");
//		p.setPrice(new Scanner(System.in).nextInt());
//	}
//
//	public void info(Product p) {
//		System.out.println("id : " + p.getId() + "|" + "name" + p.getName() + "|" + "price" + p.getPrice());
//	}
//
	public static void main(String[] args) throws IOException {
		Product p = new Product();
		File file = new File("demo.txt");
		if (!file.exists()) {
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
			fos.close();
		}
//	}
}
}