package array;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number     = new int[10];
		int[] counter    = new int[10];
		
		for(int i = 0 ; i < number.length ; i++ ) {
			// 0~9 사이의 랜덤한 정수를 추출하자.
			 int r  =(int)(Math.random() * 10);
			 // 추출한 값을 number방에 저장하자.
			number[i] = r;
			
			
		}	
		
		
		System.out.println();
		// 각 방에 들어있는 숫자를 출력한다.
		
		for(int i = 0 ; i < number.length ; i++ ) {
			System.out.print(number[i] + ", ");
			
		}
		
		System.out.println();
		
		// 각 숫자는 종류별(0~9)로 몇개인가요?
		/*
		counter[0] = ;
		counter[1] = ;
		counter[2] = ;
		.....
		*/
		// number방에 있는 숫자들이 숫자별(0~9)로 총 몇개씩 있나요?
		
		for(int i = 0 ; i < counter.length ; i++) {
			// counter[정수형 값 또는 정수형 변수]
			counter[number[i]] = counter[number[i]] + 1;
			counter[number[i]]++;
		}
		
		
		
		/*
		for(int i = 0 ; i < number.length  ; i++) {
			counter[number[i]]++;
		}
		*/
		
		// 각 숫자의 종류별 갯수를 보여준다.
		for(int i=0 ; i < counter.length ; i++ ) {
			
			System.out.println(i + "의 갯수 : " + counter[i]);
		}
	}

}	
		
	
