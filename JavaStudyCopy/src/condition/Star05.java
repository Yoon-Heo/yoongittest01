package condition;

public class Star05 {

	public static void main(String[] args) {
		// 별찍기
		/*
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 * 
		 * */
        
		/*for(int i = 0 ; i < 4 ; i++) {
        	for(int j = 0; j < 4-i ; j++) {
        		
        		System.out.print("★");
        	     
        	}
        	for(int k = 0 ; k< i ; k++) {
    		  	
    			System.out.print(" ");	
    		}
          System.out.println();
        }
        */
	
	    int lineNum = 4;
	    for(int line = 1 ; line <= lineNum ; line ++) {
	    	for(int col = 1 ; col <= lineNum - line +1 ; col++ ) {
	    		System.out.print("★");
	    		
	    	}
	    	System.out.println();
	    	
	    }
	
	
	
	
	
	}

}
