package exam06_2;

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
		System.out.println("Cat 생성자");
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
// 코드가 훨씬 간결해졌다.
	
}
