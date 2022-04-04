package object.superc.super2;

//------------------------------------------------------------------------------------------
// class Parent
//------------------------------------------------------------------------------------------
class Parent{
	int x = 10; //  <== super.x
	
}	// End - class Parent

//------------------------------------------------------------------------------------------
// class Child extends Parent
//------------------------------------------------------------------------------------------
class Child extends Parent{
	 int x = 20;
	
	void method() {

		System.out.println("x => " + x);
		System.out.println("this.x => " + this.x);			// this : 인스턴스(child) 자신의 생성자를 나타내는 참조변수
		System.out.println("super.x => " + super.x);		// super : 조상 클래스에서 생성자 가리킴.
	}	
	
} // End - class Child extends Parent


//------------------------------------------------------------------------------------------
// public class SuperExam 
//------------------------------------------------------------------------------------------
public class SuperExam {
	
	//------------------------------------------------------------------------------------------
	// public static void main(String[] args) 
	//------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
			Child c = new Child();
			c.method();
		
		
	}	// End - public static void main(String[] args) 

}	// End - public class SuperExam 
