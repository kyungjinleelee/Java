package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// Map은 순서가 없다.
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();

		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // key 중복 시 덮어쓴다.
		
		map2.put("c1", "감자");
		map2.put("c2", "고구마");
		map2.put("c3", "호박");
		
		// 출력방법 1 - toString
		System.out.println(map2); // {c3=호박, c1=감자, c2=고구마}

		
		// 출력방법 2 - get(key) 메서드
		System.out.println(map.get("p1"));  // 홍길동
		System.out.println(map.get("p2"));  // 이순신
		System.out.println(map.get("x"));  // null ==> 해당되는 키가 없으면 null값 나옴 
	
		// 출력방법 3 - keySet() ==> key값을 반환 (주로 key가 많을 때 사용)
		Set<String> keys = map.keySet();
		System.out.println(keys); // [p1, p2, p3]
		
		// key를 얻고 얻은 key를 가지고 value를 얻기 
		for(String key : keys) {
			System.out.println(key+ " "+ map.get(key));
		}
			/* 결과값
			p1 홍길동
			p2 이순신
			p3 강감찬
			*/
	
	
	}

}
