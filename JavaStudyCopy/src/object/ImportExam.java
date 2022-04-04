package object;

import java.text.SimpleDateFormat;
import java.util.Date;

//--------------------------------------------------------------------------------------
// public class ImportExam 
//--------------------------------------------------------------------------------------
public class ImportExam {

	//--------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//--------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat date 	= new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat time	= new SimpleDateFormat("hh시 mm분 ss초 a");
		
		System.out.println(new Date());
		System.out.println("오늘의 날짜 : " + date.format(today));
		System.out.println("현재의 시각 : " + time.format(today));
		
	}	// End - public static void main(String[] args) 

}	// End - public class ImportExam
