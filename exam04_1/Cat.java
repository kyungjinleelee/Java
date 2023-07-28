package exam04_1;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	// 생성자	==> 오버로딩(overloading) 생성자라고 부른다.
	 public Cat() {}
	 public Cat(String n) {}
	 public Cat(int a) {}
	 public Cat(String n, int a) {}
	 public Cat(int a, String n) {}
	
	 public Cat (String n, int a, String s) {
		 
		 this.name = n; // this 생략해서 name = n; 으로 쓸 수도 있다.
		 this.age = a;
		 this.sex = s;
	 }
	// 위의 방법들 모두 자바가 구분 가능 (하나의 클래스라도 다른 인자리스트)
	

}
