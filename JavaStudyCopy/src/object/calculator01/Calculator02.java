package object.calculator01;

//-----------------------------------------------------------------------------------------------------------
//class Calc
//-----------------------------------------------------------------------------------------------------------
class Calc {
	int plus(int num1, int num2)		{	return num1 + num2;	}	// 반환값이 있는 매서드는 모든 경우에 리턴값이 있어야 함.
	int minus(int num1, int num2)		{	return num1 - num2;	}
	int multiply(int num1, int num2) 	{	return num1 * num2;	}
	int	divide(int num1, int num2)		{	return num1 / num2;	}
}	// End - class Calc 

//-----------------------------------------------------------------------------------------------------------
// public class Calculator02
//-----------------------------------------------------------------------------------------------------------
public class Calculator02 {
	
	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Calc calc = new Calc();
		int	result1 = calc.plus(10, 3);	// 매서드 호출 : 참조변수.매서드이름(값1, 값2...)
		int	result2	= calc.minus(10, 3);
		int	result3	= calc.multiply(10, 3);
		int	result4	= calc.divide(10, 3);
		
		System.out.println("더하기 : " + result1);
		System.out.println("빼  기 : " + result2);
		System.out.println("곱하기 : " + result3);
		System.out.println("나누기 : " + result4);
		
	}	// End - public static void main(String[] args) 

}	// End - public class Calculator02 
