package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();
		// TODO Auto-generated method stub

	}

}