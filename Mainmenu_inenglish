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


public class Mainmenu_inenglish extends JFrame {

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
					 Mainmenu_inenglish frame = new  Mainmenu_inenglish();
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
	public Mainmenu_inenglish() {
		setTitle("\u0391\u03A1\u03A7\u0397 \u039B\u0399\u039C\u0395\u039D\u03A9\u039D \u039B\u0395\u039C\u0395\u03A3\u039F\u03A5");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elena\\Desktop\\arxi limenwn.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 369);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStart = new JMenu("Start");
		menuBar.add(mnStart);
		
		JMenuItem mntmSavedatabase = new JMenuItem("Save Database");
		mntmSavedatabase.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save.png"));
		mnStart.add(mntmSavedatabase);
		
		JMenuItem mntmLoadthedatabase = new JMenuItem("Load the Database");
		mntmLoadthedatabase.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\save1.png"));
		mnStart.add(mntmLoadthedatabase);
		
		JMenuItem mntmLogintinthedatabase = new JMenuItem("Log_int_in the Database");
		mntmLogintinthedatabase.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\User_login-512.png"));
		mnStart.add(mntmLogintinthedatabase);
		
		JMenu mnPacket = new JMenu("Packet");
		menuBar.add(mnPacket);
		
		JMenuItem mntmInsert = new JMenuItem("Insert");
		mntmInsert.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\insert.png"));
		mnPacket.add(mntmInsert);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\delete.png"));
		mnPacket.add(mntmDelete);
		
		JMenuItem mntmProccesing = new JMenuItem("Proccesing");
		mntmProccesing.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\pen_paper_2-512.png"));
		mnPacket.add(mntmProccesing);
		
		JMenu mnSearch = new JMenu("Search");
		mnSearch.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\search.jpg"));
		mnPacket.add(mnSearch);
		
		JMenuItem mntmWithPacketId = new JMenuItem("With packet id");
		mnSearch.add(mntmWithPacketId);
		
		JMenuItem mntmWithPacketPosition = new JMenuItem("With packet position");
		mnSearch.add(mntmWithPacketPosition);
		
		JMenuItem mntmProject = new JMenuItem("Project");
		mntmProject.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\view.png"));
		mnPacket.add(mntmProject);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmDescription = new JMenuItem("Description");
		mntmDescription.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\download.jpg"));
		mnHelp.add(mntmDescription);
		
		JMenu mnNewMenu = new JMenu("Languages");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmEnglish = new JMenuItem("English");
		mntmEnglish.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\en.jpg"));
		mnNewMenu.add(mntmEnglish);
		
		JMenuItem mntmGreek = new JMenuItem("Greek");
		mntmGreek.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\gr.jpg"));
		mnNewMenu.add(mntmGreek);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon("C:\\Users\\elena\\Desktop\\361\\logout-512.png"));
		mnExit.add(mntmExit);
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
