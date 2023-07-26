package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		// 포맷 출력
		
	// < 1. String.format (String 형식문자, Object ... 값들) >
		// String result = String.format("", args);(모든 값이 Object에 올 수 있음)
		String result = String.format("이름: %s, 나이: %d, 키: %.2f, 성별: %c, 결혼: %b", "홍길동", 20, 167.23435, '남', true);
		System.out.println(result);
		
		/* 문자열: %s
		 * 정수: %d
		 * 실수: %f
		  		소수점 둘째자리에서 반올림하려면   %.2f
		 * 한자리글자: %c
		 * 논리값: %b
		 */
		
	// < 2. system.out.printf(String 형식문자, Object ...값들) >
		System.out.printf("이름: %s, 나이: %d, 키: %.2f, 성별: %c, 결혼: %b", "홍길동", 20, 167.23435, '남', true);
		System.out.println(); // 혹은 \n (엔터 효과)
		System.out.printf("이름: %s, 나이: %d, 키: %.2f, 성별: %c, 결혼: %b", "홍길동", 20, 167.23435, '남', true);
		
	}

}
