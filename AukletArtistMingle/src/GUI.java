import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI implements ActionListener{
	
	private JFrame frame;				private JPanel panel1;
	private	JPanel panel2;				private JPanel panel3;
	private JPanel panel4;				private JPanel panel5;
	private JPanel panel6;				private JPanel panel7;
	private JLabel welcome;				private JButton input;
	private JButton edit;				private JButton search;
	private JButton export;				private JButton impt;
	private JButton exit;				private JFrame frame2;
	private JLabel selectInputType;		private JButton btnArtist;
	private JButton btnConnection;

	public GUI() {
	
	// Basic frame setup
	frame = new JFrame();
	frame.setBounds(100, 100, 400, 260);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setTitle("Artist Mingle");
	frame.setLayout(new GridLayout(5,2));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Create all panels
	panel1 = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();
	panel4 = new JPanel();
	panel5 = new JPanel();
	
	// Set the layouts of all of the panels
	panel1.setLayout(new FlowLayout());
	panel2.setLayout(new FlowLayout());
	panel3.setLayout(new FlowLayout());
	panel4.setLayout(new FlowLayout());
	panel5.setLayout(new FlowLayout());

	// Creates components and adds text to them.
	welcome = new JLabel("Welcome to Artist Mingle");
	input = new JButton("Input Data");
	edit = new JButton("Edit/Delete Data");
	search = new JButton("Search");
	export = new JButton("Export");
	impt = new JButton("Import");
	exit = new JButton("Exit");
	
	// Adds action listeners to the buttons
	input.addActionListener(this);
	edit.addActionListener(this);
	search.addActionListener(this);
	export.addActionListener(this);
	impt.addActionListener(this);
	exit.addActionListener(this);
	
	// Adds components to panels
	panel1.add(welcome);
	panel2.add(input);
	panel2.add(edit);
	panel3.add(search);
	panel3.add(export);
	panel4.add(impt);
	panel5.add(exit);
	
	// Adds panels to frame
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
	frame.add(panel4);
	frame.add(panel5);
	
	}
	
	/**
	 * Asks for option of which input the user would like to do.
	 */
	public void createGUIAskingImportType() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 400, 210);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		frame2.setTitle("Artist Mingle");
		frame2.setLayout(new GridLayout(2,1));
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel6 = new JPanel();
		panel7 = new JPanel();
		
		panel6.setLayout(new FlowLayout());
		panel7.setLayout(new FlowLayout());
		
		selectInputType = new JLabel("Please select the type of input");
		btnArtist = new JButton("Artist");
		btnConnection = new JButton("Connection");
		
		panel6.add(selectInputType);
		panel7.add(btnArtist);
		panel7.add(btnConnection);
		
		frame2.add(panel6);
		frame2.add(panel7);
	}

	/**
	 * Action performed method for buttons
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		Object source = event.getSource();
		
		if (source == input) {
			createGUIAskingImportType();
		}
		
	}
	
}
