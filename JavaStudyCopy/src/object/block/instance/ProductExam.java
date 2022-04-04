package object.block.instance;

//-----------------------------------------------------------------------------------------------------------
// class product
//-----------------------------------------------------------------------------------------------------------
class Product{
	static	int	count	= 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수(제품이 총 몇대 생산되었는지 알기 위해서)
	int serialNo;
	
	{		// 인스턴스 블럭 : 생성자에서 공통적으로 수행되는 작업에 사용, 인스턴스가 생성될 때마다  실행(생성자보다 먼저!)
		count++;	// 인스턴스의 수 카운트
		serialNo	=	count;	// 카운트 저장
	}	
	
}	// End - class product 

//-----------------------------------------------------------------------------------------------------------
// public class ProductExam
//-----------------------------------------------------------------------------------------------------------
public class ProductExam {
	
	//-----------------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
     	
		Product	p1	=	new Product();		// count 하나
		Product p2	=  	new Product();		// count 둘
		Product p3	=  	new Product();		// count 셋

		System.out.println("p1의 제품번호 : " + p1.serialNo);
		System.out.println("p2의 제품번호 : " + p2.serialNo);
		System.out.println("p3의 제품번호 : " + p3.serialNo);
		System.out.println("총 생산 대수 : " + Product.count);
				
			
		
	}	// End - public static void main(String[] args)

}	// End - public class ProductExam 
