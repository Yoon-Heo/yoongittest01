package array;

public class Array06 {

	public static void main(String[] args) {
		// 행의 갯수 : score.length = 학생수
		// 열의 갯수 : score[2].length
		
		int[][] score = {
			{88, 70, 91},     // 1번 학생의 국영수 점수
			{50, 88, 70},     // 2번 학생의 국영수 점수
			{4, 29, 18},      // 3번 학생의 국영수 점수
			{86, 49, 96},     // 4번 학생의 국영수 점수
			{38, 67, 55}      // 5번 학생의 국영수 점수
			
		};
		System.out.println("행의 갯수 : " + score.length);
		for(int i=0 ; i < score.length ; i++ ) 
			System.out.print(i + "행의 열의 갯수 : " + score[i].length + " ");  // 배열 i행의 열갯수
		System.out.println();	
		
		int num       = 3;    // 시험 과목수
		int korTotal  = 0;    // 모든 학생의 국어 총점
		int engTotal  = 0;    // 모든 학생의 영어 총점
	    int matTotal  = 0;	  // 모든 학생의 수학 총점
	    
	    System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
	    System.out.println("============================================");
	    
	    for(int i=0 ;i < score.length ;i++ ) {
	    	System.out.print((i+1) + "\t");      // 학생번호
	    	// 학생 개개인의 국, 영, 수 점수를 보여준다.
	    	for(int j = 0 ; j<score[i].length; j++ )
	    	System.out.print(score[i][j] + "\t");
	    	System.out.println();
	     }	
	    /*	
	    for(int i=0 ; i < score.length ;i++ ) {
	    	korTotal += score[i][0];
	    }	
	    for(int i=0 ; i < score.length ;i++ ) {
	    	engTotal += score[i][1];
	    }	
	    for(int i=0 ; i < score.length ;i++ ) {
	    	matTotal += score[i][2];
	    }	
	    */
	    for(int i=0 ; i < score.length ;i++ ) {
	    	korTotal += score[i][0];
	    	engTotal += score[i][1];
	    	matTotal += score[i][2];
	    }	
	    
	    int Total = korTotal + engTotal + matTotal;
	    int avg   = Total / score.length;
	    
	    
	    System.out.println("============================================");
	    System.out.println("총점\t" + korTotal + "\t" + engTotal + "\t" + matTotal + "\t" + Total + "\t" + avg );
	   
	    
	 }  // End public static void main(String[] args)

}      // End public class Array06   
	     
	    
	
	

	    
	    
	    
	    
	 
	   