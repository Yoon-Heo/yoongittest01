package array;

import java.util.Scanner;
import java.util.Random;

public class Baseball01 {

	public static void main(String[] args) {
		// 숫자로 하는 야구게임
		
		//------------------------------------------------
		// 필요한 변수
		//------------------------------------------------
		Scanner in	   = new Scanner(System.in);
		Random	r	   = new Random();
		int[]	com    = new int[3];
		int[]	user   = new int[3];
		int		strike = 0;
		int		ball   = 0;
		int     count  = 0;
		boolean exitFlag = true;
		
		while(exitFlag) { 
		
		//------------------------------------------------
		// 방법1 문제 : 중복되지 않게 랜덤한 숫자를 3개 뽑는다(1 ~ 9)
		//------------------------------------------------
			/*
			com[0]	= r.nextInt(9) + 1; // com[0] 자리에 1~9사이의 랜덤한 수를 추출하여 저장한다.
			com[1]	= r.nextInt(9) + 1; // com[1] 자리에 1~9사이의 랜덤한 수를 추출하여 저장한다.
			while(com[0] == com[1]) { // 앞의 방과 같은 수가 나오면, 틀릴때까지 계속 추출한다.
				com[1] = r.nextInt(9) + 1; 
			} // 첫번째 방의 값과 두번째 방의 값이 다를 경우만 반복문을 벗어날 수 있다.
			
			com[2]  = r.nextInt(9) + 1;  // com[2] 자리에 1~9사이의 랜덤한 수를 추출하여 저장한다.
			while(com[2]==com[0] || com[2]==com[1]) {
				com[2] = r.nextInt(9) + 1;
			}	
				
				
			
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
			exitFlag = false;  // 탈출
			*/
			
		//------------------------------------------------	
		// 방법2 문제 : 중복되지 않게 랜덤한 숫자를 3개 뽑는다(1 ~ 9)
		// for문 2개를 사용하여 문제를 중복되지 않게 추출해보자.
	    // now : 새롭게 찾은 방번호
		// old : 지금 추출한 번호 이전에 찾은 방번호	
		//------------------------------------------------
			for(int now=0 ; now < com.length ; now++) {
			     com[now] = r.nextInt(9) + 1;
			     for(int old = 0; now > 0 && old < now; old++) {  // 현재 뽑은 방의 값과 앞방들하고만 비교하면 된다.
			       // 현재 뽑은 값과 앞방에 있는 값과 같은 것이 있으면
			       if(com[now] == com[old]) {
			    	    now--;  // 밖의 for문의 증감값을 하나 줄이면 다시 뽑는 효과를 낸다.                            
			       }    	 
			     } 
			     
			}
			
			 System.out.println(com[0] + ", " + com[1] + ", " + com[2]);    	 
			exitFlag = false;    	 
			                
			
			 	 
			 
			
		
		// 게임준비가 모두 끝났으므로 게임을 시작한다.
		while(true) {
			strike	= 0;    // 맞춘 개수
			ball	= 0;	// 틀린 개수
			
		//------------------------------------------------
		// 정답맞추기 : 3개의 숫자를 중복되지 않게 입력한다.
		//------------------------------------------------   
		for(int i=0 ; i<3 ; i++) {
			System.out.print((i+1) + "번째 수를 입력하십시오 : ");
			user[i] = in.nextInt();
			// 1부터 9 사이 값이 아니면 다시 입력하도록 한다.
			
			if(user[i] > 9 || user[i] < 1) {
		     System.out.println("1부터 9사이의 값을 입력하셔야 합니다. 다시 입력해주세요.");
			 --i;
			 continue;
			}
		} 
		// 입력한 숫자가 중복이 되면 다시 입력하게 한다.	
		if(user[0] == user[1] || user[0] == user[2] || user[1] == user[2])	{
			System.out.println("똑같은 값이 입력되었습니다.");
			continue;
		}
		
		count++;  // 게임 횟수를 증가시킨다.
		System.out.println("게임 횟수 : " + count);
		//------------------------------------------------
		// 정답 판별
		//------------------------------------------------  	
		for( int i=0 ;i<user.length ;i++ ) {
			for(int j=0 ;j<3 ; j++ ) {
				if(i==j) {  // 똑같은 위치의,
				if(com[j] == user[i]) { // 값이 같으면
				  strike++;	
				}  else
				     ball++;
				}
			}
			
		}
		   // 3개를 모두 맞추면 프로그램 종료
		   if(strike == 3) {
			   System.out.println("홈런입니다.");
			   System.out.println("게임을 종료하려면 0을, 계속하시려면 아무 숫자나 입력하세요 : ");
			   if(in.nextInt()==0)	exitFlag = false;  // 외부 while(exitFlag)를 벗어나기 위해서
			   break;  // 내부 while()을 벗어나기 위해서
		   } else {
			   System.out.println(strike + "스트라이크 " + ball + "볼");
		   }
		   // 다시 3개의 숫자를 중복되지 않게 입력한다.
		
		}   //	End - while()_inner

		
		}   // End - while(exitFlag)_outer
		
	}

}
			
			
