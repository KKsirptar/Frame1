package Frame1;
//import java.awt.Frame;
//import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
//import java.awt.Image;
import java.awt.Panel;
//import java.awt.TextArea;
//import java.util.ArrayList;
public class panel3 {
	//private static final Object BorderLayout = null;
	public panel3(){ 
	
			int Random1;
			Panel panel3 =new Panel();
			panel3.setLayout(new GridLayout(10,10,1,1));
			panel3.setSize(1000,650);
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
					
       }

	
		
}
	
