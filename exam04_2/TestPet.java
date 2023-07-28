package exam04_2;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		Cat c2 = new Cat("야옹이", 2);
		
		Cat c3 = new Cat("망치", 1, "수컷");
		
		/*
		 * 	오버로딩 생성자 지원 이유?
		 *  - 다양한 방법으로 생성할 수 있도록 하기 위해
		 *   ex) 야옹이의 나이는 아는데 성별을 모를 경우. 세 가지 정보를 모두 모를 경우. 
		 *       나이 성별은 아는데 이름을 모를 경우. 등등등
		 *   
		 *  기본 생성자
		 *  - 명시적으로 생성자를 안 만든 경우에만 자동생성된다.
		 *  따라서 기본생성자를 명시적으로 지정해야함.
		 */
		

	}

}
