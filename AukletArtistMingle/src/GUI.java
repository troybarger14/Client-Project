import java.awt.*;

import javax.swing.*;

public class GUI {

	public static void main(String[] args) {
		
	JFrame frame = new JFrame();
	frame.setBounds(100, 100, 400, 260);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setTitle("Artist Mingle");
	frame.setLayout(new GridLayout(5,2));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	panel1.setLayout(new FlowLayout());
	panel2.setLayout(new FlowLayout());
	panel3.setLayout(new FlowLayout());
	panel4.setLayout(new FlowLayout());
	panel5.setLayout(new FlowLayout());

	JLabel welcome = new JLabel("Welcome to Artist Mingle");
	JButton input = new JButton("Input Data");
	JButton edit = new JButton("Edit/Delete Data");
	JButton search = new JButton("Search");
	JButton export = new JButton("Export");
	JButton impt = new JButton("Import");
	JButton exit = new JButton("Exit");
	
	panel1.add(welcome);
	panel2.add(input);
	panel2.add(edit);
	panel3.add(search);
	panel3.add(export);
	panel4.add(impt);
	panel5.add(exit);
	
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
	frame.add(panel4);
	frame.add(panel5);
	
	}
	
}
