package array;

public class TodayDinner01 {

	public static void main(String[] args) {
		// 컴퓨터가 추천하는 저녁 메뉴
		String[] menu = {
				"김치찌개" , "볶음밥" , "자장면" , "돈까스" , "순댓국",
				"초밥" , "족발보쌈" , "삼겹살" , "떡볶이" , "우동" 
		};
		
        int num = 0;
        /*
        for(int i ; i<100 ; i++ ) {
        	num = (int)(Math.random() * menu.length);
        	System.out.println(menu[num]);
        	
        }
		*/
		
        // 저녁식사 메뉴를 랜덤하게 추천하자! (1개만)
	    System.out.println("오늘의 추천 저녁식사는 " + menu[num] + "입니다.");
	
	    System.out.println("오늘의 추천 저녁식사는 " + menu[(int)(Math.random() * menu.length)] + "입니다.");
	}
	
	

}
