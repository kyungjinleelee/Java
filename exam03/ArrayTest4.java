package exam03;


public class ArrayTest4 {

	public static void main(String[] args) {
		// 1-3. 1차원 배열 - new + literal 이용
		// 선언과 생성을 따로해야 할 경우, 2번 대신 3번을 쓴다
		
		// 기본형 
		int[] n = new int[] {10,20};
		System.out.println(n.length);	//2
		System.out.println(n[0]);		//10
		System.out.println(n[1]);		//20
		
		// 참조형 
		
		String[] n2 = new String[] {"a","b","c"};
		System.out.println(n2.length);	//3
		System.out.println(n2[0]);		//a
		System.out.println(n2[1]);		//b
		System.out.println(n2[2]);		//c
	
		
		
	}

}
