package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <? extends E>

class Person{}
class Man extends Person{}
class Woman extends Person{}

public class GenericsTest4 {
	public static void main(String[] args) {
		
		// Man만 저장
		List<Man> list = new ArrayList<Man>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		
		// Woman만 저장
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);

		// String만 저장
		List<String> list3 = new ArrayList<String>();
		list3.add("홍길동1");
		list3.add("홍길동2");		
	//	printData(list3); // String은 Person의 자식이 아니기 때문에 error.
		
		
	}
	
	// public static void printData(List<?> xxx) { ==> <?> 처리도 가능하지만,
	
	// Person 및 자식만 전달받도록 강제하고 싷다면
		public static void printData(List <? extends Person> xxx) {
		System.out.println(xxx);
		

	}

}
