import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Canvas;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.UIManager;


public class MainMenu extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=92,-31
	 */
	private final Panel panel_1 = new Panel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setTitle("\u0391\u03A1\u03A7\u0397 \u039B\u0399\u039C\u0395\u039D\u03A9\u039D \u039B\u0395\u039C\u0395\u03A3\u039F\u03A5");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elena\\Desktop\\arxi limenwn.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 369);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_4 = new JMenu("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		menuBar.add(menu_4);
		
		JMenuItem menuItem_8 = new JMenuItem("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuItem_8.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save.png"));
		menu_4.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("\u03A6\u03CC\u03C1\u03C4\u03C9\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuItem_9.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save1.png"));
		menu_4.add(menuItem_9);
		
		JMenuItem menuItem_11 = new JMenuItem("\u03A0\u03C1\u03CC\u03C3\u03B2\u03B1\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuItem_11.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\User_login-512.png"));
		menu_4.add(menuItem_11);
		
		JMenu menu = new JMenu("\u039A\u03B9\u03B2\u03CE\u03C4\u03B9\u03BF");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		menuItem.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\insert.png"));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		menuItem_1.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\delete.png"));
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		menuItem_2.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\pen_paper_2-512.png"));
		menu.add(menuItem_2);
		
		JMenu menu_2 = new JMenu("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		menu_2.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\search.jpg"));
		menu.add(menu_2);
		
		JMenuItem menuItem_4 = new JMenuItem("\u039C\u03B5 \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC");
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u039C\u03B5 \u03B8\u03AD\u03C3\u03B7 \u03BA\u03B9\u03B2\u03C9\u03C4\u03AF\u03BF\u03C5");
		menu_2.add(menuItem_5);
		
		JMenuItem menuItem_10 = new JMenuItem("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE");
		menuItem_10.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\view.png"));
		menu.add(menuItem_10);
		
		JMenu menu_1 = new JMenu("\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_12 = new JMenuItem("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		menuItem_12.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\download.jpg"));
		menu_1.add(menuItem_12);
		
		JMenu mnNewMenu = new JMenu("\u0393\u03BB\u03CE\u03C3\u03C3\u03B1");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_3 = new JMenuItem("\u0391\u03B3\u03B3\u03BB\u03B9\u03BA\u03AC");
		menuItem_3.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\en.jpg"));
		mnNewMenu.add(menuItem_3);
		
		JMenuItem menuItem_6 = new JMenuItem("\u0395\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03AC");
		menuItem_6.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\gr.jpg"));
		mnNewMenu.add(menuItem_6);
		
		JMenu menu_3 = new JMenu("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_7 = new JMenuItem("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		menuItem_7.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\logout-512.png"));
		menu_3.add(menuItem_7);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel label = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 47, SpringLayout.WEST, contentPane);
		label.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\arxi limenwn - Copy.png"));
		contentPane.add(label);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
