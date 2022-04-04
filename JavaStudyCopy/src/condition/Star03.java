package condition;

public class Star03 {

	public static void main(String[] args) {
		/*
		 * 별 그리기
		 *      ★
		 *     ★★
		 *    ★★★
		 *   ★★★★
		 *  
		 *                          */
        /* 
		for(int i = 1 ; i < 5 ; i++) {
        	for(int j = 1; j < 5-i ; j++) {
        		
        		System.out.print(" ");
        	     
        	}
        	for(int k = 0 ; k< i ; k++) {
    		  	
    			System.out.print("★");	
    		}
          System.out.println();
        }
		*/
		
	    
		
		int lineNumber = 4;
	    for(int i = 1 ; i<=lineNumber ; i++ ) {   // 세로방향
	    	for(int j = lineNumber ; j>0 ; j-- ) {  // 가로방향
	    		
	    		if(j > i) System.out.print("  ");
	    		else           System.out.print("★");
	    	}
	    	System.out.println();
	    }
	     
	}

}
