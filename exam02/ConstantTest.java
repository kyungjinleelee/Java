package exam02;

public class ConstantTest {
	 
	public static void main(String[] args) {
		
		// 상수 : final 키워드 사용
		
		final int NUM = 10;
		final int MAX_NUM = 20;
		
	//	NUM = 20 ; // error. 값 변경 불가
		System.out.println(NUM); 		// 10
		System.out.println(MAX_NUM);	// 20
		
		
	}
}