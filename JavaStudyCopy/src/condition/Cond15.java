package condition;

public class Cond15 {

	public static void main(String[] args) {
		// 1단부터 9단까지 구구단을 출력해보세요.
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(i + "단");
			for(int j = 1 ; j <= 9 ; j++ ) {		 
            System.out.println(i + "*" + j +  " = " + i * j );          
 	       
           }
           System.out.println();
           
		}
	}
}