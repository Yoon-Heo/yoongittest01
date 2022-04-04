package array;

import java.util.Scanner;

// ---------------------------------------------------------------
// public class Seongjeok01
//----------------------------------------------------------------
public class Seongjeok01 {

	// ---------------------------------------------------------------
	// public static void main(String[] args)
	//----------------------------------------------------------------
	public static void main(String[] args) {

		// 1. 학생의 수를 입력한다. 
		Scanner in = new Scanner(System.in);
		System.out.print("학생 수는 몇 명인가요? ");
		String[] name = new String[in.nextInt()];	// 입력받은 학생의 수 만큼 방을 만든다.
		
		// 2. 프로그램에 필요한 변수들을 준비한다.
		//	  학생이름, 국어점수, 영어점수, 수학점수
		// 	  총점, 평균, 학점, 순위를 저장할 배열변수가 필요하다. 
		
		int[]		kor		= new int[name.length];		// 국어점수
		int[]		eng		= new int[name.length];		// 영어점수
		int[]		mat		= new int[name.length];		// 수학점수
		int[ ]		tot		= new int[name.length];		// 총점
		double[]	avg		= new double[name.length];	// 평균
		String[]	grade	= new String[name.length];	// 등급	
		int[]		rank	= new int[name.length];		// 석차
		
		// 3. 학생의 수만큼 이름, 국어점수, 영어점수, 수학점수를 입력받아서 각각의 배열에 저장한다.
		for(int i=0 ; i<name.length ; i++) {
			System.out.print("이름을 입력하세요 : ");		
		    name[i] = in.next();
			
			System.out.print("국어점수를 입력하세요 : ");
			kor[i]	= in.nextInt();
			
			System.out.print("영어점수를 입력하세요 : ");
			eng[i]	= in.nextInt();
			
			System.out.print("수학점수를 입력하세요 : ");
			mat[i]	= in.nextInt();
			
			// 한 학생에 대한 총점 구하기
			tot[i] = kor[i] + eng[i] + mat[i] ;			
			// 한 학생에 대한 합계저장
			avg[i] = tot[i] / 3.0 ;		// 정수 => 실수(소수점있음) 변환
			// 한 학생에 대한 평균 학점 구하기
			 if (avg[i]>=90) 
				grade[i] = "A학점";
				
			 else if (avg[i]>=80) 
				 grade[i] = "B학점";
			 else if (avg[i]>=70) 	
				 grade[i] = "C학점";
			 else if (avg[i]>=60)	
				 grade[i] = "D학점";
			 else grade[i] = "F학점";
		}	
			
		
		// 4. 등급, 석차 구하기
		//    석차는 1부터 시작하므로 rank방을 모두 1로 만들고(초기화!!) 시작한다.
		for(int i=0 ; i<rank.length ; i++)
			rank[i] = 1;	
			
		// 석차 구하기
		for( int i = 0 ; i<rank.length ; i++ ) {
			for( int j=0 ; j<rank.length ; j++ ) {
			  	
				if(tot[i] < tot[j]) {
					rank[i]++;
					
				}
			}
		}			
					
			
		// 5. 성적리스트를 출력하자.
		
		for(int i=0 ;i<name.length ;i++ )
		{
			System.out.println("==============================================================================");
			System.out.print("이 름 : " + name[i] + " | ");
			System.out.print("국 어 : " + kor[i] + "점 | ");
			System.out.print("영 어 : " + eng[i] + "점 | ");
			System.out.print("수 학 : " + mat[i] + "점 | ");
			System.out.print("총 점 : " + tot[i] + "점 | ");
			System.out.printf("평 균 : %.2f | " + avg[i]);  				// 	%.2f : 소수점 2자리까지 표기			
			System.out.print("학 점 : " + grade[i] + "점 | ");
			System.out.print("석 차 : " + rank[i] + "등" );
			
		}
		System.out.println("==============================================================================");
		in.close();
		
    } 	// End - public static void main(String[] args)

}	// End - public class Seongjeok01
		
		 	
	
			
		
			
			
		
			
			
		  
	
	
			
			
	

				

	
	