package object.tv1;

//-----------------------------------------------------------------------------------------------------------
//class Tv
//-----------------------------------------------------------------------------------------------------------
class Tv {
	// Tv의 속성(멤버변수)
	String		color;		// 색상
	boolean		power;		// 전원상태(on/off)
	int			channel;	// 채널
	int			volumn;		// 소리
	
	// Tv의 기능(메서드)
	void	power() 		{	power	= !power;	}	/* Tv를 켜거나 끄는 기능을 하는 메서드		*/
	void	channelUp()		{	++channel;			}	/* Tv의 채널을 1 올리는 기능을 하는 메서드	*/
	/* Tv의 채널을 1 내리는 기능을 하는  메서드	*/
	void	channelDown()	{	
		--channel;			
		System.out.println("채널을 내리는 기능을 작동합니다.");
	}	
	
} // End - class Tv

//-----------------------------------------------------------------------------------------------------------
// public class TvTest01
//-----------------------------------------------------------------------------------------------------------
public class TvTest01 {

	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		Tv t	= new Tv();
		System.out.println(t);
		
		t.channel = 6;
		System.out.println(t.channel);
		
		t.channelUp();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
	} // End - public static void main(String[] args) 

}	// End - public class TvTest01 
	
		

	
	