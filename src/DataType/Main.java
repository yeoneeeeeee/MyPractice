package DataType;

public class Main {

	public static void main(String[] args) {

		// 1. 정수 변수 안에 실수를 넣으면 정수 부분만 변수에 저장됨.
		// 실수형을 정수로 형변환 (소수점 뒷부분 제거됨)
//		int a = (int) 0.5;
//		System.out.println(a);
		
		// 2-1. 반올림 되는 경우
		double b = 0.5;
		int a = (int) (b + 0.5);
		System.out.println(a);
		
		// 2-2. 반올림 안되는 경우
		double c = 0.4;
		int d = (int) (c + 0.5);
		System.out.println(d);
		
		
		// 자료형 활용하기
		for(char i = 'a'; i <= 'z'; i++ ) {
			System.out.print(i + " ");
		}
		
		// 10진수 8진수, 16진수로 바꾸어 출력하기
		int e = 200;
		System.out.println("10진수 : " + e);
		System.out.format("8진수 : %o\n", e); // \n : 한칸 줄바꿈
		System.out.format("16진수 : %x\n", e);
		
		
		// String 출력하기
		String name = "yeonee";
		System.out.println(name);
		// substring (a, b) : a번째 문자부터 b번째 문자전까지 출력
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 5));
		System.out.println(name.substring(4, 6));

	}

}
