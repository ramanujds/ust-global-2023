package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		// Writing an object to a file
		
//		Employee emp = new Employee(1001, "Harsh Verma", 45000);
//		FileOutputStream ouputStream = null;
//		ObjectOutputStream objectStream = null;
//		try {
//			ouputStream = new FileOutputStream("employee.data");
//			objectStream = new ObjectOutputStream(ouputStream);
//			objectStream.writeObject(emp);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				ouputStream.close();
//				objectStream.close();
//			} catch (IOException e) {
//				System.err.println(e);
//			}
//		}
		
		// Reading an object
		
		FileInputStream inputStream=null;
		ObjectInputStream objectInputStream = null;
		try {
		inputStream = new FileInputStream("employee.data");
		objectInputStream = new ObjectInputStream(inputStream);
		Employee emp =(Employee) objectInputStream.readObject();
		System.out.println(emp);
		}
		catch (IOException | ClassNotFoundException e) {
			System.err.println(e);
		}
		
	}

}
