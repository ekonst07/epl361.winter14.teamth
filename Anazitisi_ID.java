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
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;


public class Anazitisi_ID {

	private JFrame frame;
	private JTextField textidbox;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anazitisi_ID window = new Anazitisi_ID();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Anazitisi_ID() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u039C\u0395 \u0392\u0391\u03A3\u0397 TO ID");
		frame.setBounds(100, 100, 388, 278);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnok = new JButton("OK");
		springLayout.putConstraint(SpringLayout.WEST, btnok, 231, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnok, -23, SpringLayout.SOUTH, frame.getContentPane());
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);	
			//	Anazitisi_ID.this.dispose();
				
			}
		});
		frame.getContentPane().add(btnok);
		
		JButton btnCancel = new JButton("CANCEL");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancel, 0, SpringLayout.NORTH, btnok);
		springLayout.putConstraint(SpringLayout.EAST, btnCancel, -6, SpringLayout.WEST, btnok);
		frame.getContentPane().add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);	
				//Anazitisi_ID.this.dispose();
			}
		});	
		
		
		textidbox = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, btnok, 0, SpringLayout.EAST, textidbox);
		springLayout.putConstraint(SpringLayout.NORTH, textidbox, 94, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textidbox, -70, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textidbox);
		textidbox.setColumns(10);
		
		JLabel lblId = new JLabel("ID \u039A\u0399\u0392\u03A9\u03A4\u0399\u039F\u03A5:");
		springLayout.putConstraint(SpringLayout.NORTH, lblId, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblId, 83, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblId, -202, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textidbox, 6, SpringLayout.EAST, lblId);
		frame.getContentPane().add(lblId);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane);
	}
}
