package object.exception;

public class Exception06 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			// 예외가 발생하면 catch 블럭을 실행한다.
			System.out.println(4);
		} catch(Exception e) {
			
			System.out.println(5);
		}
		
		System.out.println(6);
		

	}

}
