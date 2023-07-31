package exam05_1;

// 클래스는 특별한 이유가 없는 한 public 으로
public class Cat {
	
		// 인스턴스 변수는 특별한 이유가 없는 한 private 으로
		// Cat 클래스의 데이터 보호
		private String name;
		private int age;
		private String sex;
		
		// 생성자도 public
		public Cat() {
			
		}

		public Cat(String name, int age, String sex) {
			this.name = name;
			this.age = age;
			this.sex = sex;
		}

		public String getName() {
			return name;
		}

		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}
		
		public void setName(String name) {
			this.name = name;
			
			info();
		}
		
		// 바로 위의 info 메서드는 외부에서 전혀 사용하지 않는 것으로 가정.
		// Cat 클래스의 setName 메서드만 사용한다고 가정.
		// 이 경우 public 대신 private 으로 해주고, TestCat에서 안 보이게끔! (은닉화)
			// * public으로 해도 문법적으로 문제는 없다.
		private void info() {
			System.out.println("info");
		}
		
		/*
		 *   은닉화(캡슐화, encapsulation)
		 *   1. 데이터 보호
		 *   2. 복잡성 감소효과
		 * 
		 */
		
}
