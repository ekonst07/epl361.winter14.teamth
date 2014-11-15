import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;


public class floor {

	private JFrame frmProject;
	private JTextField textField;
	private JTextField txtD;
	private JTextField txtG;
	private JButton btnUndo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					floor window = new floor();
					window.frmProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public floor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProject = new JFrame();
		frmProject.setTitle("PROJECT");
		frmProject.setBounds(100, 100, 421, 351);
		frmProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmProject.getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 29, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, -244, SpringLayout.EAST, frmProject.getContentPane());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setText("3");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEnabled(false);
		textField.setEditable(false);
		frmProject.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtD = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtD, 91, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, txtD);
		springLayout.putConstraint(SpringLayout.EAST, txtD, 0, SpringLayout.EAST, textField);
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtD.setText("2");
		springLayout.putConstraint(SpringLayout.WEST, txtD, 10, SpringLayout.WEST, frmProject.getContentPane());
		txtD.setEnabled(false);
		txtD.setEditable(false);
		txtD.setColumns(10);
		txtD.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtD);
		
		txtG = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtD, -6, SpringLayout.NORTH, txtG);
		springLayout.putConstraint(SpringLayout.EAST, txtG, 0, SpringLayout.EAST, textField);
		txtG.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtG.setText("1");
		txtG.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.SOUTH, txtG, 209, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, txtG, 153, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtG, 10, SpringLayout.WEST, frmProject.getContentPane());
		txtG.setEnabled(false);
		txtG.setEditable(false);
		txtG.setColumns(10);
		txtG.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtG);
		
		btnUndo = new JButton("UNDO");
		springLayout.putConstraint(SpringLayout.NORTH, btnUndo, 32, SpringLayout.SOUTH, txtG);
		springLayout.putConstraint(SpringLayout.WEST, btnUndo, 10, SpringLayout.WEST, frmProject.getContentPane());
		frmProject.getContentPane().add(btnUndo);
	}
}
