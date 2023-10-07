package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		// Set 계열 : 순서가 없고 중복 불가한 자료구조
		
		HashSet set = new HashSet();
		
		set.add("홍길동");
		set.add(20);   // (기본형) 자동으로 auto boxing 
		set.add(3.14); // 자동으로 auto boxing
		set.add('a');  // 자동으로 auto boxing
		set.add(true); // 자동으로 auto boxing
		
		set.add("홍길동");
		set.add(20);   // (기본형) 자동으로 auto boxing 
		set.add(3.14); // 자동으로 auto boxing
		set.add('a');  // 자동으로 auto boxing
		set.add(true); // 자동으로 auto boxing
		
		
		// 출력 방법 1 - toString() 이용
		System.out.println(set); // [a, 홍길동, 20, 3.14, true] ==> 중복불가, 순서없음
		
		// 출력방법 2 - foreach문 이용 
		for (Object obj : set) {  // 다형성
			System.out.println(">>" + obj);
		/*	>>a
			>>홍길동
			>>20
			>>3.14
			>>true	*/
			
		// 출력방법 3 - Iterator 사용 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("###" + ite.next());
		}
		}
		
		
		
		
	}

}
