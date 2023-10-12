package exam10_2;

import java.util.Date;

//제네릭스 등장배경
class Box{
	Object obj;
	
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
}
public class GenericsTest {

	public static void main(String[] args) {


		// 가정 : 문자열만 저장 하고싶어! 
		Box b1 = new Box();
		b1.setValue("홍길동");
	//	b1.setValue(10);	// 이슈 1: 문자열만 저장한다고 했는데 10을 넣어도 컴파일 에러가 나지않음. 실행 시에 잘못된 데이터임을 알게 됨 
		String str = (String)b1.getValue(); // 이슈 2: 무조건 형변환을 해야함
		
		System.out.println("문자열 길이:" + str.length()); // Object에는 length가 없어서 String으로 형변환
		
		
		// 가정 : 날짜만 저장 하고싶어!
		Box b2 = new Box();
		b2.setValue(new Date());
	//	b2.setValue(10); ==> 이슈 1: 잘못된 데이터 저장 가능
		Date d = (Date)b2.getValue();	// 이슈 2: 무조건 형변환 필요 
		System.out.println("날짜만" + d.getYear());
		
		
	}

}
