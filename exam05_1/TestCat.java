package exam05_1;

public class TestCat {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 2, "암컷");
		
		// c.age = 10; // error. 직접 접근이 안되기 때문 (private 접근 제어자)
		
		// public int n = 10; // error. 로컬변수는 접근지정자 사용 불가

	}

}
