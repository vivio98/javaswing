package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	 
  public MyFrame(){
	  setSize(600, 300);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //우측상단 창닫기 버튼
	  setTitle("스윙예제");
	  Toolkit toolkit = Toolkit.getDefaultToolkit(); //툴킷의 객체를 생성
	  Dimension dim = toolkit.getScreenSize(); // 스윙 객체가 보여지는 위치선정
	
          JPanel panel1 = new JPanel(); 
          JPanel panel1A = new JPanel();
          JPanel panel1B = new JPanel();
          
          panel1.setBackground(Color.GREEN);
          panel1A.setBackground(Color.YELLOW);
          panel1B.setBackground(Color.RED);
          
          JLabel label = new JLabel("MVC 모델의 역할 분담");
          panel1A.add(label);
             /*
              * 버튼 객체 생성
              *   
              */
  JButton button1 = new JButton("Mode1 : 자바");
  JButton button2 = new JButton("View : JSP");
  JButton button3 = new JButton("Controller : 서블릿");
  JButton button4 = new JButton("(+) Database : 오라클");
  /*패널에 버튼을 추가*/ 
 panel1B.add(button1);
 panel1B.add(button2);
 panel1B.add(button3);
 panel1B.add(button4);
  /*패널에 패널A와 패널B 를 설치*/
  panel1.add(panel1A);
  panel1.add(panel1B);
  
  /*프레임에 패널 설치*/
  add(panel1);
  setLocation(dim.width/2, dim.height/2); //화면 중앙 근처에 위치 시킴
  setVisible(true);
  
  
  
  }
}
