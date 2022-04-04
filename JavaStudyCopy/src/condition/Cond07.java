package condition;

public class Cond07 {

	public static void main(String[] args) {
	
        // 1~10사이의 임의의 정수를 추출한다.
		int score = (int)(Math.random() * 10) + 1; 		

		score *= 100; // score = score * 100; 
		
		String msg = "당신의 점수는 " + score + "점이고, 상품은 ";    
		
		System.out.println("score : " + score);
		
		switch(score * 100) {
		    case 100:
		    	msg += "연필";
		       break;
		    
		    case 200:
		    	msg += "자전거";
		    	break;	    
		    
		    case 300:
		    	msg += "노트북";
		        break;
		    
		    case 400:
		    	msg += "자동차";
		        break;
		    
		    default:
		    	System.out.println("다음 기회에.....");
		    	msg += "꽝";
		
		     }   // End - switch
    	
		     System.out.println(msg + "입니다.");
	
	} // End - public static void main(String[] args)

} // End - public class Cond7

