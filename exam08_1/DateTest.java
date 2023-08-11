package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		
	// 날짜 데이터
		
		Date d = new Date();
		
		System.out.println(d); // d.toString() 동일, 재정의 됨
	
		// java.text.SimpleDateFormat 클래스와 병행해서 사용한다.
	// 가. Date 타입 ----> String
		  // 즉, Fri Jul 21 15:27:29 KST 2023 을 ===> 특정포맷을 가진 문자열로 변경
		/*
		 *   - 날짜 포맷 -
		 *   년도 : yyyy
		 *   월:   MM
		 *   일:   dd
		 *   시간: HH
		 *   분:   mm
		 *   초:   ss
		 */
	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 2023-07-21
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss"); // 2023-07-21, 15:36:14
		String result = sdf.format(d);
		System.out.println(result);
		
	// 나. String --> Date
		String s = "2023년5월13일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일"); // 2023-07-21, 15:36:14
		Date d2 = sdf2.parse(s);
		System.out.println(d2); // Sat May 13 00:00:00 KST 2023 (date로 변환)

	}

}
