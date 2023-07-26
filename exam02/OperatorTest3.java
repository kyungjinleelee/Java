package exam02;

public class OperatorTest3 {
	 
	public static void main(String[] args) {
		
		// 3. 비교 연산자 ( 실행 결과는 논리값 )
		int n = 10;
		int n2 = 3;
		
		System.out.println(n==n2); // false
		System.out.println(n>n2);  // true
		System.out.println(n>=n2); // true
		System.out.println(n<n2);  // false
		System.out.println(n<=n2); // false
		System.out.println(n!=n2); // true
	//	System.out.println(n===n2); 주의 : JS의 identical 연산자 지원 안됨
		
	}
}