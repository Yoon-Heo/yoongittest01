package condition;

public class Cond17 {

	public static void main(String[] args) {
		// while()문을 사용하여 구구단을 만들어보자.

        int x = 1;
        while(x<=9) {
        	int y = 1;
        	while(y<=9) {  	        
  	            System.out.print(x + "x" + y + "=" + (x*y) + "\t");        
            	y++;
           }
           x++;
           System.out.println();
	    }    
     }
	
}
