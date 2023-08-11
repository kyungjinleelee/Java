package exam08_1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder 클래스 이용한 문자열 생성 => 버퍼로 동작되기 때문에 자신의 문자열이 변경된다.
		StringBuilder sb = new StringBuilder("HeLLo");
	//	StringBufferr sb = new StringBuffer("HeLLo"); buffer 나 builder나 동작은 똑같음
		
		// 메서드
		System.out.println("1. 추가:" + sb.append("hello"));
		System.out.println("1. 추가:" + sb.append(10));
		System.out.println("1. 추가:" + sb.append(3.14));
		
		System.out.println("2. 삽입:" + sb.insert(0, "홍길동"));
		System.out.println("2. 삽입:" + sb.insert(0, 100));

		System.out.println("3. 삭제:" + sb.delete(0, 6)); // 0 ~ 5 까지 삭제
		
		// charAt, substring, indexof, replace 지원
		System.out.println("4. 거꾸로:" + sb.reverse()); 
		
		System.out.println(sb);
		
		// 가장 마지막 작업은 String으로 저장해서 사용된다. (builder로 가공 많이 한 후 String에 최종적으로 저장)
	//	String s = sb; // <== 타입이 다르기 때문에 저장 불가 (스트링과 스트링빌더)
		String s = sb.toString();
		System.out.println("최종결과:" + s);
	}

}
