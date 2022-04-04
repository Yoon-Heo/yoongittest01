package array;

import java.util.Scanner;

public class Lotto02 {

	public static void main(String[] args) {
		// 사용자가 번호를 중복되지 않게 1~45 사이의 숫자를 입력한다.
		
		int[] user = new int[6];
		int[] lotto = new int[6];
		
		Scanner in = new Scanner(System.in);
		
		for( int i=0 ; i<user.length ; i++ ) {
		   System.out.println((i+1) + "번째 수를 입력하세요 : " );	
		   user[i] = in.nextInt();
		   if(user[i] < 1 || user[i] >= 46) {
			   System.out.println("1부터 45까지의 값을 입력하셔야 합니다.");
			   i--;
			   continue;
		   }
		}   
		
		
		
		
		
		// 로또번호를 오름차순으로 보여주자!
		
		for(int now = 0; now < lotto.length; now++) {
			lotto[now] = (int)(Math.random() * 45) + 1;
			// 중복된 수가 있으면 다시 추출한다.
			// now 가 0 인 경우는 비교할 대상이 없으므로, 비교에서 제외시킨다.
			for(int old = 0; now > 0 && old < now; old++) {
				if(lotto[old] == lotto[now]) { // 지금 추출한 번호가 앞에서 뽑은 번호가 같으면
					now--; // 추출작업을 다시한다.
				}
			}
		}
		
		System.out.println();
		
		for(int i=0 ; i<lotto.length-1 ; i++ ) {
			for(int j=0 ; j<lotto.length-1-i  ; j++) {
				if(lotto[j] > lotto[j+1]) {
						int		temp	= lotto[j];
						lotto[j]		= lotto[j+1];
						lotto[j+1]		= temp;
				}
			}
		}			
		for(int i=0 ; i<lotto.length ; i++ )
		System.out.print(lotto[i] + ", ");	
		
		System.out.println();
		
		
		// 사용자가 입력한 번호도 오름차순으로 보여주자!
		
		for(int i=0 ; i<user.length-1 ; i++ ) {
			for(int j=0 ; j<user.length-1-i  ; j++) {
				if(user[j] > user[j+1]) {
						int		temp	= user[j];
						user[j]		= user[j+1];
						user[j+1]		= temp;
				}
			}
		}			
		for(int i=0 ; i<user.length ; i++ )
		System.out.print(user[i] + ", ");	
		System.out.println();
		
		// 맞춘 개수가 몇 개인지 보여주자!	
		int count 	= 0;
		for(int i=0 ; i < lotto.length ; i++ ) {
			for(int j=0 ; j < user.length ; j++ ) {
				if(lotto[i] == user[j]) {
					count++;
				}else continue; 
			}
		}

	System.out.println("당신은 " + count + "개 맞추었습니다!");
	
	}	// End - public static void main(String[] args)

}	// End - public class Lotto02	
				
			
		
		
		
		
	
