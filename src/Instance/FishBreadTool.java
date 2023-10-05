package Instance;

public class FishBreadTool {

    // member variable

    private String name;   // 붕어빵의 이름

    private int flour;     // 밀가루반죽의 양

    private int redbean;    // 팥의 양

    // Constructor

    public FishBreadTool ( String iname, int iflour, int iredbean ){

            name = iname;

            flour = iflour;

            redbean = iredbean;

            bake();

    }

    // memeber method

    public void bake(){

            System.out.println(name + " 붕어빵이 만들어 졌습니다.^^");

    }
}