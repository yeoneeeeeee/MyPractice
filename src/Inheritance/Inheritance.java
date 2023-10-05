package Inheritance;

public class Inheritance {

	public class ParentClass {
		String parent = "I am parent";
	
		public void Parent() {
			System.out.println("I am Parent Method() in Parent Class");
		}
	}
	
	public class ChildClass extends ParentClass { // ParentClass 상속받음
		String child = "I am child";
		
		public void Child() {
			Parent(); // Parent메소드 호출 (실행1)
			System.out.println(parent); //(실행2)
			// 위와 같은 자식클래스는 부모클래스의 메소드를 호출하고, 부모 필드를 사용할 수 있다. 
			// 즉, 상속을 통해 자식클래스는 부모클래스의 속성을 그대로 물려받아 사용할 수 있다.
			System.out.println("I am Child Method() in ChildClass"); // (실행3)
			System.out.println(child); // (실행4)
		}
	}
	
	public static void main(String[] args) {
		Inheritance inheritance = new Inheritance();
		ChildClass cc = inheritance.new ChildClass();
		cc.Child();
	}

}