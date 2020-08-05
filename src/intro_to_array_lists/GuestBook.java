package intro_to_array_lists;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook {
	
	public static void main(String[] args) {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
		
	// JFrame
		
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.setSize(500,500);
	label.setText("Hellooo");
	
	panel.add(button1);
	panel.add(text);
	panel.add(label);
	panel.setBackground(Color.cyan);
	
	
	// ActionLister --> learn what is next class from the teacher / ask them about it
	
	frame.add(panel);

	}
}
	
