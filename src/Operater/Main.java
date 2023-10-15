package Operater;

public class Main {

	// 1. 초를 입력 받아 몇분 몇초인지 계산하는 프로그램
	final static int SECOND = 1000;
	
	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		
		// 2. ++와 --연산 프로그램 (증감 연산자)
		int a = 10;
		System.out.println("현재 a는" + a + "입니다.");
		a++;
		System.out.println("현재 a는" + a + "입니다.");
		System.out.println("현재 a는" + ++a + "입니다.");
		// ++a : 먼저 a+1값이 구해진 후 출력
		System.out.println("현재 a는" + a + "입니다.");

		System.out.println("현재 a는" + a++ + "입니다.");
		// a++ : 출력된 이후에 빠져나가면서 증가
		System.out.println("현재 a는" + a + "입니다.");
		
		
		// 3. %연산자 프로그램
		// a를 b로 나누고 난 '나머지값' 출력
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		
		
		// 4. ==, >, <, &&, ||, ! 연산 프로그램
		int b = 50;
		int c = 50;
		System.out.println("b와 c가 같은가요? " + (b == c));
		System.out.println("b가 c보다 큰가요? " + (b > c));
		System.out.println("b가 c보다 작은가요? " + (b < c));
		System.out.println("b가 c보다 큰가요? " + ((b == c) && (b > c)));
		System.out.println("b와 50이 아닌가요? " + !(b == 50));
		
		
		// 5. '조건 ? 참 : 거짓' 연산 프로그램
		int x = 50;
		int y = 60;
		System.out.println("최댓값은" + max(x,y) + "입니다.");
		
		
		// 6. pow()를 이용한 거듭제곱 연산 프로그램
		double f = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱은" + (int) f + "입니다.");
		
	}

	// 5. 먼저 max 함수 만들기 -> 함수 사용하려면 static 붙여주어야 함.
	// '반환형, 함수 이름, 매개변수' 로 구성됨
	static int max(int d, int e) {
		int result = (d > e) ? d : e; // 삼항연산자 활용
		return result;
	}
}
