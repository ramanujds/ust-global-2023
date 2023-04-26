package filesandio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles {

	public static void main(String[] args) {
		FileReader reader = null;
		Scanner scan = null;
		try {
			// Opening a file in read mode
			reader = new FileReader("hello.txt");
			scan = new Scanner(reader);

			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}

//			int ch;
//			while((ch=reader.read())!=-1) {
//				System.out.print((char)ch);
//			}

//			BufferedReader in = new BufferedReader(reader);
//			System.out.println(in.readLine());
//			System.out.println(in.readLine());
//			System.out.println(in.readLine());

//			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				scan.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
