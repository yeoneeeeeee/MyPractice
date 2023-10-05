package Abstract;

public class Main extends Player {

	public static void main(String[] args) {
	
		// static메서드에서 인스턴스메서드를 사용하려면 인스턴스를 생성 후 사용할 수 있다.
		Main main = new Main();  
		main.play("The Luckiest - Ben Folds");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		System.out.println(songName + " 곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}
}
