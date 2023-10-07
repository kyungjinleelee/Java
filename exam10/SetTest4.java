package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		
		// Set 계열 : 순서가 없고 중복 불가한 자료구조
		// 정수만 저장 ==> Wrapper 클래스로 사용해야 한다. (컬렉션에는 참조형만 사용가능하기 때문)
			// 즉, int 대신 Integer
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10); // auto boxing
		set.add(20); // auto boxing
	//	set.add("helo"); // error (컴파일 시 부터 알 수 있음)
		
		for( int i : set) {		// auto unboxing
			System.out.println(i);
		}

		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.println("###"+ num);
		}
	}
}
