package object.phonebook.v1;

//-----------------------------------------------------------------------------------------------------------
// class PhoneInfo 
//-----------------------------------------------------------------------------------------------------------
class PhoneInfo{
	String	name;			// 이름
	String	phoneNumber;	// 전화번호
	String	birth;			// 생년월일
	

	public PhoneInfo(String name, String num, String birth) {
		this.name	= name;
		phoneNumber	= num;
		this.birth	= birth;
	}

	public PhoneInfo(String name, String num) {
		this.name	= name;	
		phoneNumber	= num;
		this.birth	= null;
	}

	public void showPhoneInfo() {
		System.out.println("------------------------------------------------------------");
		System.out.println("이   름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		if(birth != null)
			System.out.println("생년월일 + " + birth);
	}

	static int count = 0 ;
	int personCount = 0;
	{
		count++;
		personCount	=	count;
		
	}
	
	
}

//-----------------------------------------------------------------------------------------------------------
// public class PhoneBook01 
//-----------------------------------------------------------------------------------------------------------
public class PhoneBook01 {

	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args) 
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
	 
		PhoneInfo	pi1	=	new PhoneInfo("고길동", "010-1234-5678", "1997.12.31");
		PhoneInfo	pi2	=	new PhoneInfo("향단이", "010-1111-2222");
		PhoneInfo	pi3	=	new PhoneInfo("허 윤", "010-2206-6258", "1995.06.18"); 
		
		pi1.showPhoneInfo();
		pi2.showPhoneInfo();
		pi3.showPhoneInfo();
		
		System.out.println("현재 인원수 : " + PhoneInfo.count);
		
		
	} // End - public static void main(String[] args) 

}	// End - public class PhoneBook01 
