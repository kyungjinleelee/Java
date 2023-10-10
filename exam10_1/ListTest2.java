package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		// List 계열 : 순서가 있고 중복이 가능 
		
		ArrayList<String> list = new ArrayList<>();
		
	//	List<String> list = new ArrayList<>(); // 다형성 (매우 중요)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 메서드 정리
		System.out.println("크기:" + list.size());
		
		// 수정
	//	list.set(index, element);
		list.set(1, "원균"); 	  // 이순신이 원균으로 변경
		
		// 삽입
		list.add(0, "강감찬"); // 0번째 (홍길동 전)에 강감찬 삽입
		
		// 삭제
		list.remove(1); 	// 위치로 삭제 ==> 홍길동이 삭제 
		list.remove("원균"); // 값으로 삭제  ==> 원균 삭제 (동일 값이 있을 경우 첫번째만 삭제)
		
		// 부분리스트 
		List<String> subList = list.subList(0,2); // 0 ~ 1 까지 반환
		System.out.println(subList);
		
		// 출력방법1 - toString() 이용
		System.out.println(list);  // [홍길동, 이순신, 유관순, 홍길동]	
		
		
		
	}

}
