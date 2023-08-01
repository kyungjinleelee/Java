package exam06_1;

// Cat, Dog, Bird 의 부모 클래스

public class Pet {
	
	// 공통 변수 만들기 
	String name;
	int age;
	
	// 공통 메서드 만들기
	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	
	
	
	// 생성자, getter setter 만들기
	
	public Pet() {}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
