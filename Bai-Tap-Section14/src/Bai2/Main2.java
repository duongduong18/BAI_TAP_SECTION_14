package Bai2;

public class Main2 {
	public static void main(String[] args) {
		
	
	FileService fileService = new FileServiceImpl();

	System.out.println("Save file:");
	try {
		fileService.writeFile();
	} catch (IOException e) {
		e.printStackTrace();
	}

	System.out.println("Show file:");
	try {
		fileService.readFile();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}