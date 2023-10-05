package Inheritance;

public class Main {

	public static void main(String[] args) {

		// Student클래스를 이용하여 변수 생성
		Student student1 = new Student("Maeve", 20, 165, 48, "20230302", 1, 4.5);
		Student student2 = new Student("Katherin", 25, 170, 50, "20230121", 4, 3.5);

		student1.show();
		student2.show();
	}

}
