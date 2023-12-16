package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TrainTest {

	public static void main(String[] args) {

		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("不重複的班表:");
		Set<Train> uniT = new HashSet<>();
		uniT.add(train1);
		uniT.add(train2);
		uniT.add(train3);
		uniT.add(train4);
		uniT.add(train5);
		uniT.add(train6);
		uniT.add(train7);
		for (Train train : uniT) {
			System.out.println(train);
		}

		System.out.println("========");
		System.out.println("依照班別由大到小排序:");
		List<Train> tList = new ArrayList<>();
		tList.add(train1);
		tList.add(train2);
		tList.add(train3);
		tList.add(train4);
		tList.add(train5);
		tList.add(train6);
		tList.add(train7);

		Collections.sort(tList, new Comparator<Train>() {
			public int compare(Train t1, Train t2) {
				return Integer.compare(t2.getNumber(), t1.getNumber());
			}
		});
		for (Train train : tList) {
			System.out.println(train);
		}

		System.out.println("========");
		System.out.println("依據大小排序並去除重複:");

		List<Train> uniSortedT = getUniqueSortedTrains(train1, train2, train3, train4, train5, train6, train7);

		// 印出結果
		for (Train train : uniSortedT) {
			System.out.println(train);
		}
	}

	public static List<Train> getUniqueSortedTrains(Train... trains) {
		// 使用Stream進行排序和去重
		return List.of(trains).stream().distinct() // 去重
				.sorted((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber())) // 依班別由大到小排序
				.collect(Collectors.toList());
	}

}
