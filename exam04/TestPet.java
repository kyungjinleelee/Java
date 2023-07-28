package exam04;

// Cat과 같은 main 없는 재사용 크래스 관리목적
public class TestPet {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 변수명 = new 클래스명 ();
		
		// 고양이 : 야옹이 2살 암컷
		
		Cat c = new Cat();	// Cat 클래스가 메모리에 올라감
		
		// 멤버 접근
		c.name = "야옹이";
		c.age = 2;
		c.sex = "암컷";
		
			// 멤버 접근 (권장 안함)
		System.out.println(c.name);	// 야옹이
		System.out.println(c.age);  // 2
		System.out.println(c.sex);  // 암컷 
		
		// 고양이 : 망치 1살 수컷
		Cat c2 = new Cat();
		c2.name = "망치";
		c2.age= 1;
		c2.sex = "수컷";
			// 멤버 접근 (권장 안함)
		System.out.println(c2.name); // 망치
		System.out.println(c2.age);  // 1
		System.out.println(c2.sex);  // 수컷
	}

}
