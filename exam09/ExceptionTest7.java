package exam09;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
	public void c() throws RuntimeException{}
}	

class Child extends Parent{
	
	// 재정의는 같거나 축소 및 같은 계열만 사용하는 형태로 사용
	public void a() {}
//	public void b() throws Exception {} ==> exception은 자식클래스가 아니므로 에러 발생
	public void b() throws ArithmeticException {}
//	public void c() throws IOException {} ==> 에러
}

public class ExceptionTest7 {
	public static void main(String[] args) {
	
	}
}
