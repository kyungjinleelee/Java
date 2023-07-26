package exam03;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 1-2. 1차원 배열 -literal 이용
		// (주의 : 선언과 생성을 반드시 한번에) 2번을 제일 많이 씀
		
		// 기본형 배열
		int[] n = {10,20};
		
		// 값 변경 (배열 크기는 변경 안됨)
		n[0]=100;
		
		System.out.println(n.length);	//2
		System.out.println(n[0]);		//10 -> 변경 후 100 
		System.out.println(n[1]);		//20
		
		// 참조형 배열
		
		String[] n2 = {"홍길동","이순신","유관순"};
		System.out.println(n2.length);	//3
		System.out.println(n2[0]);		//홍길동
		System.out.println(n2[1]);		//이순신
		System.out.println(n2[2]);		//유관순
	
	}

}
