package condition;

public class Cond25 {

	public static void main(String[] args) {
		// 2개의 주사위를 던졌습니다. 
		// 눈의 합이 6이 되는 모든 경우의 수를 출력하세요.
		// 1 + 5, 2 + 4, 3 + 3, 4 + 2, 5 + 1
		// 2개의 for문을 사용하여 문제를 풀어봅시다.
		
		//System.out.println("주사위의 합이 6이 되는 모든 경우의 수는, ");
		
		/*for( int i = 1 ; i <= 5 ; i++) {
              for(int j = 6-i ; j >= 1 ; j--) {		

 	              System.out.print(j + " + ");
 	              break;
              }
           System.out.println(i); 
           
        }  내가 푼 것 */
	
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j<=6 ; j++) {
				if(i + j == 6)   // 두 눈의 합이 6인 것만 화면에 보이면 된다.
					System.out.println(i + " + " + j + " = " + (i + j));
				
		    }
			
		}
		
		
		//System.out.println("입니다.");
    }
}
