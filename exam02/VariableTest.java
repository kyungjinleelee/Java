package exam02;

public class VariableTest {
	int n2; // 인스턴스 변수, 0으로 자동 초기화
static int n3; //클래스 변수(static변수), 0으로 자동초기화

	// main 메서드 
	public static void main(String[] args) {
		
		int n; // 로컬변수, 자동 초기화 안 돼서 error 
		n = 0; // 반드시 사용 전 초기화가 필요.
		System.out.println(n);
	}

}
