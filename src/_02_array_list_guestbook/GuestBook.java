package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
		
		GuestBook guestBook = new GuestBook();
		guestBook.createGUI();


	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	private void createGUI() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		button1.setText("Add Name");
		button2.setText("View Names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == button1) {
			String user = JOptionPane.showInputDialog("Enter a name");
			names.add(user);
		} else {
			for(int i = 0; i < names.size(); i++){
				String s = names.get(i);
				System.out.println("Guest #" + (i+1) + ": " + names.get(i));
			}
		}
	}
}