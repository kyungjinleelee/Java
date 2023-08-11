package exam08_1;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		// 랜덤값 얻기
		Random r = new Random(); // import문 추가해야 에러 안남
		
		// 랜덤값 고장 ==> seed 고정
		r.setSeed(1234); // 시드값이 똑같으면 랜덤값 또한 똑같음.
		
		System.out.println("1. 임의의 정수값:" + r.nextInt()); // 1. 임의의 정수값:749370470
		
		System.out.println("2. 지정된 범위내의 정수값:" + r.nextInt(3)); // 0, 1, 2 중 랜덤하게 반환 
		// r.nextInt(n); 0 ~ n-1 까지의 정수값이 반환
		
		System.out.println("3. 임의의 논리값:" + r.nextBoolean()); // 3. 임의의 논리값:false
		
		System.out.println("4. 임의의 실수값(double):" + r.nextDouble()); // 4. 임의의 실수값(double):0.5160241193990037
		System.out.println("4. 임의의 실수값(float):" + r.nextFloat());   // 4. 임의의 실수값(float):0.8648898
	
	}

}
