package Final;

public class Main {

	// 오버라이딩
	public void show() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {

		// final 사용한 변수 다뤄보기
		final int number = 10;
		// number = 5;
		System.out.println(number);
		
		
		System.out.println("---------------------------");
		
		
		// final 사용한 메소드 다뤄보기
		Main main = new Main();
		main.show();
		
		
		System.out.println("---------------------------");

		
		// final 사용한 클래스 다뤄보기
		
	}

}
