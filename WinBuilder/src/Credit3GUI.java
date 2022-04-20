import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit3GUI {

	private JFrame frame;
	private JTextField FNw;
	private JTextField lnn;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3GUI window = new Credit3GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Credit3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(47, 11, 526, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LN = new JLabel("Last name");
		LN.setBounds(39, 96, 83, 38);
		panel.add(LN);
		
		lnn = new JTextField();
		lnn.setBounds(128, 101, 216, 29);
		panel.add(lnn);
		lnn.setColumns(10);
		
		FNw = new JTextField();
		FNw.setBounds(128, 48, 216, 29);
		panel.add(FNw);
		FNw.setColumns(10);
		
		JLabel FN = new JLabel("First name");
		FN.setBounds(39, 43, 83, 38);
		panel.add(FN);
		
		JLabel AG = new JLabel("Age");
		AG.setBounds(39, 143, 83, 38);
		panel.add(AG);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 152, 216, 29);
		panel.add(textField_2);
		
		JButton SB = new JButton("Submit");
		SB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = FNw.getText();
				String LN = lnn.getText();
			}
		});
		SB.setBounds(128, 200, 89, 23);
		panel.add(SB);
		
		JButton RS = new JButton("Reset");
		RS.setBounds(255, 200, 89, 23);
		panel.add(RS);
		
		JLabel DIS = new JLabel("");
		DIS.setBounds(51, 239, 437, 71);
		panel.add(DIS);
	}
}
