package object.gui.grimpan;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

//------------------------------------------------------------------------------------------
// 그림을 그릴 수 있는 나만의 도화지 클래스
// AWT 쓰레드 아래와 같은 경우, paint()를 자동호출해서 화면을 갱신한다. 
// 1. 처음 화면에 나타날 때
// 2. 다른 화면에 가려져 있던 부분이 다시 화면에 나타날 때
// 3. 아이콘화되어 있다가 원래의 크기로 화면에 나타날 때
//
// 화면이 강제적으로 다시 그려지게 하려면 repaint()를 호출하면 된다.
// 화면의 갱신 요청을 받으면, AWT 쓰레드는 update()를 호출하고,
// update()는 화면을 지운 후에 paint()를 호출한다.
//------------------------------------------------------------------------------------------
public class MyCanvas extends Canvas {

	//------------------------------------------------------------------------------------------
	// 멤버 변수
	//------------------------------------------------------------------------------------------
	int x = -50;
	// 처음에 검은색 점이 화면에 안보이게 하기 위해서 x와 y좌표를 -값으로 설정한다.
	int y = -50;
	int w =   7;
	int h =	  7;
	Color cr	= Color.BLACK;
	
	
	//------------------------------------------------------------------------------------------
	// public void paint(Graphics g) 
	//------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics g) {
			g.setColor(cr);
			g.fillOval(x, y, w, h);		// x, y지점에 w, h 크기의 원그리기
		
	} // End - public void paint(Graphics g) 

	//------------------------------------------------------------------------------------------
	// public void update(Graphics g) 
	//------------------------------------------------------------------------------------------
	@Override
	public void update(Graphics g) {
		paint(g);
		
	} // End - public void update(Graphics g) 

	//------------------------------------------------------------------------------------------
	// public void paintComponent(Graphics g) 
	// Swing Conponent가 자신의 모양을 그리는 Method이다.
	// 컴포넌트가 그려져야 하는 시점마다 호출됨. 크기, 위치변경, 가려졌다 다시 나타날 때
	// 개발자가 기능을 변경하고자 할 때 오버라이딩을 사용한다.
	//------------------------------------------------------------------------------------------
	public void paintComponent(Graphics g) {
		g.setColor(cr);
		g.fillOval(x, y, w, h);
		g.drawLine(20, 20, 100, 100);
	} // End - public void paintComponent(Graphics g) 
	
	
}	// End - public class MyCanvas extends Canvas