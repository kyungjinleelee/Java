package exam02;

public class OperatorTest4 {
	 
	public static void main(String[] args) {
		
		// 4. 논리 연산자 ( 실행 결과는 논리값 )
		
		// JS 처럼 임의의 값을 논리값으로 사용 불가
		
		// 가. &&
		System.out.println(true && true);  // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false);// false
		// && 연산자는 앞이 false면 뒤 연산자를 실행x (어차피 false)
		
		// 나. ||
		System.out.println(true || true);  // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false);// false
		System.out.println();
		// || 연산자는 앞이 true면 뒤 연산자 실행x (어차피 true)
		
		//다. ! ( 부정 )
		System.out.println(!true); // false
		System.out.println(!false);// true
		
	}
}