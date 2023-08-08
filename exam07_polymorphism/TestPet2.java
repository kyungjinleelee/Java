package exam07_polymorphism;

public class TestPet2 {

	public static void main(String[] args) {
		
		// 다형성을 활용할 수 있는 경우
		
		// 1. 배열 
		Pet [] pets = {new Cat("야옹이1", 2),
			       	   new Dog("망치1", 1, "수컷"),
			           new Dog("망치2", 2, "암컷"),
			           new Cat("야옹이2", 1),
			           new Bird("까치", 1, "블랙"),
			           new Cat("야옹이3", 4) };
		
		// 이름과 나이만 출력
		for(Pet p: pets) {
			System.out.printf("이름: %s, 나이:%d \n", p.getName(), p.getAge());
		}
		
		// 고양이만 출력 ==> 배열에서 꺼냈을 때 누군지 식별하는 방법이 필요 (instanceof 연산자 이용)
		  // "참조변수 instanceof 클래스이름'
		for(Pet p: pets) {
			if(p instanceof Cat) {
				System.out.printf("Cat 이름: %s, Cat 나이:%d \n", p.getName(), p.getAge());
			}
		}
		  	/* 결과값 
		  	Cat 이름: 야옹이1, Cat 나이:2 
		  	Cat 이름: 야옹이2, Cat 나이:1 
		  	Cat 이름: 야옹이3, Cat 나이:4 */
		
		// 강아지의 이름, 나이, 성별 출력
		for(Pet p: pets) {
			if(p instanceof Dog) {
	
				System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별: %s \n", p.getName(), p.getAge(), ((Dog) p).getSex());
			}	// pet 클래스에는 getsex라는 게 없다. p.getSex() 라고 하면 컴파일오류남.
			// 부모엔 없고 자식에만 추가된 멤버접근은 반드시 부모타입을 자식으로 '형변환' 해야한다.
			// ((Dog)p.)getSex();
			
			/* 혹은 
			   Pet타입 --> Dog타입
			   Dog d = (Dog)p; */
		}
		
		
		
		
		
		
		
		}
				
	}


