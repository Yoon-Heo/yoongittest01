package object.block.instance;

//-----------------------------------------------------------------------------------------------------------
// public class InstanceBlock 
//-----------------------------------------------------------------------------------------------------------
public class InstanceBlock{
	
	{	// 인스턴스 초기화 블럭 : 생성자에서 공통적으로 수행되는 작업에 사용, 인스턴스가 생성될 때마다  실행(생성자보다 먼저!)
	     System.out.println("인스턴스 블럭이 실행됩니다.");
	}
	
	static {	// 스테틱(클래스 초기화) 블럭 : 클래스 변수의 복잡한 초기화에 사용, 클래스가 로딩돌 때 한번만 실행
		 System.out.println("클래스 블럭이 실행됩니다.");
		
	}

	public	InstanceBlock() {	// 생성자
		System.out.println("생성자가 실행됩니다.");   // 우선순위 : 블럭 > 생성자
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
        
		System.out.println("블럭 테스트 시작.....");
		InstanceBlock b1	=	new InstanceBlock();
		
		InstanceBlock b2	=	new InstanceBlock();
	}	// End - public static void main(String[] args)  

}	// End - public class InstanceBlock
