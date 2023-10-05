package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Student클래스를 이용하여 변수 생성
		Student student1 = new Student("Maeve", 20, 165, 48, "20230302", 1, 4.5);
		Student student2 = new Student("Katherin", 25, 170, 50, "20230121", 4, 3.5);

		student1.show();
		student2.show();
		
		Teacher teacher1 = new Teacher("Sophia", 29, 175, 52, "ABC201", 3000000, 5);
		teacher1.show();
		
		// 배열
		Student[] students = new Student[100];
		for(int i = 0; i < 100; i++) {
			students[i] = new Student("Maeve", 20, 165, 48, i + "", 1, 4.5);
			students[i].show();
		}
		
		// 사용자로부터 학생정보를 입력받아 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까?");
		int number = scan.nextInt();
		Student[] students2 = new Student[number];
		for(int i = 0; i < number; i++) {
			String name;
			int age; 
			int height; 
			int weight; 
			String studentID; 
			int grade; 
			double gPA;
			
			System.out.println("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.println("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.println("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.println("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.println("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.println("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.println("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			
			// 입력된 원소인 학생정보 studens2배열에 담아주기
			students2[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i < number; i++) {
			students2[i].show();
		}
	}

}
