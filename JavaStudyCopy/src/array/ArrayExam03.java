package array;

public class ArrayExam03 {

	public static void main(String[] args) {
		// arr 배열안에 있는 모든 값의 합계와 평균을 구하십시오.
       
		int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	    int sum = 0;
        int avg = 0;
	 
        for(int i=0 ; i<arr.length ; i++ ) {
        	sum += arr[i];
        	
        }
        avg = sum / arr.length;
        
        System.out.println("합계_" + sum);
        System.out.println("평균_" + avg);
	}

}	
        
