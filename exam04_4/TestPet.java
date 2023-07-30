package exam04_4;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 2 , "암컷");
		
		// 변수로 저장하지 않고 바로 출력 !
		System.out.println(c.getName()); // 야옹이
		System.out.println(c.getAge());  // 2 
		System.out.println(c.getSex());  // 암컷
		
		// 수정
		c.setName("망치");
		c.setAge(3);
		c.setSex("암컷");
		
		 // 위에서 변경 된 데이터 출력
		 System.out.println(c.getName()); // 망치
		 System.out.println(c.getAge());  // 3
		 System.out.println(c.getSex());  // 암컷
		 
		// 수정 2 - 한꺼번에 수정
		 c.setCat(4, "수컷");
		 System.out.println(c.getName()); // 망치
		 System.out.println(c.getAge());  // 4
		 System.out.println(c.getSex());  // 수컷
		 
		 
		// getCat 호출
		 String result = c.getCat("나비", 5, "암컷");
		 System.out.println(result);	// 나비 5 암컷  ( 한 줄로 )
		 
		 //////////////////////
		 c.xxx();
		 System.out.println("end");
		 
		 //////////////////////
		 c.yyy(10);
		 
		 
		 
		 
		 
		 
	}

}
