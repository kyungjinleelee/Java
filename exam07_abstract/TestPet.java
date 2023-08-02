package exam07_abstract;

public class TestPet {

	public static void main(String[] args) {
		
		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		c1.eat();
		c1.sleep();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		
		// 추상 클래스는 객체생성 불가 
	//   Pet p = new Pet(); // error. 추상 클래스기 때문에 new로 생성 불가.
		
		// 다형성
		Pet p = new Cat(); // new는 불가, 변수의 데이터 타입으로는 가능
		
	}

}
