package exam02;

public class TypeCastTest2 {
	 
	public static void main(String[] args) {
		
		// 1. 묵시적 형번환 ( upcasting )
		
		// 가. byte > short > int > long > float > double, 	큰 타입 = 작은타입;
		// 나. char --> int (아스키코드값)	
		// 다. int 보다 작은 데이터형의 연산은 int로 반환 
		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		
		// 2. 명시적 형변환 ( downcasting )
		// (데이터타입) <= 형변환 연산자, 작은타입=(작은타입)큰타입;
		int n = 10;
		short n2 = (short)n; // 작은타입 = (작은타입)큰타입;
		
		int num1 = 1, num2 = 4;
		double result1 = num1 / num2; //0.0
		// 원래 1/4는 0.25인데 0.0값이 나온다. 정확한 값 얻으려면?
		double result2 = (double)num1 / num2; //0.25
		
		System.out.println(result1); 
		System.out.println(result2); 
		
	}
}