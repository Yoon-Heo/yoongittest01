package object.exception;

public class Exception01 {

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = 3;
		System.out.println(x + " 나누기 " + y + "의 몫은 " + (x/y) + "이고, 나머지는 " + (x%y) + "입니다.");
		
		x = 10;
		y = 0;		// 예외상황 발생 : 0으로 나눌수 없음
		System.out.println(x + " 나누기 " + y + "의 몫은 " + (x/y) + "이고, 나머지는 " + (x%y) + "입니다.");
		
		
	}

}
