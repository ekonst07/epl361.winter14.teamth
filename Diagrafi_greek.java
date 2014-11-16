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


public class Diagrafi_greek {

	private JFrame frame;
	private JTextField textidbox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagrafi_greek window = new Diagrafi_greek();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Diagrafi_greek() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnok = new JButton("OK");
		springLayout.putConstraint(SpringLayout.SOUTH, btnok, -35, SpringLayout.SOUTH, frame.getContentPane());
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);
			}
		});
		frame.getContentPane().add(btnok);
		
		JButton btnCancel = new JButton("CANCEL");
		springLayout.putConstraint(SpringLayout.WEST, btnok, -126, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, btnok, -43, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCancel, -35, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCancel, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);
					}
				}
			);
		
		
		textidbox = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textidbox, -126, SpringLayout.EAST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, textidbox, -81, SpringLayout.NORTH, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, textidbox, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textidbox);
		textidbox.setColumns(10);
		
		JLabel label = new JLabel("\u0395\u0399\u0394\u0391\u0393\u03A9\u0393\u0397 \u039A\u03A9\u0394\u0399\u039A\u039F\u03A5 \u039A\u0399\u0392\u03A9\u03A4\u0399\u039F\u03A5:");
		springLayout.putConstraint(SpringLayout.WEST, label, 47, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, label, 248, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, label);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -30, SpringLayout.NORTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -140, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nikolas\\Desktop\\ANNA THEA.jpg"));
		frame.getContentPane().add(lblNewLabel);
	}
}