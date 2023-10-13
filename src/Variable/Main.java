package Variable;

public class Main {

	// 2. 상수는 메인 함수 바깥에 선언되며, final은 한번 선언되면 값이 바뀔수 없다는 즉, 상수라는 것입니다. 
	final static double PI = 3.141592;
	
	// 3. 임의의 가장 큰 수를 상수로 설정
	final static int INT_MAX = 21478367;
	
	public static void main(String[] args) {

		// 1. 각각의 변수 선언 및 초기화
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "yeonee";
		
		// 각각의 변수 출력하기
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		
		// 2. 변수의 쓰임 (final)
		// r : 반지름
		int r = 30;
		System.out.println("원의 넓이 : " + r * r * PI);
		
		
		// 3. 오버플로
		int a = INT_MAX;
		System.out.println(a);
		System.out.println(a + 1);
		
		
		// 4. 사칙연산 프로그램
		int b = 1;
		int c = 2;
		
		System.out.println("b + c = " + (b + c));
		System.out.println("b - c = " + (b - c));
		System.out.println("b * c = " + (b * c));
		System.out.println("b / c = " + (b / c));
		System.out.println("b % c = " + (b % c));
	}

}
