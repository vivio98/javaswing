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
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������� â�ݱ� ��ư
	  setTitle("��������");
	  Toolkit toolkit = Toolkit.getDefaultToolkit(); //��Ŷ�� ��ü�� ����
	  Dimension dim = toolkit.getScreenSize(); // ���� ��ü�� �������� ��ġ����
	
          JPanel panel1 = new JPanel(); 
          JPanel panel1A = new JPanel();
          JPanel panel1B = new JPanel();
          
          panel1.setBackground(Color.GREEN);
          panel1A.setBackground(Color.YELLOW);
          panel1B.setBackground(Color.RED);
          
          JLabel label = new JLabel("MVC ���� ���� �д�");
          panel1A.add(label);
             /*
              * ��ư ��ü ����
              *   
              */
  JButton button1 = new JButton("Mode1 : �ڹ�");
  JButton button2 = new JButton("View : JSP");
  JButton button3 = new JButton("Controller : ����");
  JButton button4 = new JButton("(+) Database : ����Ŭ");
  /*�гο� ��ư�� �߰�*/ 
 panel1B.add(button1);
 panel1B.add(button2);
 panel1B.add(button3);
 panel1B.add(button4);
  /*�гο� �г�A�� �г�B �� ��ġ*/
  panel1.add(panel1A);
  panel1.add(panel1B);
  
  /*�����ӿ� �г� ��ġ*/
  add(panel1);
  setLocation(dim.width/2, dim.height/2); //ȭ�� �߾� ��ó�� ��ġ ��Ŵ
  setVisible(true);
  
  
  
  }
}
