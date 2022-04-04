package array;

import javax.swing.JOptionPane;

public class ArrayExam06 {

	public static void main(String[] args) {
		// 방번호(인덱스번호)를 2개 입력받아서 그 방의 값을 서로 바꾸어 주세요.

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
        int index1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 인덱스 번호를 입력하세요."));
        int index2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 인덱스 번호를 입력하세요."));	
        
        System.out.println("인덱스1 : " + index1 );
        System.out.println("인덱스2 : " + index2 );
        
           	// int imsi = 0;
           	// imsi     = arr[index1];
           	int temp    = arr[index1];
            
            arr[index1] = arr[index2];
	        arr[index2] = temp;
        
        
            for(int i=0 ; i<arr.length ; i++ ) 
	    	System.out.println("arr[" + i + "] : " + arr[i]);
	    	
	        String msg =  " ";
	        for(int i = 0 ; i < arr.length ; i++ )
                msg += arr[i] + ", ";
            
              JOptionPane.showMessageDialog(null, msg);
               
	}
}
	

           	