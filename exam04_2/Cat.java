package exam04_2;

// 생성자를 자동생성하는 방법

public class Cat {

	String name;
	int age;
	String sex;
	
	// 기본생성자, 자동생성됨
	public Cat() {
		// 마우스 오른쪽 클릭 -> 소스 -> generate from superclass -> omit ~ 체크 -> generate
	}
	
	public Cat(String name, int age, String sex) {
		// generate using fields -> 생성자까지 만들어주는 것
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	
	
	
	
	
	
}
