package exam06_1;

// Cat is a Pet ==> 상속관계 
public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}
	
	// 메서드 재정의 (overrideing)
	@Override	// @으로 시작하는 코드: 어노테이션 (annotation) (이 코드가 오버라이딩 된 지 모르는 다른 개발자를 위해)
	public void eat() { // 이름, 파라미터 값도 다 동일하게.
		System.out.println("Cat.eat");
	}
	
	// source -> override/implement~.. 클릭
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
// 코드가 훨씬 간결해졌다.
	
}
