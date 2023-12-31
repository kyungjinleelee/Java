package exam07_polymorphism;

public class TestPet {

	public static void main(String[] args) {
		
		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c1.getName(), c1.getAge());
		System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", d1.getName(), d1.getAge(), d1.getSex() );
		System.out.printf("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", b1.getName(), b1.getAge(), b1.getColor());
		
		// 2. 다형성 생성 ==> 하나의 부모타입으로 서로 다른 여러 자식 타입을 참조
		// (큰 타입의 변수에 작은 타입을 저장할 수 있다.)
		Pet p = new Cat("야옹이", 2);
		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", p.getName(), p.getAge());
			p = new Dog("망치", 1, "수컷");
			System.out.printf("Dog 이름: %s, Cat 나이:%d \n", p.getName(), p.getAge());
			p = new Bird("까치", 1, "블랙");
			System.out.printf("Bird 이름: %s, Cat 나이:%d \n", p.getName(), p.getAge());
			
		   // 1)에서 객체 세개를 관리하려면 변수 3개가 필요했는데, 다형성을 이용하면 변수 하나로도 (p) 객체 세개를 관리할 수 있다.
			
			
	}

}
