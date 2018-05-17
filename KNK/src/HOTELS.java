import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.CardLayout;

public class HOTELS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOTELS frame = new HOTELS();
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
	public HOTELS() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HOTELS.class.getResource("/Other/rcpb.png")));
		setTitle("Hotel Managment System");
		
		setResizable(false);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(HOTELS.class.getResource("/Other/left-arrow.png")));
		
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				MainWindow window = new MainWindow();
				window.frmHotelManagmentSystem.setVisible(true);
			}
		});
		menuBar.add(btnBack);
		
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
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		
		CardLayout cl=new CardLayout();
		
		//krijimi i tabbedPane per regjistrim
		JPanel registerPanel = new JPanel();
		tabbedPane.addTab("Register", null, registerPanel, null);
		registerPanel.setLayout(cl);
		
		//krijimi i nenpanelit ne registerPanel
		JPanel registerPanel_1 = new JPanel();
		registerPanel.add(registerPanel_1, "name_183748951191215");
		registerPanel_1.setLayout(null);
		
		//krijimi i nenpanelit ne registerPanel
		JPanel registerPanel_2 = new JPanel();
		registerPanel.add(registerPanel_2, "name_183868424313582");
		registerPanel_2.setLayout(null);
		
		
		
		
		
		
		JLabel lblEmri = new JLabel("Name: ");
		lblEmri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmri.setBounds(203, 63, 49, 14);
		registerPanel_1.add(lblEmri);
		
		textField = new JTextField();
		textField.setBounds(249, 62, 242, 20);
		registerPanel_1.add(textField);
		textField.setColumns(10);
		
		
		//grupimi i radiobutonave per stars
		ButtonGroup group= new ButtonGroup();
		
		JLabel lblStars = new JLabel("Stars : ");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStars.setBounds(203, 119, 49, 14);
		registerPanel_1.add(lblStars);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBounds(249, 119, 49, 21);
		registerPanel_1.add(radioButton);
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBounds(300, 118, 49, 20);
		registerPanel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(351, 118, 49, 21);
		registerPanel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBounds(402, 118, 49, 21);
		registerPanel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBounds(453, 117, 38, 23);
		registerPanel_1.add(radioButton_4);
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		
		JLabel lblServices = new JLabel("Free Services:");
		lblServices.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblServices.setBounds(161, 144, 91, 14);
		registerPanel_1.add(lblServices);
		
		JLabel lblFacilities = new JLabel("Paid Services:");
		lblFacilities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFacilities.setBounds(161, 222, 91, 14);
		registerPanel_1.add(lblFacilities);
		
		JCheckBox chckbxRoomService = new JCheckBox("Room Service");
		chckbxRoomService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRoomService.setBounds(249, 142, 108, 23);
		registerPanel_1.add(chckbxRoomService);
		
		JCheckBox chckbxWifi = new JCheckBox("WIFI");
		chckbxWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxWifi.setBounds(249, 168, 64, 23);
		registerPanel_1.add(chckbxWifi);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSpa.setBounds(442, 191, 49, 23);
		registerPanel_1.add(chckbxSpa);
		
		JCheckBox chckbxSwimmingPool = new JCheckBox("Swimming Pool");
		chckbxSwimmingPool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSwimmingPool.setBounds(249, 192, 114, 23);
		registerPanel_1.add(chckbxSwimmingPool);
		
		JCheckBox chckbxArcadeRoom = new JCheckBox("Arcade Room");
		chckbxArcadeRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxArcadeRoom.setBounds(316, 168, 103, 23);
		registerPanel_1.add(chckbxArcadeRoom);
		
		JCheckBox chckbxConferenceRoom = new JCheckBox("Conference Room");
		chckbxConferenceRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxConferenceRoom.setBounds(368, 142, 123, 23);
		registerPanel_1.add(chckbxConferenceRoom);
		
		JLabel lblNewLabel = new JLabel("Register Your Hotel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(220, 11, 245, 36);
		registerPanel_1.add(lblNewLabel);
		
		JLabel lblPleaseInsertA = new JLabel("Password:");
		lblPleaseInsertA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseInsertA.setBounds(181, 296, 71, 19);
		registerPanel_1.add(lblPleaseInsertA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(249, 297, 242, 20);
		registerPanel_1.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Location:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(188, 94, 64, 14);
		registerPanel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 93, 242, 20);
		registerPanel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sauna");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(427, 168, 64, 23);
		registerPanel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alcohol");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(365, 191, 71, 23);
		registerPanel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("Room Service");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox.setBounds(249, 219, 108, 23);
		registerPanel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Conference Room");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_1.setBounds(368, 219, 123, 23);
		registerPanel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("WIFI");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_2.setBounds(249, 245, 64, 23);
		registerPanel_1.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Arcade Room");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_3.setBounds(316, 245, 103, 23);
		registerPanel_1.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Sauna");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_4.setBounds(427, 245, 64, 23);
		registerPanel_1.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Swimming Pool");
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_5.setBounds(249, 269, 114, 23);
		registerPanel_1.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Alcohol");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_6.setBounds(365, 268, 71, 23);
		registerPanel_1.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Spa");
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_7.setBounds(442, 268, 49, 23);
		registerPanel_1.add(checkBox_7);
		
		//Butoni next per panelin register
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registerPanel.removeAll();
				registerPanel.add(registerPanel_2);
				registerPanel.repaint();
				registerPanel.revalidate();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(388, 328, 103, 23);
		registerPanel_1.add(btnNewButton);
		
		//Butoni back per panelin register
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registerPanel.removeAll();
				registerPanel.add(registerPanel_1);
				registerPanel.repaint();
				registerPanel.revalidate();
			}
		});
		btnBack_1.setBounds(417, 314, 89, 23);
		registerPanel_2.add(btnBack_1);
		
		
		//krijimi i tabbedPane Update
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Update", null, updatePanel, null);
		
		
		
		
		
	}
}
