import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Toolkit;

public class MainWindow {

	public JFrame frmHotelManagmentSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmHotelManagmentSystem.setVisible(true);
					window.frmHotelManagmentSystem.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmHotelManagmentSystem = new JFrame();
		frmHotelManagmentSystem.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/Other/rcpb.png")));
		frmHotelManagmentSystem.setTitle("Hotel Managment System");
		frmHotelManagmentSystem.setResizable(false);
		frmHotelManagmentSystem.getContentPane().setBackground(new Color(255, 255, 255));
		frmHotelManagmentSystem.setBounds(100, 100, 750, 480);
		frmHotelManagmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelManagmentSystem.getContentPane().setLayout(null);
		frmHotelManagmentSystem.setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 74, 94));
		panel.setBounds(0, 0, 734, 100);
		frmHotelManagmentSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToHotel = new JLabel("Welcome to Hotel Managment System");
		lblWelcomeToHotel.setBounds(129, 32, 481, 35);
		lblWelcomeToHotel.setForeground(new Color(255, 219, 130));
		panel.add(lblWelcomeToHotel);
		lblWelcomeToHotel.setFont(new Font("Bahnschrift", Font.PLAIN, 29));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 219, 130));
		panel_1.setBounds(0, 100, 734, 319);
		frmHotelManagmentSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(78, 63, 200, 200);
		panel_1.add(btnNewButton);
		btnNewButton.setBackground(new Color(50, 74, 94));
		btnNewButton.setForeground(new Color(0, 153, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/Other/hotel (2).png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Shfaqim dritaren per Hotels
				frmHotelManagmentSystem.setVisible(false);
				HOTELS hot=new HOTELS();
				hot.setVisible(true);
				hot.setLocationRelativeTo(null);
			}
		});
		
		
		
		JButton btnClients = new JButton("");
		btnClients.setBounds(450, 63, 200, 200);
		btnClients.setIcon(new ImageIcon(MainWindow.class.getResource("/Other/reception.png")));
		btnClients.setBackground(new Color(253, 132, 105));
		btnClients.setFocusPainted(false);
		panel_1.add(btnClients);
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Shfaqim dritaren per Clients
				frmHotelManagmentSystem.dispose();
				CLIENTS cli=new CLIENTS();
				cli.setVisible(true);
				cli.setLocationRelativeTo(null);
			}
		});
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frmHotelManagmentSystem.setJMenuBar(menuBar);
		
		JMenu mnLanguages = new JMenu("Languages");
		menuBar.add(mnLanguages);
		
		JMenuItem mntmAlbanian = new JMenuItem("Albanian");
		mnLanguages.add(mntmAlbanian);
		
		JMenuItem mntmEnglish = new JMenuItem("English");
		mnLanguages.add(mntmEnglish);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutHms = new JMenuItem("About HMS");
		mnHelp.add(mntmAboutHms);
		
		
		
	}
}
