package object.block.instance;

//-----------------------------------------------------------------------------------------------------------
// public class StaticBlock 
//-----------------------------------------------------------------------------------------------------------
public class StaticBlock {

	static int[]	arr	=	new int[10];	// 클래스 변수 명시적 초기화
	
	static {	// 스테틱(클래스 초기화) 블럭
		
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]); // ==> arr 배열 0 초기화
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]	=	(int) (Math.random() * 10) + 1;	// arr 배열에 1~10의 데이터 저장
			
		}
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args) 
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
			for( int i = 0 ; i < arr.length ; i++ ) {
				System.out.println("arr[" + i + "] : " + arr[i]);	// ==> 실제 배열 데이터 출력
			}	
			
	}	// End - public static void main(String[] args) 

}	// End - public class StaticBlock
