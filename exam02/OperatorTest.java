package exam02;

public class OperatorTest {
	 
	public static void main(String[] args) {
		
		// 1. 산술연산자
		int n = 10;
		int n2 = 3;
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);	// 3  몫만 반환됨.
		// 나머지도 나오게 하려면? 실수로 나누면 됨.
		System.out.println(n/3.0);	// 3.3333333333333335
		System.out.println(n%n2);   // 1 
		
		// + : 연결연산자로서 사용 가능 
		String k = 10 + 20 + 30 + "hello";
		String k2 = "hello" + 10 + 20 + 30;
		
		System.out.println(k);  // 60hello
		System.out.println(k2); // hello102030
		
		
	}
}