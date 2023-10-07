package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3_generic {

	private static final String String = null;

	public static void main(String[] args) {
		
		// Set 계열 : 순서가 없고 중복 불가한 자료구조
		
		HashSet<String> set = new HashSet<String>();
	//	HashSet<String> set = new HashSet<>(); // 뒤에는 타입 생략 가능
		
		// 가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
	//	set.add(10); ==> 제네릭을 쓰면 컴파일시부터 에러를 알 수 있음
		
		// 출력방법 1 - toString();
		System.out.println(set);
		
		// 출력방법 2 - foreach문 이용
		for (String obj : set) { 
		//	String str = (String)obj; ==> 형 변환이 불필요 
			System.out.println(">>" + obj.concat(" 님"));
		
		// 출력방법 3 - Iterator 이용
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str= ite.next();	// 형변환이 필요없음
			System.out.println("%%"+ str);
		}
			
			
			/* 제네릭을 쓰면?
			 *  1) 잘못된 데이터를 저장한 것을 컴파일 시점에 알 수 있다.
			 *  2) 무조건 형변환이 필요없다.
			 */
		
	}

	}
}
