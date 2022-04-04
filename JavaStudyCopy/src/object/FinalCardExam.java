package object;

//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
// class Card2
//-----------------------------------------------------------------------------------------------------------
class Card2{
	final 	int 	NUMBER;	// 상수이지만 선언과 함께 초기화하지 않고,
	final 	String	KIND;	// 생성자에서 단 한번만 초기화할 수 있다.
	static 	int 	width	=	100;
	static	int		height	=	260;
	
	Card2(String kind, int num){	// 매개변수 있는 생성자
		KIND	= kind;
		NUMBER	= num;
	}

	Card2(){
		this("DIAMOND", 7);
		
	}
	
	public String toString() {			// toString : 오버라이딩 역할
		return "" + KIND + " : "  + NUMBER;
		
	}
	
}	// End - class Card2

//-----------------------------------------------------------------------------------------------------------
// public class FinalCardExam 
//-----------------------------------------------------------------------------------------------------------
public class FinalCardExam {
	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
			Card2 c = new Card2("CLOVER", 8);
			// c.NUMBER = 3;	//  Error! => final 선언된 변수 NUMBER은 값이 정해진 다음에는 변경 불가
			//c.width = 1000;
			System.out.println(c.width);
			System.out.println(c.height);
			System.out.println(c.KIND);
			System.out.println(c.NUMBER);
			System.out.println(c);
		

	}	// End - public static void main(String[] args) 

}	// End - public class FinalCardExam 
