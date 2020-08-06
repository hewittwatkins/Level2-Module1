package intro_to_array_lists;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static ArrayList <String> names = new ArrayList <String>();
	
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

	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.setSize(500,500);
	button1.setText("Add Name");
	button2.setText("View Names");
	
	panel.add(button1);
	panel.add(button2);
	panel.setBackground(Color.cyan);
	
	// ActionLister --> learn what is next class from the teacher / ask them about it
	frame.add(panel);
	
	
	GuestBook gb = new GuestBook();
	gb.listen();
	
	
	
	}

	public void listen() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String name = JOptionPane.showInputDialog("Please enter name: ");
			names.add(name);
		}
		else if (e.getSource() == button2) {
			String nameList = "";
			for (int i = 0; i < names.size(); i++) {
				nameList = nameList + "\n" + "Guest #" + (i+1) + ": " + names.get(i); 
				
			}
			JOptionPane.showMessageDialog(null, nameList);
		}
		
	}
	
}
	
