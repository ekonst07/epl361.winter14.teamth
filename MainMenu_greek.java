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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu_greek extends JFrame {

	private JPanel contentPane;
	private final Panel panel = new Panel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu_greek frame = new MainMenu_greek();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu_greek() {
		setTitle("\u0391\u03A1\u03A7\u0397 \u039B\u0399\u039C\u0395\u039D\u03A9\u039D \u039B\u0395\u039C\u0395\u03A3\u039F\u03A5");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elena\\Desktop\\arxi limenwn.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 369);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_4 = new JMenu("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		menuBar.add(menu_4);
		
		JMenuItem menuApothikeusi = new JMenuItem("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuApothikeusi.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save.png"));
		menu_4.add(menuApothikeusi);
		
		JMenuItem menuFortosi = new JMenuItem("\u03A6\u03CC\u03C1\u03C4\u03C9\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuFortosi.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save1.png"));
		menu_4.add(menuFortosi);
		
		JMenuItem menuLogin = new JMenuItem("\u03A0\u03C1\u03CC\u03C3\u03B2\u03B1\u03C3\u03B7 \u0392\u03AC\u03C3\u03B7\u03C2");
		menuLogin.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\User_login-512.png"));
		menu_4.add(menuLogin);
		menuLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					UserName_password.main(null);
					}
				}
			);
		
		
		JMenu menu = new JMenu("\u039A\u03B9\u03B2\u03CE\u03C4\u03B9\u03BF");
		menuBar.add(menu);
		
		JMenuItem menuEisagwgi = new JMenuItem("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		menuEisagwgi.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\insert.png"));
		menu.add(menuEisagwgi);
		menuEisagwgi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_greek.this.dispose();
					Eisagwgi_greek.main(null);
					}
				}
			);
		
		
		JMenuItem menuDiagrafi = new JMenuItem("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		menuDiagrafi.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\delete.png"));
		menu.add(menuDiagrafi);
		menuDiagrafi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Diagrafi_greek.main(null);
			}
		}
		);
		
		JMenuItem menuEpexergasia = new JMenuItem("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		menuEpexergasia.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\pen_paper_2-512.png"));
		menu.add(menuEpexergasia);
		
		JMenu menu_2 = new JMenu("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		menu_2.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\search.jpg"));
		menu.add(menu_2);
		
		JMenuItem menuAnazitisi_kwdiko = new JMenuItem("\u039C\u03B5 \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC");
		menuAnazitisi_kwdiko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Anazitisi_ID.main(null);
			}
		});
		menu_2.add(menuAnazitisi_kwdiko);
		
		JMenuItem menuAnazitisi_thesi = new JMenuItem("\u039C\u03B5 \u03B8\u03AD\u03C3\u03B7 \u03BA\u03B9\u03B2\u03C9\u03C4\u03AF\u03BF\u03C5");
		menuAnazitisi_thesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Anazitisi_Thesi.main(null);
				
			}
		});
		menu_2.add(menuAnazitisi_thesi);
		
		JMenuItem menuProvoli = new JMenuItem("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE");
		menuProvoli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Provoli_greek.main(null);
				
			}
		});
		menuProvoli.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\view.png"));
		menu.add(menuProvoli);
		
		JMenu menu_1 = new JMenu("\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1");
		menuBar.add(menu_1);
		
		JMenuItem menuPerigrafi = new JMenuItem("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		menuPerigrafi.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\download.jpg"));
		menu_1.add(menuPerigrafi);
		
		JMenu mnNewMenu = new JMenu("\u0393\u03BB\u03CE\u03C3\u03C3\u03B1");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuAgglika = new JMenuItem("\u0391\u03B3\u03B3\u03BB\u03B9\u03BA\u03AC");
		menuAgglika.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\en.jpg"));
		mnNewMenu.add(menuAgglika);
		menuAgglika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu_english.main(null);
				
			}
		});
		
		
		
		
		
		JMenuItem menuEllinika = new JMenuItem("\u0395\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03AC");
		menuEllinika.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\gr.jpg"));
		mnNewMenu.add(menuEllinika);
		
		JMenu menu_3 = new JMenu("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		menuBar.add(menu_3);
		
		JMenuItem menuExit = new JMenuItem("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		menuExit.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\logout-512.png"));
		menu_3.add(menuExit);
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
