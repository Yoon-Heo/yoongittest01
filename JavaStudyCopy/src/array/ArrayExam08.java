package array;

import javax.swing.JOptionPane;

public class ArrayExam08 {

	public static void main(String[] args) {
		// 양의 정수를 10개 입력받아 배열에 저장하고,
		// 배열에 있는 정수 중에서 3의 배수만 출력해보자
		
		int[] arr = new int[10];
		int num = 0;
		
		System.out.println("양의 정수 10개를 입력하십시오.");
		for(int i = 0; i<arr.length ; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "번째"));
	        if(num<1) {   // 다시 입력을 받게 한다. 
	        	i--;  // i = i-1;
	        } else {      // 정상값을 입력하였을 경우 방에 저장한다.
	        	arr[i] = num;
	        	
	        }
		}	
	        	
	    
		System.out.println("3의 배수는?");   
		
		for(int i=0 ;i<arr.length ;i++ )
		{
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + ",");
			}
		  
		}
		System.out.println();    
		
		System.out.println("=========================================");
		// 방에 저장된 10개의 수
		for(int i=0 ;i<arr.length ;i++ ) {
			if(i ==  arr.length-1)       System.out.print(arr[i]);  // 마지막 쉼표(,) 안보이게 하기
			else                         System.out.print(arr[i] + ",");
		
		}	
		
		System.out.println();	
	    // 방에 저장된 10개의 수를 오름차순으로 정렬해서 보자!
	    
		for(int i=0 ;i<arr.length-1 ;i++ ) {    // (배열크기-1)만큼 시행
	         for(int j=0 ; j<arr.length-1-i; j++ ) {
	        	    if(arr[j] > arr[j+1]) {  // 왼쪽 방의 값이 더 크면 값을 교환한다.
	        	    	int imsi   = arr[j];
	        	    	arr[j]     = arr[j+1];
	        	    	arr[j+1]   = imsi;
	        	    }
	        	 
	         } 	
	    }	
	    	
	    for(int i = 0  ; i<arr.length ; i++ ) {
	    	System.out.print(arr[i] + "\t");
	     }	
	    	
	  
		
		
		
		
		
		/*
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = 0;
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
			
		  for(int j=0 ; ; j++ )	{
			if( arr[i] < 0){
				System.out.println("범위를 벗어난 값입니다. 다시 입력해주세요.");
				arr[i] = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
			}else
				break;
		  }
			
		  System.out.println(arr[i] + ", ");
		}
		*/
		
		
	}      // End - public static void main(String[] args)

}          // End - ArrayExam08 
	 
       
	

	
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		