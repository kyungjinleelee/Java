package exam03;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 1-1. 1차원 배열 -new 이용 (거의 안씀)
		
		// 가. 배열 선언
		
		String[] n2; // n2 : 변수, 참조형 변수(string 타입이니까), 로컬 변수, String 타입의 배열 변수
		
		// 나. 배열 생성
		n2 = new String[3];
		
		System.out.println(n2[0]);	// null 참조형 변수의 초깃값은 모두 null 
		System.out.println(n2[1]);	// null
		System.out.println(n2[2]);	// null
	
	}

}
