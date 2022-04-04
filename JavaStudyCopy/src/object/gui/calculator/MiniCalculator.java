package object.gui.calculator;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

//------------------------------------------------------------------------------------
// public class MiniCalculator extends JFrame implements ActionListener
//------------------------------------------------------------------------------------
public class MiniCalculator extends JFrame implements ActionListener { // ActionListener 인터페이스를 구현(implements~~)

	//------------------------------------------------------------------------------------
	//	변수 선언
	//------------------------------------------------------------------------------------
	private JPanel			panel;		// 버튼 패널(자판)
	private JTextField		tField;		// 액정
	
	private JButton[]		buttons; 	// 버튼들을 가리키는 참조변수
	// 버튼 위에 쓰여질 기호와 숫자들
	private String[]		labels = {
			"7", "8", "9", "+",
			"4", "5", "6", "-",
			"1", "2", "3", "*",
			"0", "C", "=", "/",      };
	
	// actionPerformed에서 사용할 변수들을 선언한다.
	
	private String		tempName;		  		// 버튼 이름 불러오기
	private String 		tempString;		  		// tField(액정)에 적힌 텍스트를 받아올 때 사용한다.
	private int			tempNum1	= 0;  		// 첫번째 숫자
	private String		tempNum2	= "";   	// 두번째 숫자
	private boolean		is_ready	= false;	// 사칙연산 중 앞 숫자와 뒤 숫자를 구분하기 위해서 사용
	private String		who			= "";		// 사칙연산자 중 어떤 연산자가 사용이 되었는지 저장하기 위해 사용한다.
	
	
	
	//------------------------------------------------------------------------------------
	//	actionPerformed에서 사용하는 변수들을 한번에 초기화하는 메서드
	//------------------------------------------------------------------------------------
	protected void calculateInit() {
		tempName	= "";
		tempString	= "";
		tempNum1	= 0;
		tempNum2	= "";
		is_ready	= false;
		who			= "";
		
	} // End - protected void calculateInit()
	
	//------------------------------------------------------------------------------------
	// 생성자
	//------------------------------------------------------------------------------------
	public MiniCalculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("계산기");
		
		tField	= new JTextField(12);
		panel	= new JPanel();		// 버튼들이 올라갈 패널
		
		tField.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 32));
		tField.setText("0");		// 처음에는 액정에 0을 보여준다.
		tField.setEnabled(false);	// 액정에 글자를 직접 쓰지 못하게 한다.
		
		panel.setLayout(new GridLayout(4, 4, 2, 6));	// 패널의 레이아웃(Grid) 설정 row, col, hgap_수평간격, vgap_수직간격
		buttons = new JButton[16];	// 숫자 10개와 연산자 6개의 버튼
		
		
		int index = 0;
		// 16개의 버튼을 만든다.
		for(int rows = 0 ; rows < 4 ; rows++ ) {
			for(int cols = 0 ; cols < 4 ; cols++ ) {
				// 배열의 번호(index)를 row와 cols를 이용해서 사용하려면 상단에 기술한다. 
				// 또는 index를 증가시켜서 사용하려면 작업이 끝나는 하단에 기술하면 된다.
				index = rows * 4 + cols;	// 좌측 상단부터 인덱스 시작(0~15)
			 
				buttons[index] = new JButton(labels[index]);	// 버튼을 만들면서 버튼 위에 글자를 쓴다.
				buttons[index].setFont(new Font("Arial", Font.BOLD, 30));
				buttons[index].addActionListener(this); // 버튼마다 액션리스너를 설정한다.
				
				if(cols>=3) 
				buttons[index].setForeground(Color.red);	// 사칙연산 기호만 빨간색으로 만든다. setForeg~nd : 전경색 설정
				else
				buttons[index].setForeground(Color.blue);
				
				buttons[index].setBackground(Color.yellow);	// setBackg~nd : 배경색 설정
					
				panel.add(buttons[index]);	// 만든 버튼을 판넬에 올린다.
				// index++
					
			}	
		}	// 끝 - 버튼 만들기
		
		add(tField, BorderLayout.NORTH);	// 액정 표시
		add(panel, BorderLayout.CENTER);	// 버튼 패널
		
		this.setSize(400, 300);		// 프레임(this 지칭)의 크기
		setLocation(500, 200);		// 프레임이 나타나는 위치
		setResizable(false);		// 프레임의 크기를 변경하지 못하게 하려면 false를 사용한다.
		setVisible(true);			// 프레임을 화면에 나타나게 한다.
		
		
	}	// End - public MiniCalculator() 
	
	//------------------------------------------------------------------------------------
	// 문자열이 숫자로 사용될 수 있는지 판단
	//------------------------------------------------------------------------------------
	public static boolean isNumber(String str) {
		
		return true;
	}
	
	//------------------------------------------------------------------------------------
	// 계산하는 부분 : 숫자 2개와 연산자를 받아서 계산한 값을 돌려준다.
	//------------------------------------------------------------------------------------
    protected int Calculate(int num1, int num2, String sign) {
    	// 연산부호에 따라 계산한 결과를 돌려준다.
    	switch(sign) {
    	case "+": return num1 + num2;		
    	case "-": return num1 - num2;
    	case "*": return num1 * num2;
    	case "/": return num1 / num2;
    		default:
    			return -1;
    	}
    	
    }	// End - protected int Calculate(int num1, int num2, String sign) 
	
	
	//------------------------------------------------------------------------------------
	// public void actionPerformed(ActionEvent e)
	//------------------------------------------------------------------------------------	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}	// End - public void actionPerformed(ActionEvent e)

	
	
	
	
	
	//------------------------------------------------------------------------------------	
	// public static void main(String[] args) 
	//------------------------------------------------------------------------------------
	public static void main(String[] args) {
		new MiniCalculator();

	}	// End - public class MiniCalculator extends JFrame implements ActionListener

}	// End - public static void main(String[] args) 
