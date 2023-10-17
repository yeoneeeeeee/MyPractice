package Arrangement;

public class Arrangement2 {

	public static void main(String[] args) {

		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			// Math.random()함수는 0 ~ '?+1' 사이의 임의적인 숫자
			array[i] = (int) (Math.random() * 100 +1);
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
	
	}

}
