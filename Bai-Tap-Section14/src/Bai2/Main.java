package Bai2;

public class Main {
	
		public static void main(String[] args) throws ClassNotFoundException, Exception {
			FileService fService = new FileServiceImpl();

			fService.writeList();
			fService.readList();
		}

	}

