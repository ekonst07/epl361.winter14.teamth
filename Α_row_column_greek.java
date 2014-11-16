import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class �_row_column_greek {
	private JFrame frmProject;
	private JTextField textField;
	private JTextField txtD;
	private JTextField txtG;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtH;
	private JTextField txtC;
	private JTextField txtF;
	private JTextField textField_8;
	private JButton btnUndo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�_row_column_greek window = new �_row_column_greek();
					window.frmProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �_row_column_greek() {
		initialize();
	}

	private void initialize() {
		frmProject = new JFrame();
		frmProject.setTitle("PROJECT");
		frmProject.setBounds(100, 100, 421, 351);
		frmProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmProject.getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, textField, 29, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, frmProject.getContentPane());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setText("1,1");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEnabled(false);
		textField.setEditable(false);
		frmProject.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtD = new JTextField();
		txtD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtD, 91, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, txtD);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, txtD);
		springLayout.putConstraint(SpringLayout.EAST, txtD, 96, SpringLayout.WEST, frmProject.getContentPane());
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtD.setText("2,1");
		springLayout.putConstraint(SpringLayout.WEST, txtD, 10, SpringLayout.WEST, frmProject.getContentPane());
		txtD.setEnabled(false);
		txtD.setEditable(false);
		txtD.setColumns(10);
		txtD.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtD);
		
		txtG = new JTextField();
		txtG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, txtD, -6, SpringLayout.NORTH, txtG);
		springLayout.putConstraint(SpringLayout.EAST, txtG, 96, SpringLayout.WEST, frmProject.getContentPane());
		txtG.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtG.setText("3,1");
		txtG.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.SOUTH, txtG, 209, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, txtG, 153, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtG, 10, SpringLayout.WEST, frmProject.getContentPane());
		txtG.setEnabled(false);
		txtG.setEditable(false);
		txtG.setColumns(10);
		txtG.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtG);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 29, SpringLayout.NORTH, frmProject.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -217, SpringLayout.EAST, frmProject.getContentPane());
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1,2");
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setText("2,2");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -7, SpringLayout.NORTH, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, txtD);
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 2, SpringLayout.NORTH, txtD);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, txtD);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, -217, SpringLayout.EAST, frmProject.getContentPane());
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_2);
		
		txtH = new JTextField();
		txtH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, txtH, 92, SpringLayout.EAST, txtG);
		txtH.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtH.setHorizontalAlignment(SwingConstants.CENTER);
		txtH.setText("3,2");
		springLayout.putConstraint(SpringLayout.NORTH, txtH, 2, SpringLayout.NORTH, txtG);
		springLayout.putConstraint(SpringLayout.WEST, txtH, 6, SpringLayout.EAST, txtG);
		springLayout.putConstraint(SpringLayout.SOUTH, txtH, 0, SpringLayout.SOUTH, txtG);
		txtH.setEnabled(false);
		txtH.setEditable(false);
		txtH.setColumns(10);
		txtH.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtH);
		
		txtC = new JTextField();
		txtC.addMouseListener(new MouseAdapter() {
			@Override
		public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, txtC, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, txtC, 6, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, txtC, 0, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, txtC, -125, SpringLayout.EAST, frmProject.getContentPane());
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtC.setText("1,3");
		txtC.setEnabled(false);
		txtC.setEditable(false);
		txtC.setColumns(10);
		txtC.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtC);
		
		txtF = new JTextField();
		txtF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		txtF.setHorizontalAlignment(SwingConstants.CENTER);
		txtF.setText("2,3");
		txtF.setFont(new Font("Tahoma", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, txtF, 2, SpringLayout.NORTH, txtD);
		springLayout.putConstraint(SpringLayout.WEST, txtF, 6, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, txtF, 0, SpringLayout.SOUTH, txtD);
		springLayout.putConstraint(SpringLayout.EAST, txtF, -125, SpringLayout.EAST, frmProject.getContentPane());
		txtF.setEnabled(false);
		txtF.setEditable(false);
		txtF.setColumns(10);
		txtF.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(txtF);
		
		textField_8 = new JTextField();
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orofoi.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, txtH);
		springLayout.putConstraint(SpringLayout.WEST, textField_8, 6, SpringLayout.EAST, txtH);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_8, 0, SpringLayout.SOUTH, txtG);
		springLayout.putConstraint(SpringLayout.EAST, textField_8, 92, SpringLayout.EAST, txtH);
		textField_8.setText("3,3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.LIGHT_GRAY);
		frmProject.getContentPane().add(textField_8);
		
		btnUndo = new JButton("\u03A0\u03AF\u03C3\u03C9");
		springLayout.putConstraint(SpringLayout.NORTH, btnUndo, 32, SpringLayout.SOUTH, txtG);
		springLayout.putConstraint(SpringLayout.WEST, btnUndo, 0, SpringLayout.WEST, textField);
		frmProject.getContentPane().add(btnUndo);
		
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Provoli_greek.main(null);
			}
		});
		
		
		
		
		
		
		
	}
}
