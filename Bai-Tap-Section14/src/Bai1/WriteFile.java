package Bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		writeFile();
		readFile();
appendMore();
	}

	public static void appendMore() throws IOException {
		String more = "i am here";
		String s = readFile(); 
       writeFile(s + more);
	}

	public static String readFile() throws IOException {
		String s = "";
		File file = new File("Test.txt");
		if (file.exists()) {
			FileInputStream fis = new FileInputStream(file);
			int c = fis.read();
			while (c != -1) {
				System.out.println((char) c);
				s += (char) c;
				c = fis.read();
			}
			fis.close();
		}
		return s;
	}

	public static void writeFile() throws IOException {
		File file = new File("Test.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String s1 = "Hello Java";

			FileOutputStream fos = new FileOutputStream(file);

			// ghi file
			byte[] arrs = s1.getBytes();
			fos.write(arrs);
			fos.close();
		}

	}

}
