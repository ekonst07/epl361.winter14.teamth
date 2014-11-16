import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Anazitisi_Thesi {

	private JFrame frame;
	private JTextField textidbox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anazitisi_Thesi window = new Anazitisi_Thesi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Anazitisi_Thesi() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u039C\u0395 \u0392\u0391\u03A3\u0397 \u03A4\u0397 \u0398\u0395\u03A3\u0397");
		frame.setBounds(100, 100, 401, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnok = new JButton("OK");
		springLayout.putConstraint(SpringLayout.NORTH, btnok, -117, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnok, 196, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnok, -94, SpringLayout.SOUTH, frame.getContentPane());
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.main(null);	
				//Anazitisi_ID.this.dispose();
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
		springLayout.putConstraint(SpringLayout.EAST, textidbox, -102, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textidbox);
		textidbox.setColumns(10);
		
		JLabel label = new JLabel("\u0398\u0395\u03A3\u0397\u03A3 \u039A\u0399\u0392\u03A9\u03A4\u0399\u039F\u03A5:");
		springLayout.putConstraint(SpringLayout.NORTH, textidbox, -3, SpringLayout.NORTH, label);
		springLayout.putConstraint(SpringLayout.WEST, textidbox, 6, SpringLayout.EAST, label);
		springLayout.putConstraint(SpringLayout.EAST, label, -234, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -189, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 47, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -140, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nikolas\\Desktop\\ANNA THEA.jpg"));
		frame.getContentPane().add(lblNewLabel);
	}
}
