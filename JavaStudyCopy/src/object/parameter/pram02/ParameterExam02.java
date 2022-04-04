package object.parameter.pram02;

//--------------------------------------------------------------------
// class Data
//--------------------------------------------------------------------
class Data{
    int x;
}	// End - class Data
	

//--------------------------------------------------------------------
// public class ParameterExam02 
//--------------------------------------------------------------------
public class ParameterExam02 {
	//--------------------------------------------------------------------
	// public static void main(String[] args) 
	//--------------------------------------------------------------------
	public static void main(String[] args) {
		Data d = new Data();
		d.x	   = 10;
		System.out.println("main() : x=> " + d.x);   	// d.x => 10
		
		System.out.println("main() d의 값은" + d);
		change(d);
		
		System.out.println("After change(d)");
		System.out.println("main() : x => " + d.x);
	} // End - public static void main(String[] args)

	//--------------------------------------------------------------------
	// 
	//--------------------------------------------------------------------
	static void change(Data d) {		// 참조형 매개변수 - read & write
		System.out.println("change() d의 값은 " + d);
		System.out.println("Before change() x => " + d.x);	// d.x => 10
		d.x = 1000;
		System.out.println("change() x => " + d.x); // d.x => 1000
	}	// End - static void change(Data d)
		
}	// End - public class ParameterExam02	
	

