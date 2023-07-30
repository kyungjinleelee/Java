package exam04_4;

public class Cat {
	
	// 변수 만들고
	String name;
	int age;
	String sex;
	
	// 생성자 만들고
	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// getter setter 메소드  만들기 (마우스 우클릭, 소스 이융해서)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	///////////////////////////////////////
	// 오버로딩 메서드
	// 필요하다면 메서드 추가 가능
	// ex) 이름과 나이 한꺼번에 수정하는 메서드 (명명 : setNameAge)
	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 나이와 성별 한꺼번에 수정하는 메서드
	public void setAgeSex(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	// 이름, 나이, 성별 한꺼번에 수정하는 메서드
	public void setNameAgeSex(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	////////////////////
	// 위의 세개처럼 이름 다르게 하면 관리하기가 너무 어려우니 이름 통일해주는 게 좋음
	public void setCat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 나이와 성별 한꺼번에 수정하는 메서드
	public void setCat(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	// 이름, 나이, 성별 한꺼번에 수정하는 메서드
	public void setCat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// getter + setter 기능 모두 포함하는 메서드
	public String getCat(String name, int age, String sex) {
		return name + " " +age+ " " +sex;
	}
	
	// 리턴 타입은 void인데 리턴 키워드를 쓰는 경우
	public void xxx() {
		System.out.println("xxx1");
		// 중간에 xxx 메서드를 중지하고 반환하는 역할: return
		if(true)return;		// 반복문을 빠져나오게 하는 건 break, 메서드를 빠져나오게 하는 건 return
		System.out.println("xxx2");
		System.out.println("xxx3");
	}
	
	// 자동형변환: byte>short>int>long>float>double
	public void yyy(double n) {	// 10은 int 지만 자동형변환으로 long, double,...도 가능
		xxx(); // 자신이 자신 안의 다른 메서드 호출 가능.	}
	
	
	
	}
}
