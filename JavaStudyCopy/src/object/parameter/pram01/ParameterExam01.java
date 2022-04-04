package object.parameter.pram01;

//--------------------------------------------------------------------
// class Data
//--------------------------------------------------------------------
class Data {
	int x;
	
}

//--------------------------------------------------------------------
// public class ParameterExam01
//--------------------------------------------------------------------
public class ParameterExam01 {
	
	
	//--------------------------------------------------------------------
	// public static void main(String[] args)
	//--------------------------------------------------------------------
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x => " + d.x);
		change(d.x);	// ParameterExam01.change(d.x); 매개변수 'x' 대입
		System.out.println("After change(d.x)");
		System.out.println("main() : x => " + d.x);
		
	}	// End - public static void main(String[] args) 
		
	//--------------------------------------------------------------------
	// static void change(int x)
	//--------------------------------------------------------------------
	static void change(int x) {	// 기본형 매개변수 - read only
		System.out.println("Before change() : x => " + x);	// x => 10
		x = 1000;
		System.out.println("change() : x =>" + x);	// x => 1000
	}	// End - static void change(int x)
	
}	// End - public class ParameterExam01	
	

	
