package exam08_1;

public class StringTest {

	public static void main(String[] args) {
	  // 1. String 클래스 이용한 문자열 생성
		
		 // 가. 리터럴 이용  (일반적인 방법) ==> 동일한 문자열이면 재사용함
		 String s = "hello";
		 String s2 = "hello";
		 
		 // 나. new 이용 ==> 동일한 문자열이라도 매번 생성 -> x와 x2 주소값이 다르단 소리
		 String x = new String("hello");
		 String x2 = new String("hello");

		 System.out.println(s); // hello
		 System.out.println(x); // hello
		 // == 는 주소값이 같냐고 물어보는 것
		 System.out.println(s==s2); // true
		 System.out.println(x==x2); // false
		 // 기억할 것!:  문자열 비교는 절대로 == 으로 하면 안됨 (주소값이 같냐고 물어보는 것이기 때문)
		 // 그럼 어떤거 써야함? -> equals 메서드 써야함 
		 System.out.println(s.equals(s2)); // true
		 System.out.println(x.equals(x2)); // true (똑같은 "hello" 문자열이라 true 반환)
	
	
	}

}
