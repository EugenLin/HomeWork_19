package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWritter {

	public static void main(String[] args) {

//		生成資料夾
		File folder = new File("C:\\data");
		if (!folder.exists()) {
			folder.mkdir();
		}

		Dog myDog = new Dog("Boddy");
		Cat myCat = new Cat("Niffy");

//		寫入
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"))) {
			oos.writeObject(myDog);
			oos.writeObject(myCat);
			System.out.println("Object written!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
