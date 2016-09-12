import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI implements ActionListener{
	
	private JFrame frame;				private JPanel panel1;
	private	JPanel panel2;				private JPanel panel3;
	private JPanel panel4;				private JPanel panel5;
	private JPanel panel6;				private JPanel panel7;
	private JPanel panel8;				
	private JLabel welcome;				private JButton input;
	private JButton edit;				private JButton search;
	private JButton export;				private JButton impt;
	private JButton exit;				private JFrame frame2;
	private JLabel selectInputType;		private JButton btnArtist;
	private JButton btnConnection;		private JFrame frame3;
	private JLabel lblInputArtist;		private JLabel lblFirstName;
	private JLabel lblLastName;			private JTextField fieldLastName;
	private JTextField fieldFirstName;	private JLabel lblOccupation;
	private JComboBox boxOccupation;	private JLabel lblDOB;
	private JTextField fieldMonth;		private JTextField fieldDay;
	private JTextField fieldYear;		private JLabel lblGender;
	private JComboBox boxGender;		private JLabel lblNotes;
	private JButton btnSubmit;			private JButton btnCancel;
	private JTextArea textBox;

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
		
		btnArtist.addActionListener(this);
		btnConnection.addActionListener(this);
		
		panel6.add(selectInputType);
		panel7.add(btnArtist);
		panel7.add(btnConnection);
		
		frame2.add(panel6);
		frame2.add(panel7);
	}
	
	/**
	 * Creates GUI for inputting Artist data
	 */
	// Grid 6, 1
	public void createGUIInputArtist() {
		frame2.dispose();
		
		panel8 = new JPanel();			panel8.setLayout(null);
		
		lblInputArtist = new JLabel("Input Artist");		lblFirstName = new JLabel("FirstName");
		lblLastName = new JLabel("Last Name");				fieldLastName = new JTextField();
		fieldFirstName = new JTextField();					lblOccupation = new JLabel("Occupation");
		boxOccupation = new JComboBox();					lblDOB = new JLabel("Date of Birth");
		fieldMonth = new JTextField(2);						fieldDay = new JTextField(2);
		fieldYear = new JTextField(4);						lblGender = new JLabel("Gender");
		boxGender = new JComboBox();						lblNotes = new JLabel("Notes");
		btnSubmit = new JButton("Submit");					btnCancel = new JButton("Cancel");
		textBox = new JTextArea();
		
		lblInputArtist.setFont(new Font("Times New Roman", Font.BOLD, 22));		fieldFirstName.setBounds(50, 97, 146, 26);
		lblInputArtist.setBounds(156, 16, 111, 20);								fieldFirstName.setColumns(10);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 18));		fieldLastName.setBounds(244, 97, 146, 26);
		lblLastName.setBounds(50, 67, 93, 20);									fieldLastName.setColumns(10);
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 18));		boxOccupation.setBounds(50, 187, 340, 26);
		lblFirstName.setBounds(244, 67, 93, 20);								fieldMonth.setBounds(50, 265, 50, 26);
		lblOccupation.setFont(new Font("Times New Roman", Font.PLAIN, 18));		fieldMonth.setColumns(10);
		lblOccupation.setBounds(50, 151, 104, 20);								fieldDay.setBounds(115, 265, 50, 26);
		lblDOB.setFont(new Font("Times New Roman", Font.PLAIN, 18));			fieldDay.setColumns(10);
		lblDOB.setBounds(50, 229, 104, 20);										fieldYear.setColumns(10);
		fieldYear.setBounds(180, 265, 71, 26);									boxGender.setBounds(50, 342, 83, 26);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 18));			textBox.setBounds(50, 420, 340, 140);
		lblGender.setBounds(50, 307, 69, 20);									btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNotes.setFont(new Font("Times New Roman", Font.PLAIN, 18));			btnSubmit.setBounds(81, 576, 115, 29);
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));			btnCancel.setBounds(234, 576, 115, 29);
		lblNotes.setBounds(50, 384, 69, 20);									textBox.setBorder(BorderFactory.createLineBorder(Color.black));
		textBox.setLineWrap(true);
		
		panel8.add(lblInputArtist);				panel8.add(lblFirstName);
		panel8.add(lblLastName);				panel8.add(fieldLastName);
		panel8.add(fieldFirstName);				panel8.add(lblOccupation);
		panel8.add(boxOccupation);				panel8.add(lblDOB);
		panel8.add(fieldMonth);					panel8.add(fieldDay);
		panel8.add(fieldYear);					panel8.add(lblGender);
		panel8.add(boxGender);					panel8.add(lblNotes);
		panel8.add(textBox);					panel8.add(btnSubmit);
		panel8.add(btnCancel);	
		
		btnSubmit.addActionListener(this);				btnCancel.addActionListener(this);
		
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 675);
		frame3.setLocationRelativeTo(null);
		frame3.setVisible(true);
		frame3.setTitle("Artist Mingle");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setContentPane(panel8);
		
	}

	/**
	 * Action performed method for buttons
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		Object source = event.getSource();
		
		if (source == input) {
			createGUIAskingImportType();
		} else if (source == btnArtist) {
			createGUIInputArtist();
		}
		
	}
	
}
