package array;

public class Array01 {

	public static void main(String[] args) {
		// 총점과 평균을 구해보자.
		int sum = 0;
		float average = 0;
		
		int[] score = {100, 69, 84, 37, 55, 62, 79, 82, 26, 41};
		
		// 총점을 구한다.
		// score.length : 배열변수.length  => 배열이 갖고 있는 요소의 갯수
		
		for(int i = 0 ; i < score.length ; i++ ) {
			   sum += score[i];
		}	   
		
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("평균 : " + (int)average);
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println(i + " : " + score[i] + "\t");
		}
		

	}

}
