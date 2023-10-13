package Interface;

public class Main implements Dog, Cat {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.two();
		main.one();

	}

	@Override
	public void crying() {
		System.out.println("월! 월!");
	}

	@Override
	public void two() {
		System.out.println("two");
		
	}

	@Override
	public void one() {
		System.out.println("one");		
	}

}