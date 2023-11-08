package homework1_Thread_racing;

import java.util.Random;

public class Horse_racing extends Thread {

	public static void main(String[] args) {

		Horse_racing horse_racing = new Horse_racing();
		horse_racing.start();

	}

	@Override
	public void run() {
		int numHorses = 3; // 말의 수
		int position = 5;
		String winner;

		// horse 쓰레드 생성
		Horse horse1 = new Horse("1번말", 0);
		Horse horse2 = new Horse("2번말", 0);
		Horse horse3 = new Horse("3번말", 0);

		while (true) {
			int random = (int) (Math.random() * 10);
			int number = random % 3;

			switch (number) {
			case 1:
				horse1.setPosition(horse1.getPosition() + 1);
				break;
			case 2:
				horse2.setPosition(horse2.getPosition() + 1);
				break;
			default:
				horse3.setPosition(horse3.getPosition() + 1);
				break;
			}

			// 조건문에 해당하는 horseName 출력
			System.out.println(horse1);
			System.out.println(horse2);
			System.out.println(horse3);

			if (horse1.getPosition() >= position || horse2.getPosition() >= position
					|| horse3.getPosition() >= position) {
				
				finishLine(horse1, horse2, horse3);
				if (horse1.position == position)
					winner = horse1.getName();
				else if (horse2.position == position)
					winner = horse2.getName();
				else
					winner = horse3.getName();

				System.out.println(winner + " 우승");
				break;
			}

			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void finishLine(Horse horse1, Horse horse2, Horse horse3) {
		finishLine(horse1);
		finishLine(horse2);
		finishLine(horse3);
	}

	public void finishLine(Horse h) {

		int n = h.position;

		String space = " ";
		String spaceSum = "";

		for (int i = 0; i < n; i++) {
			spaceSum += space;
		}

		System.out.println(h.name + ":" + spaceSum + h.name);

	}
}