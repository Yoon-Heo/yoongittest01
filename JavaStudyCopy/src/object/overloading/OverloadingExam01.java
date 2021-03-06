package object.overloading;

//--------------------------------------------------------------------
//	public class OverloadingExam01 
//--------------------------------------------------------------------
public class OverloadingExam01 {
	
	//--------------------------------------------------------------------
	// public static void main(String[] args) 
	//--------------------------------------------------------------------
	public static void main(String[] args) {
		Calculator calc 	= new Calculator();
		System.out.println(calc.plus(3, 3)); 
		System.out.println("calc.plus(3L, 3)의 결과 : " + calc.plus(3L, 3)); 
		System.out.println("calc.plus(3, 3L)의 결과 : " + calc.plus(3, 3L)); 
		System.out.println("calc.plus(3L, 3L)의 결과 : " + calc.plus(3L, 3L)); 
		
		int[] x	=	{100, 200, 300, 400, 500, 600};
		System.out.println("calc.plus(x)의 결과 : " + calc.plus(x));
		
	}	// End - public static void main(String[] args) 

}	// End - public class OverloadingExam01

//------------------------------
// Calculator
//------------------------------
class Calculator{							// 메서드 오버로딩(== 오버로딩) : 하나의 클래스에 같은 이름 메서드를 여러 개 정의하는 것
	int plus(int x, int y) {
		System.out.println("int plus(int x, int y) => ");
		return x + y;
	
	}
	long plus(int x, long y) {
		
		System.out.println("long plus(int x, long y) => ");
		return x + y;
	}
	
	long plus(long x, int y) {
		System.out.println("long plus(long x, int y) => ");
		return x + y;
	}
	
	long plus(long x, long y) {
		System.out.println("long plus(long x, long y) => ");
		return x + y;
	}
	
	int plus(int[] x) {		// 배열의 모든 요소를 더하여 결과를 돌려준다.
		System.out.println("int plus(int[] x) => ");
		int result = 0;
		for( int i=0 ; i<x.length ; i++ ) {
			result += x[i];
		
		}
		return result;
	}	
		
	
	
}	// End - Calculator


	
			
			
		