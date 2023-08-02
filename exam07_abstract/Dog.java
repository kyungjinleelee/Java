package exam07_abstract;

public class Dog extends Pet{

	String sex;

	
	
	// 오버라이딩은 강제성이 없다.
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}
	

	// sex에 해당되는 생성자, getter setter 만들기 
	public Dog() {}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String sex) { // 성별까지 포함한 generate 만들기
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return String.format("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", name, age, sex);
	}

	
	

	
	
	
	
}
