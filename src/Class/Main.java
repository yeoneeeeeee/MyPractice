package Class;

public class Main {

	public static void main(String[] args) {

		// 해당 코드가 실행되면 Node.java의 생성자가 실행됨
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		
		// one이라는 인스턴스를 실행(Node생성자 실행)하여, getCenter메소드가 two(Node other)라는 값을 받아서 
		// 해당 getCenter메소드를 실행해서 one, two의 정중앙값을 구한 것이 result(one,two의 정중앙 x,y좌표값)에 담긴다. 
		Node result = one.getCenter(two);
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
	}

}