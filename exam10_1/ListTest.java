package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		
		// List 계열 : 순서가 있고 중복이 가능 (배열과 유사)
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 출력방법1 - toString() 이용
		System.out.println(list);  // [홍길동, 이순신, 유관순, 홍길동]	
		
		// 2. foreach문 이용
		for(String s: list) {
			System.out.println(">>" + s);
		}
		
		// 3. Iterator 이용
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String x = ite.next();
			System.out.println("##" + x);
		}
		
		// 4. index 이용, list.get(idx)
		System.out.println(list.get(0)); // 첫번째 값 반환 ==> 홍길동
		System.out.println(list.get(1)); // 두번째 값 반환 ==> 이순신
		
		
		
		
		
	}

}
