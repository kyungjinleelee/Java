package exam02;

public class VariableTest3 {
	 
	public static void main(String[] args) {
		
		// 변수 특징
		
		// 1. 중복 불가 (식별이 안되기 때문)
		int num = 10;
	//	int num = 20;
		
		// 2. 블록 scope
		{
			int num2 = 100;
			System.out.println(num2); //블럭 안에서 선언된 함수는 블럭 안에서만 사용 가능
		}
	//	System.out.println(num2); 여기서는 에러
		
		// 3. 로컬 변수 사용 시 반드시 초기화할 것
		int num3;
	//	System.out.println(num3); 초기화 안 했기 때문에 error
		
		// 4. 변수 종류
		/*
		 *  가. 로컬 변수
		 * 
		 *  나. 인스턴스 변수
		 *  
		 *  다. 클래스 변수 (static)
		 * 
		 */

	}
}