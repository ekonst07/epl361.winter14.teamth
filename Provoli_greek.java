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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Provoli_greek {

	private JFrame frmProject;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Provoli_greek window = new Provoli_greek();
					window.frmProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Provoli_greek() {
		initialize();
	}

	
	private void initialize() {
		frmProject = new JFrame();
		frmProject.setTitle("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE \u03A0\u03B5\u03C1\u03B9\u03BF\u03C7\u03AE\u03C2");
		frmProject.setBounds(100, 100, 422, 334);
		frmProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmProject.getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		
		textField.setEnabled(false);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 29, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, frmProject.getContentPane());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setText("\u0391");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		frmProject.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 91, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 96, SpringLayout.WEST, frmProject.getContentPane());
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setText("\u0394");
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 10, SpringLayout.WEST, frmProject.getContentPane());
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_3);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_3, -6, SpringLayout.NORTH, textField_6);
		springLayout.putConstraint(SpringLayout.EAST, textField_6, 96, SpringLayout.WEST, frmProject.getContentPane());
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setText("\u0397");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_6, 209, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 153, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 10, SpringLayout.WEST, frmProject.getContentPane());
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_6);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 29, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -217, SpringLayout.EAST, frmProject.getContentPane());
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\u0392");
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setText("\u0395");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -7, SpringLayout.NORTH, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 2, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, -217, SpringLayout.EAST, frmProject.getContentPane());
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, textField_4, 92, SpringLayout.EAST, textField_6);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("\u0398");
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 2, SpringLayout.NORTH, textField_6);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 6, SpringLayout.EAST, textField_6);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_4, 0, SpringLayout.SOUTH, textField_6);
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 6, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_5, 0, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_5, -125, SpringLayout.EAST, frmProject.getContentPane());
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setText("\u0393");
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("\u0396");
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, textField_7, 2, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_7, 6, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_7, 0, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_7, -125, SpringLayout.EAST, frmProject.getContentPane());
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, textField_4);
		springLayout.putConstraint(SpringLayout.WEST, textField_8, 6, SpringLayout.EAST, textField_4);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_8, 0, SpringLayout.SOUTH, textField_6);
		springLayout.putConstraint(SpringLayout.EAST, textField_8, 92, SpringLayout.EAST, textField_4);
		textField_8.setText("\u0399");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_8);
		
		JButton btnPisw = new JButton("\u03A0\u03AF\u03C3\u03C9");
		springLayout.putConstraint(SpringLayout.NORTH, btnPisw, -45, SpringLayout.SOUTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnPisw, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPisw, -22, SpringLayout.SOUTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnPisw, 0, SpringLayout.EAST, textField);
		frmProject.getContentPane().add(btnPisw);
		
		btnPisw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);
			}
		});
		
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Á_row_column.main(null);
			}
		});
	}
}
