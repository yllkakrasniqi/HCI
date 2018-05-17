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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;

public class HOTELS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainWindow window = new MainWindow();
				window.frame.setVisible(true);
			}
		});
		menuBar.add(mntmHome);
		
		
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
		
		ButtonGroup group= new ButtonGroup();
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Register", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblEmri = new JLabel("Name: ");
		lblEmri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmri.setBounds(203, 63, 49, 14);
		panel.add(lblEmri);
		
		textField = new JTextField();
		textField.setBounds(249, 62, 242, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblStars = new JLabel("Stars : ");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStars.setBounds(203, 119, 49, 14);
		panel.add(lblStars);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBounds(249, 119, 49, 21);
		panel.add(radioButton);
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBounds(300, 118, 49, 20);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(351, 118, 49, 21);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBounds(402, 118, 49, 21);
		panel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBounds(453, 117, 38, 23);
		panel.add(radioButton_4);
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		
		JLabel lblServices = new JLabel("Free Services:");
		lblServices.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblServices.setBounds(161, 144, 91, 14);
		panel.add(lblServices);
		
		JLabel lblFacilities = new JLabel("Paid Services:");
		lblFacilities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFacilities.setBounds(161, 222, 91, 14);
		panel.add(lblFacilities);
		
		JCheckBox chckbxRoomService = new JCheckBox("Room Service");
		chckbxRoomService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRoomService.setBounds(249, 142, 108, 23);
		panel.add(chckbxRoomService);
		
		JCheckBox chckbxWifi = new JCheckBox("WIFI");
		chckbxWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxWifi.setBounds(249, 168, 64, 23);
		panel.add(chckbxWifi);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSpa.setBounds(442, 191, 49, 23);
		panel.add(chckbxSpa);
		
		JCheckBox chckbxSwimmingPool = new JCheckBox("Swimming Pool");
		chckbxSwimmingPool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSwimmingPool.setBounds(249, 192, 114, 23);
		panel.add(chckbxSwimmingPool);
		
		JCheckBox chckbxArcadeRoom = new JCheckBox("Arcade Room");
		chckbxArcadeRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxArcadeRoom.setBounds(316, 168, 103, 23);
		panel.add(chckbxArcadeRoom);
		
		JCheckBox chckbxConferenceRoom = new JCheckBox("Conference Room");
		chckbxConferenceRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxConferenceRoom.setBounds(368, 142, 123, 23);
		panel.add(chckbxConferenceRoom);
		
		JLabel lblNewLabel = new JLabel("Register Your Hotel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(220, 11, 245, 36);
		panel.add(lblNewLabel);
		
		JLabel lblPleaseInsertA = new JLabel("Password:");
		lblPleaseInsertA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseInsertA.setBounds(181, 296, 71, 19);
		panel.add(lblPleaseInsertA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(249, 297, 242, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Location:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(188, 94, 64, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 93, 242, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sauna");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(427, 168, 64, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alcohol");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(365, 191, 71, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("Room Service");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox.setBounds(249, 219, 108, 23);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Conference Room");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_1.setBounds(368, 219, 123, 23);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("WIFI");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_2.setBounds(249, 245, 64, 23);
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Arcade Room");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_3.setBounds(316, 245, 103, 23);
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Sauna");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_4.setBounds(427, 245, 64, 23);
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Swimming Pool");
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_5.setBounds(249, 269, 114, 23);
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Alcohol");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_6.setBounds(365, 268, 71, 23);
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Spa");
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_7.setBounds(442, 268, 49, 23);
		panel.add(checkBox_7);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(388, 328, 103, 23);
		panel.add(btnNewButton);
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Update", null, panel_1, null);
	}
}
