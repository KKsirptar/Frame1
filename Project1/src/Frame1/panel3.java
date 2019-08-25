package Frame1;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextArea;
import java.util.ArrayList;
public class panel3 {
	//private static final Object BorderLayout = null;

	public static void main (String[] srgs ) { 
					int Random1;
					Frame frame=new Frame("Max");
					frame.setLocation(50, 50);
					frame.setSize(1000, 700);
					frame.setLayout(null);
					TextArea text1=new TextArea(null, 100,100,TextArea.SCROLLBARS_NONE);
					text1.setSize(1000,600);
					text1.setLocation(50,50);
					//frame.setIconImage();
					
					
					Panel panel1= new Panel(new BorderLayout());
					panel1.setLayout(new GridLayout(10,10,0,0));
					panel1.setSize(470,1600);
					panel1.setLocation(10,50);
					panel1.setBackground(Color.yellow);
					
					
					
					Panel panel2= new Panel(new GridLayout());
					//panel1.setLayout(new GridLayou);
					panel2.setSize(1000,300);
					panel2.setLocation(500,710);
					panel2.setBackground(Color.PINK);
					
					
					
					
					
					
					Panel panel3 =new Panel();
					panel3.setLayout(new GridLayout(10,10,1,1));
					panel3.setSize(650,650);
					//panel3.setBounds(300,100,1200,600);
					panel3.setLocation(500,50);
					for (int i=1;i<=100;i++) {
						
						Random1=(int) (Math.random() *3);
						Button button3=new Button(""+i);
						if(Random1==1) {
							button3.setBackground(new Color(16711680));
						}
						else if(Random1==2) {
							button3.setBackground(new Color(0,255,0));
						}
						else {
							button3.setBackground(Color.BLUE);
						}
						button3.setSize(50,50);
						panel3.add(button3);
					}
					
					
					
					
					frame.add(panel1);
					frame.add(panel2);
					frame.add(panel3);
					
					frame.setVisible(true);
       }

	private static void setIconImages(ArrayList<Image> imageList) {
		// TODO Auto-generated method stub
		
	}
	}
