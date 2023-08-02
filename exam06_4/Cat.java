package exam06_4;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}
	

	@Override	
	public void eat() { 
		System.out.println("Cat.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	// 생성자
	public Cat() {
		// 첫 라인에서 super([값 ,,,]); 사용가능하다.
		super(); // 자동 삽입 (super를 쓰건 안 쓰건 결과는 동일하다)
		System.out.println("Cat 생성자");
	}
	
	public Cat(String name, int age) {
		
		// 부모에서 선언된 변수를 부모가 초기화함.
		super(name, age); // <= 자동 삽입 
		
		System.out.println("Cat 생성자2");
		
		// 부모에서 선언된 변수를 자식이 초기화함.
		this.name = name;
		this.age = age;
	}
	
	
	
}
