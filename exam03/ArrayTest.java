package exam03;

public class ArrayTest {

	public static void main(String[] args) {
		// 1. 1차원 배열 -new 이용
		
		// 가. 배열 선언
		
		int[] n; // n: 변수, 참조형 변수, 로컬변수, int 타입의 배열 변수
		String[] n2; // n2 : 변수, 참조형 변수(string 타입이니까), 로컬 변수, String 타입의 배열 변수
		
		// 나. 배열 생성
		n = new int[2];
		n2 = new String[3];
		
		System.out.println(n[0]);	// 0
		System.out.println(n[1]);	// 0
	//	System.out.println(n[2]);	없는 방 접근하면 error 발생

	}

}
