package exam02;

public class TypeCastTest {
	 
	public static void main(String[] args) {
		
		// 1. 묵시적 형번환
		
		// 가. byte > short > int > long > float > double, 	큰 타입 = 작은타입;
		byte b = 10;
		short b2 = b; // 1byte -> 2byte 변경
		int b3 = b2; // 2byte -> 4byt 변경
		long b4 = b3;
		float f = b4;
		double f2 = f;
		
		 // 반대 경우는 에러 (해결: 강제적 형변환), 작은타입 = 큰타입;
		float x = 3.14f;
	//	int x2 = x; error 
		
		// 나. char --> int (아스키코드값)
		char c = 'A';		// 65
		char c2 = 'a';		// 97
		int n = c;
		int n2 = c2;
		System.out.println(n+" "+n2);;
		System.out.println('A'+ 1);; // 문자는 연산이 가능한다. 66
		
		// 다. int 보다 작은 데이터형의 연산은 int로 반환 
		short s = 10;
		short s2 = 10;
//		short s3 = s + s2; // error (short = int)
		
		
		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		float ff = 3.14F;
		int mm = 10;
		float ff2 = ff + mm; // float 으로 반환
		System.out.println(ff + mm);; // 13.14
	
	}
}