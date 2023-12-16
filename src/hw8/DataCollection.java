package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataCollection {
	public static void main(String[] args) {

		List<Object> mixedList = new ArrayList<>();

		mixedList.add(new Integer(100));
		mixedList.add(new Double(3.14));
		mixedList.add(new Long(21L));
		mixedList.add(new Short((short) 100));
		mixedList.add(new Double(5.1));
		mixedList.add("Kitty");
		mixedList.add(new Integer(10));
		mixedList.add(new Object());
		mixedList.add("Snoopy");
		mixedList.add(new BigInteger("1000"));

		System.out.println("印出所有元素");
		for (Object element : mixedList) {
			System.out.println(element);
		}

		System.out.println("=====");

		Iterator<Object> iterator = mixedList.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			if (!(element instanceof Number)) {
				iterator.remove();
			}
		}

		System.out.println("印出去除非Number所有元素");
		for (Object element : mixedList) {
			System.out.println(element);
		}

	}

}
