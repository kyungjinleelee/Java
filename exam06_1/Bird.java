package exam06_1;

public class Bird extends Pet{

	String color;
	
	
	public void fly() {
		System.out.println("Bird.fly");
	}
	
	
	public Bird() {}
	public Bird(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	// 재정의
	
	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

	
	public String getColor() {
		return color;
	}
	

	public void setColor(String color) {
		this.color = color;
	}
	

	// Cat, Dog에 이어 역시 코드가 훨씬 간결해졌다.
	
}
