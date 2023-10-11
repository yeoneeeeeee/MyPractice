package Polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. 다형성의 기본원리
		// 부모 클래스에 변수로서 자신의 자식 클래스의 인스턴스를 넣어줄 수 있다.
		// Peach라는 인스턴스를 자신의 fruit 변수에 넣어줄 수 있다. 
		// 그리고 참조변수를 이용하여 show 함수 호출할 수 있다.
		//Fruit fruit = new Melon();
		//fruit.show();
		
		
		// 2. 다형성 활용해보기
		// scanner 라이브러리 import 해주기
		Scanner scanner = new Scanner(System.in);
		System.out.print("메론 : 1, 복숭아 : 2 ?");
		// int형으로 input을 받아올 것임
		int input = scanner.nextInt();
		// Fruit 미리 선언해주기
		Fruit fruit;
		// 조건식에 따라 출력될 내용 다르게 코드만들기
		if(input == 1) {
			fruit = new Melon();
			fruit.show();
		}else if(input == 2) {
			fruit = new Peach();
			fruit.show();
		}
	}
}
