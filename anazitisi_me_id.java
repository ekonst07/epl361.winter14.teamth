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


public class anazitisi_me_id {

	private JFrame frame;
	private JTextField textidbox;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anazitisi_me_id window = new anazitisi_me_id();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public anazitisi_me_id() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u039C\u0395 \u0392\u0391\u03A3\u0397 TO ID");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton ok = new JButton("OK");
		springLayout.putConstraint(SpringLayout.SOUTH, ok, -35, SpringLayout.SOUTH, frame.getContentPane());
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(ok);
		
		JButton btnCancel = new JButton("CANCEL");
		springLayout.putConstraint(SpringLayout.WEST, ok, -126, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, ok, -43, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCancel, -35, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCancel, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnCancel);
		
		textidbox = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textidbox, -126, SpringLayout.EAST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, textidbox, -81, SpringLayout.NORTH, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, textidbox, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textidbox);
		textidbox.setColumns(10);
		
		JLabel lblId = new JLabel("\u0395\u0399\u03A3\u0391\u0393\u03A9\u0393\u0397 ID \u039A\u0399\u0392\u03A9\u03A4\u0399\u039F\u03A5:");
		springLayout.putConstraint(SpringLayout.WEST, lblId, 47, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblId, 0, SpringLayout.SOUTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, lblId, 248, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblId);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblId);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -30, SpringLayout.NORTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -140, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nikolas\\Desktop\\ANNA THEA.jpg"));
		frame.getContentPane().add(lblNewLabel);
	}
}
