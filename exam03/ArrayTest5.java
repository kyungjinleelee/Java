package exam03;

import java.util.Arrays;

public class ArrayTest5 {

	public static void main(String[] args) {
		
	
		// 선언된 배열리스트 한꺼번에 출력하기
		int[] a = new int[] {1,2,3,4,5};
		
 // 1) 일반 for 문
		for(int i=0; i<a.length; i++) {
			System.out.println("한꺼번에 출력:"+ a[i]);
		}
		
		/* 결과값
		 * 한꺼번에 출력:1
		       한꺼번에 출력:2
                        한꺼번에 출력:3
                         한꺼번에 출력:4
                         한꺼번에 출력:5	
		 */
		
 // 2) for each 문
		
		/*
		 * 	for(변수: 배열명){    // js의 for-of와 동일
		 * 
		 * }
		 * 
		 */
		
		for(int k:a) {
			System.out.println("$$"+k);
		}
		 /* 결과값 
		  * $$1
			$$2
			$$3
			$$4
			$$5
		  */
		
		
 // 3) 배열 ==> 한번에 문자열로 출력 (java.util.Arrays 클래스 이용)
		System.out.println(Arrays.toString(a));	// 자동으로 상단에 import 어쩌고 생성
		
			// 결과값: [1, 2, 3, 4, 5] (핸들링 할 수는 없고 배열에 이거 있구나. 하고 보는 정도)
		
		
		
		
	}

}
