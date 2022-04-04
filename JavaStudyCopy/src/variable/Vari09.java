package variable;

public class Vari09 {

	public static void main(String[] args) {
		int numOfApples = 127; // 내가 가진 사과의 갯수
		int sizeOfBucket = 10; // 바구니에 담을 수 있는 사과개수
	
	    int numOfBucket = 0; // 바구니의 개수

	    numOfBucket = numOfApples / sizeOfBucket 
	    		      + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
	    
	    System.out.println("사과를 담은 바구니의 갯수 : " + numOfBucket);
	
	}

}
