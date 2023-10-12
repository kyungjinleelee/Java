package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <?>

public class GenericsTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		
		printData(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
	
		printData(list2);
	}
	
	// printDate라는 메서드 만들기
	public static void printData(List<?> xxx) { // string과 integer를 다 받아주기 위한 물음표 (?).
		System.out.println(xxx);
		
		/* 결과값
		[홍길동, 이순신]
		[10, 20]
		*/
	}

}
