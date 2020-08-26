package main;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class text_editor {
	static GraphicsConfiguration gc;
	JFrame test=new JFrame("©®@z¥ Text", gc);
	public text_editor(){
		super();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		text_editor st=new text_editor();
		st.test.setVisible(true);
		st.test.setSize(650, 500);
		/**Rectangle2D s=new Rectangle2D.Double(100,100,400,400);
		 * st.test.setShape(s);
		 * */
//		st.test.setResizable(false);
		st.test.setIconImage(new ImageIcon("C:\\Test_Webpages\\media\\imgs\\thunder.png").getImage());
		System.out.println(st.test.getSize()+"/n"+st.test.getLocation());
		st.test.setLocation(400, 200);
		st.test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
