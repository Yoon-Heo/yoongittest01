package condition;

public class Cond12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
		int i;
        
		for( i = 1 ; i <= 10  ; i++) {
           sum += i;  // sum = sum + i;
           System.out.println(i);			
	    }
		System.out.println("1부터" + (i-1) + "까지의 합 : " + sum);
		
	}

}
