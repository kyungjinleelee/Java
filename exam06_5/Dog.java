package exam06_5;

public class Dog extends Pet{

	String sex;
	
	public Dog() {}
	
	public Dog(String name, int age, String sex) {
		super(name,age); // super(); 로 부모가 초기화. (반드시 첫 라인에)
		this.sex = sex; // sex는 부모가 아닌 자식것이기 때문에 자식이 초기화.
	}
	
	
	// 재정의
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}
	
	public String getSex() {
		return sex;
	}
	

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// 역시 코드가 훨씬 간결해졌다!
	
	
	
	
	
}
