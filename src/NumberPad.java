import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.org.apache.bcel.internal.generic.MULTIANEWARRAY;


/**
 * 
 */

/**
 * @author segbedzi
 *The class NumberPas is where the number pad for the elevator is  created with all the functionality of the 
 *buttons
 */
public class NumberPad  extends JFrame {
	

	/**
	 * 
	 */
	FlowLayout topPanelLayout ;
	BoxLayout mainLayout;
	GridLayout buttonPanelLayout;
	Container container;
	
	JPanel topPanel ,buttonPanel ;
	JButton[] floors =new JButton[6];
	JTextField screen ;
	
	public NumberPad() {
		
		 container = getContentPane();
		//Layouts 
		topPanelLayout = new FlowLayout();
		buttonPanelLayout = new GridLayout(4, 2);
		
		
		//panels
		 topPanel = new JPanel();
		 buttonPanel = new JPanel();
		 buttonPanel.setLayout(buttonPanelLayout);
		 topPanel.setLayout(topPanelLayout);
		 
		 
		 //set up
		 screen = new JTextField("Welcome...");
		 screen.setEditable(false);
		 topPanel.add(screen);
		 
		 
		 mainLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
				 
		 
		 
		 int i=0;
		 for (JButton jButton : floors) {
			 jButton = new JButton(" "+(i+1));
		     buttonPanel.add(jButton);
			
		}
	
	
	
		 
	

		 add(topPanel);
		 add(buttonPanel);
		 pack();
		 setLayout(mainLayout);
		 
		 setSize(500, 500);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);

		 
	}

}
