import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JButton;

public class Eisagwgi_greek extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eisagwgi_greek frame = new Eisagwgi_greek();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Eisagwgi_greek() {
		setTitle("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u039A\u03B9\u03B2\u03C9\u03C4\u03AF\u03BF\u03C5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("ID \u039A\u03B9\u03B2\u03C9\u03C4\u03AF\u03BF\u03C5");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 33, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u03A7\u03CE\u03C1\u03B1 \u03A0\u03C1\u03BF\u03C3\u03AD\u03BB\u03B5\u03C5\u03C3\u03B7\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u03A7\u03CE\u03C1\u03B1 \u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 16, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03A0\u03C1\u03BF\u03C3\u03AD\u03BB\u03B5\u03C5\u03C3\u03B7\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 12, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_2, 16, SpringLayout.SOUTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_2, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u038F\u03C1\u03B1 \u03A0\u03C1\u03BF\u03C3\u03AD\u03BB\u03B5\u03C5\u03C3\u03B7\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_3, 0, SpringLayout.NORTH, label_1);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("\u038F\u03C1\u03B1 \u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE\u03C2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, label_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, label_3);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B5\u03C7\u03CC\u03BC\u03B5\u03BD\u03B1 ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_4, 16, SpringLayout.SOUTH, label_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03BF\u03C7\u03AE \u03A6\u03CD\u03BB\u03B1\u03BE\u03B7\u03C2 \u039A\u03B9\u03B2\u03C9\u03C4\u03AF\u03BF\u03C5");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_5, 18, SpringLayout.SOUTH, label_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03BF\u03C7\u03AE");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_6, 6, SpringLayout.SOUTH, label_5);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_6, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u0393\u03C1\u03B1\u03BC\u03BC\u03AE");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_7, 6, SpringLayout.SOUTH, label_6);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_7, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u03A3\u03C4\u03AE\u03BB\u03B7");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_8, 15, SpringLayout.SOUTH, label_7);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_8, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(label_8);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 97, SpringLayout.EAST, lblNewLabel);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 9, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, label);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, label_3, 46, SpringLayout.EAST, textField_3);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, label_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_5, -3, SpringLayout.NORTH, label_4);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_6, -3, SpringLayout.NORTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_6, 20, SpringLayout.EAST, label_3);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_7, -3, SpringLayout.NORTH, label_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, textField_6);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_8, -3, SpringLayout.NORTH, label_6);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_8, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_9, 0, SpringLayout.NORTH, label_7);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_10, -3, SpringLayout.NORTH, label_8);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		table = new JTable();
		sl_contentPane.putConstraint(SpringLayout.NORTH, table, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, table, -100, SpringLayout.EAST, contentPane);
		contentPane.add(table);
		
		JDesktopPane desktopPane = new JDesktopPane();
		sl_contentPane.putConstraint(SpringLayout.EAST, desktopPane, -155, SpringLayout.EAST, contentPane);
		contentPane.add(desktopPane);
		
		JButton btnSave = new JButton("\u03A6\u03CD\u03BB\u03B1\u03BE\u03B7");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSave, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSave, -59, SpringLayout.EAST, contentPane);
		contentPane.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eisagwgi_greek.this.dispose();
				MainMenu_greek.main(null);
			}
		});
		
		
		
		
		JButton btnCancel = new JButton("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancel, 0, SpringLayout.NORTH, btnSave);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancel, -6, SpringLayout.WEST, btnSave);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eisagwgi_greek.this.dispose();
				MainMenu_greek.main(null);
			}
		});
	
	
	}
}
