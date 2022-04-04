package variable;

public class Vari04 {

	public static void main(String[] args) {
		// 증감 연산자
		// x++; 와 x = x + 1; 는 같은 표현.
		int x = 5; int y = 0;
 	    // x++; x의 값을 변화시키기 전에 계산한 후에 x값을 증가시킨다.
		y = x++;               // y먼저 5 대입 => x+1 출력
		
 	    System.out.println(x); 
 	    System.out.println(y); 
 	    
 	    // int x = 5; int y = 0; <= 중복오류
        x = 5; y = 0; 	    
        // ++x; x값을 먼저 증가시키고, 증가한 값을 가지고 계산
        y = ++x;              // x먼저 6 대입 => y=6
        
        System.out.println(x); 
 	    System.out.println(y);
	}
        
}
