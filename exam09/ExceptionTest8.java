package exam09;

import java.util.Random;

class MyRandom{
	
	public void rand() throws RuntimeException{
		
		Random r = new Random();
		int n = r.nextInt(3); // 0 ~ 2 까지의 랜덤정수 반환 
		// 가정: 0 이 나오면 시스템에 불량이 생길 수 있다는 가정
		// 실제 적용: DB에서 원하는 값을 못 찾을 때 
		if(n==0)throw new RuntimeException("랜덤값에 0 출력");
		System.out.println(n);
	}
}
	
public class ExceptionTest8 {
	public static void main(String[] args) {
	
		MyRandom x = new MyRandom();
		try{
			x.rand();
		}catch(RuntimeException e) {
			System.out.println("error 발생" + e.getMessage());
		}catch(Exception e) {
			System.out.println("error 발생");

		}
		System.out.println("정상 종료");
		
	}
}
