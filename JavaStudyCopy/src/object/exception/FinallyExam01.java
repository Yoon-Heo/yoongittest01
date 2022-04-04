package object.exception;

public class FinallyExam01 {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();	
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
		
		try {
			startInstall();
			copyFiles();
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		} finally {
			deleteTempFiles();
		}
		

	}
	
	static void startInstall() {
		System.out.println("프로그램 설치를 시작합니다.");		
	}
	static void copyFiles() {
		System.out.println("파일들을 복사합니다.");
	}
	static void deleteTempFiles() {
		System.out.println("프로그램을 설치하는데 사용된 임시파일들을 삭제합니다.");
	}
	
}
