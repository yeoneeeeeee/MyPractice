package homework1_Thread_racing;

public class Horse {

	String name = "";
	int position = 50;
	String winner = "";  
	static int count = 1;
	
	public Horse(String name, int position, String winner) {
		super();
		this.name = name;
		this.position = position;
		this.winner = winner;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Horse.count = count;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "Horse [name=" + name + ", position=" + position + "]";
	}

	public Horse(String name, int position) {
		this.name = name;
		this.position = position;
	}

}
