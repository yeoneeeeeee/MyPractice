package Control_Statement;

public class Main {

	final static int N = 30;
	
	public static void main(String[] args) {

		// 연산자 복습
		//int i = 20;
		
		// 경우1
		//i++; // 21 출력
		
		// 경우2
		//i = i + 1; // 21 출력 
		
		// 경우3
		//i += 1; // 21 출력 
		
		//System.out.println(i);
		
//		System.out.println((100 < i) && (i < 200)); // false
//		System.out.println((100 < i) || (i < 200)); // true

		// 1. 특정 문자열을 포함하는 경우 조건문
		String a = "I Love You.";
		if(a.contains("Love")) {
			// 포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
		}else {
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");
		}
		
		// 2. 정수에 따라 다른 메시지 출력하는 조건문
		int score = 95;
		
		if(score >= 90) {
			System.out.println("A+입니다.");
		}else if(score >= 80){
			System.out.println("B+입니다.");
		}else if(score >= 70){
			System.out.println("C+입니다.");
		}else {
			System.out.println("F입니다.");
		}
		
		// 3. 문자열, 정수형을 각 조건문에서 활용해보기
		String B = "Man";
		int b = 0;
		
		// 자바는 String을 비교할 때 equal()을 사용합니다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if(B.equals("Man")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 3) {
			System.out.println("b는 3입니다.");
		}else {
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(B.equalsIgnoreCase("man") && b == 0) {
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
		
		// 4. while문
		int k = 1, sum = 0;
		while(k <= 1000) {
			sum += k++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
		
		// 5. for문 : 초기화부분, 조건부분, 연산부분
		// final 변수 선언
		for(int i = N; i > 0; i--) {
			System.out.println("*");
		}
		
		// 6. for문으로 삼각형 출력하기
		for(int i = N; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 7. for문으로 원 출력하기
		// s^2 + y^2 = r^2
		for(int i = -N; i <= N; i++) {
			for(int j = -N; j <= N; j++) {
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
