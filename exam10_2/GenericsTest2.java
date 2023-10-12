package exam10_2;

import java.util.Date;

//제네릭스 만들기
class Box2<T>{ // 타입이 정해지지 않았기 때문에 T 삽입  (Object 자리에 T)
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}
public class GenericsTest2 {

	public static void main(String[] args) {


		// 가정 : 문자열만 저장 하고싶어! 
		Box2<String> b2 = new Box2<String>();
	//	Box2<String> b1 = new Box2<>(); 도 가능 
		
		b2.setValue("홍길동");
	//	b2.setValue(10);  // 장점 1: 컴파일 시에 잘못된 데이터 저장했음을 안다.
		
		String str = b2.getValue(); // 장점 2: 형변환 불필요 
		System.out.println("문자열 길이:" + str.length()); 
		
		// 가정 : 날짜만 저장 하고싶어!
		Box2<Date> x = new Box2<>();
		x.setValue(new Date());
	//	x.setValue(10); 
		Date d = x.getValue();	
		System.out.println("날짜만" + d.getYear());
				
		
		
	}

}
