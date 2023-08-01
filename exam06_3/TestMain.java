package exam06_3;

class Parent{
	
	int age = 20;
}

class Child extends Parent{
	int age = 10;	// #
	
	public void info() {
		System.out.println(age); // this.age 결과값 10
		System.out.println(super.age); // 결과값 20
	}
}



public class TestMain {

	public static void main(String[] args) {
	
		Child c = new Child();
		c.info(); // c의 info 호출 : 10
		// 위의 # 주석 처리시 결과값은 20.
		
	}

}
