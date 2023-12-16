package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/data/Object.ser"))) {
			Object obj1 = ois.readObject();
			Object obj2 = ois.readObject();

			if (obj1 instanceof Animal) {
				Animal animal1 = (Animal) obj1;

				animal1.speak();
			}

			if (obj2 instanceof Animal) {
				Animal animal2 = (Animal) obj2;

				animal2.speak();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
