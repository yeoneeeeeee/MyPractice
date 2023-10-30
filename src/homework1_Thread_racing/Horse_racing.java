package homework1_Thread_racing;

public class Horse_racing{

	public static void main(String[] args) {

		Horse1 horse1 = new Horse1();
		Horse1 horse2 = new Horse1();
		Horse1 horse3 = new Horse1();
		horse1.goal();
		horse2.goal();
		horse3.goal();
		
		double random = Math.random();
		int j = (int)((random *50)+1);
		
		while(random == 50) {
			for(int i = 0; i<j; i++) {
				if(random/3 == 0) {
					System.out.println(horse1 + "번 말 우승!!");
				}else if(random/3 == 1) {
					System.out.println(horse2 + "번 말 우승!!");
				}else if(random/3 == 2) {
					System.out.println(horse3 + "번 말 우승!!");
				}
			}
			break;
		}
	}
}
