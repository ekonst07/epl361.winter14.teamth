import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Delete {

	private JFrame frmSearchWithThe;
	private JTextField textidbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
					window.frmSearchWithThe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearchWithThe = new JFrame();
		frmSearchWithThe.setTitle("DELETE A PACKET");
		frmSearchWithThe.setBounds(100, 100, 450, 300);
		frmSearchWithThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmSearchWithThe.getContentPane().setLayout(springLayout);
		
		JButton ok = new JButton("OK");
		springLayout.putConstraint(SpringLayout.SOUTH, ok, -35, SpringLayout.SOUTH, frmSearchWithThe.getContentPane());
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmSearchWithThe.getContentPane().add(ok);
		
		JButton btnCancel = new JButton("CANCEL");
		springLayout.putConstraint(SpringLayout.WEST, ok, -126, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, ok, -43, SpringLayout.WEST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCancel, -35, SpringLayout.SOUTH, frmSearchWithThe.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCancel, -33, SpringLayout.EAST, frmSearchWithThe.getContentPane());
		frmSearchWithThe.getContentPane().add(btnCancel);
		
		textidbox = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textidbox, -126, SpringLayout.EAST, btnCancel);
		springLayout.putConstraint(SpringLayout.SOUTH, textidbox, -81, SpringLayout.NORTH, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, textidbox, -33, SpringLayout.EAST, frmSearchWithThe.getContentPane());
		frmSearchWithThe.getContentPane().add(textidbox);
		textidbox.setColumns(10);
		
		JLabel lblInsertThePacket = new JLabel("INSERT THE PACKET NUMBER");
		springLayout.putConstraint(SpringLayout.WEST, lblInsertThePacket, 47, SpringLayout.WEST, frmSearchWithThe.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblInsertThePacket, 0, SpringLayout.SOUTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, lblInsertThePacket, 248, SpringLayout.WEST, frmSearchWithThe.getContentPane());
		frmSearchWithThe.getContentPane().add(lblInsertThePacket);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.NORTH, frmSearchWithThe.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblInsertThePacket);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -30, SpringLayout.NORTH, textidbox);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -140, SpringLayout.EAST, frmSearchWithThe.getContentPane());
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nikolas\\Desktop\\ANNA THEA.jpg"));
		frmSearchWithThe.getContentPane().add(lblNewLabel);
	}
}
