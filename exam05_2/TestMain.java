package exam05_2;


class Count{
	
	int n; // 인스턴스 변수기 때문에 누적이 안됨 (객체 생성할 때마다 만들어짐)
	static int m; 	// static 변수라 실행 시 단 한번만 만들어짐, italic체
	
	public Count() {
		n++;
		m++;
	}
	
	public void n_print() {	// 인스턴스 메서드
		System.out.println("n:" + n); // 인스턴스 변수 접근 가능 
		System.out.println("m:" + m); // static 변수 접근 가능
	}
	
	public static void m_print() { // static 메서드
		// System.out.println("n:" + n); // error. 인스턴스 변수 접근 불가능
		// System.out.println(this); 	 // error. this도 인스턴스이기 때문에 사용 불가능
		System.out.println("m:" + m); 	 // static 변수 접근 가능
		
	}
	
} //end class
public class TestMain {

	public static void main(String[] args) {
		// count 객체생성을 몇 번 했는지? 
		// 변수 n 선언 -> count -> n_print 메서드 생성
		Count c = new Count();
		c.n_print();
		Count c2 = new Count();
		c2.n_print();
		
		/* 
		 * n:1
		   m:1
		   n:1
		   m:2
		 */

	}

}
