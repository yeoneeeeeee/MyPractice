package Class;

public class Node {
	// 좌표 x, y 변수
	// 변수에 직접 접근할 수 없도록 private 접근제한자 사용(기본적인 보안)
	private int x;
	private int y;
	
	// 변수를 공동으로 쓸 수 있게 함수생성
	public int getX() {
		return x;
	}
	
	// 변수의 값을 바꾸는 함수생성
	// 자신(this)을 다른 값으로 받아주겠다.
	public void setX() {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY() {
		this.y = y;
	}
	
	// 생성자 (class와 동일한 이름을 가짐)
	// 고유한 변수 x, y의 속성을 초기화 함
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		// Node other이라는 다른 좌표를 매개변수로 줌
		// (자신 좌표의 값 + 다른 좌표의 값) / 2 => 정중앙의 좌표 값 식을 만들어줌
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY() / 2));
	}
}