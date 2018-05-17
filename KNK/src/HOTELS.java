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
					frame.setLocationRelativeTo(null);
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
		
		JLabel lblNewLabel_2 = new JLabel("Rooms");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(291, 11, 72, 23);
		registerPanel_2.add(lblNewLabel_2);
		
		JLabel lblSingleRoom = new JLabel("SingleRoom:");
		lblSingleRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSingleRoom.setBounds(26, 39, 89, 23);
		registerPanel_2.add(lblSingleRoom);
		
		txtNrSingleRooms = new JTextField();
		txtNrSingleRooms.setBounds(175, 68, 64, 23);
		registerPanel_2.add(txtNrSingleRooms);
		txtNrSingleRooms.setColumns(10);
		
		JLabel lblNrSingleRooms = new JLabel("Number of Rooms:");
		lblNrSingleRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrSingleRooms.setBounds(69, 71, 108, 14);
		registerPanel_2.add(lblNrSingleRooms);
		
		JLabel lblSinglePrice = new JLabel("Price:");
		lblSinglePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSinglePrice.setBounds(249, 71, 46, 14);
		registerPanel_2.add(lblSinglePrice);
		
		txtSinglePrice = new JTextField();
		txtSinglePrice.setBounds(290, 68, 86, 23);
		registerPanel_2.add(txtSinglePrice);
		txtSinglePrice.setColumns(10);
		
		JLabel lblDoubleRoom = new JLabel("DoubleRoom:");
		lblDoubleRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoubleRoom.setBounds(26, 156, 89, 23);
		registerPanel_2.add(lblDoubleRoom);
		
		JLabel lblNrDoubleRooms = new JLabel("Number of Rooms:");
		lblNrDoubleRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrDoubleRooms.setBounds(69, 188, 108, 14);
		registerPanel_2.add(lblNrDoubleRooms);
		
		txtNrDoubleRooms = new JTextField();
		txtNrDoubleRooms.setColumns(10);
		txtNrDoubleRooms.setBounds(175, 185, 64, 23);
		registerPanel_2.add(txtNrDoubleRooms);
		
		JLabel lblDoublePrice = new JLabel("Price:");
		lblDoublePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDoublePrice.setBounds(249, 188, 46, 14);
		registerPanel_2.add(lblDoublePrice);
		
		txtDoublePrice = new JTextField();
		txtDoublePrice.setColumns(10);
		txtDoublePrice.setBounds(291, 185, 86, 23);
		registerPanel_2.add(txtDoublePrice);
		
		JLabel lblDoubleDoubleRoom = new JLabel("DoubleDoubleRoom:");
		lblDoubleDoubleRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoubleDoubleRoom.setBounds(26, 390, 134, 23);
		registerPanel_2.add(lblDoubleDoubleRoom);
		
		JLabel lblNrDoubleDoubleRooms = new JLabel("Number of Rooms:");
		lblNrDoubleDoubleRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrDoubleDoubleRooms.setBounds(69, 422, 108, 14);
		registerPanel_2.add(lblNrDoubleDoubleRooms);
		
		txtDoubleDoubleRooms = new JTextField();
		txtDoubleDoubleRooms.setColumns(10);
		txtDoubleDoubleRooms.setBounds(175, 419, 64, 23);
		registerPanel_2.add(txtDoubleDoubleRooms);
		
		JLabel lblDoubleDoublePrice = new JLabel("Price:");
		lblDoubleDoublePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDoubleDoublePrice.setBounds(249, 422, 46, 14);
		registerPanel_2.add(lblDoubleDoublePrice);
		
		txtDoubleDoublePrice = new JTextField();
		txtDoubleDoublePrice.setColumns(10);
		txtDoubleDoublePrice.setBounds(290, 419, 86, 23);
		registerPanel_2.add(txtDoubleDoublePrice);
		
		JLabel lblTwinRoom = new JLabel("TwinRoom:");
		lblTwinRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTwinRoom.setBounds(26, 273, 77, 23);
		registerPanel_2.add(lblTwinRoom);
		
		JLabel lblNrTwinRoom = new JLabel("Number of Rooms:");
		lblNrTwinRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrTwinRoom.setBounds(69, 305, 108, 14);
		registerPanel_2.add(lblNrTwinRoom);
		
		txtNrTwinRoom = new JTextField();
		txtNrTwinRoom.setColumns(10);
		txtNrTwinRoom.setBounds(175, 302, 64, 23);
		registerPanel_2.add(txtNrTwinRoom);
		
		JLabel lblTwinPrice = new JLabel("Price:");
		lblTwinPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTwinPrice.setBounds(249, 305, 46, 14);
		registerPanel_2.add(lblTwinPrice);
		
		txtTwinPrice = new JTextField();
		txtTwinPrice.setColumns(10);
		txtTwinPrice.setBounds(290, 302, 86, 23);
		registerPanel_2.add(txtTwinPrice);
		
		JLabel lblLanairoom = new JLabel("LanaiRoom:");
		lblLanairoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLanairoom.setBounds(26, 507, 134, 23);
		registerPanel_2.add(lblLanairoom);
		
		JLabel lblNrLanaiRooms = new JLabel("Number of Rooms:");
		lblNrLanaiRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrLanaiRooms.setBounds(69, 539, 108, 14);
		registerPanel_2.add(lblNrLanaiRooms);
		
		txtNrLanaiRooms = new JTextField();
		txtNrLanaiRooms.setColumns(10);
		txtNrLanaiRooms.setBounds(175, 536, 64, 23);
		registerPanel_2.add(txtNrLanaiRooms);
		
		JLabel lblLanaiPrice = new JLabel("Price:");
		lblLanaiPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLanaiPrice.setBounds(249, 539, 46, 14);
		registerPanel_2.add(lblLanaiPrice);
		
		txtLanaiPrice = new JTextField();
		txtLanaiPrice.setColumns(10);
		txtLanaiPrice.setBounds(291, 536, 86, 23);
		registerPanel_2.add(txtLanaiPrice);
		
		JLabel lblSuiteRoom = new JLabel("SuiteRoom:");
		lblSuiteRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuiteRoom.setBounds(26, 624, 134, 23);
		registerPanel_2.add(lblSuiteRoom);
		
		JLabel lblNrSuiteRooms = new JLabel("Number of Rooms:");
		lblNrSuiteRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrSuiteRooms.setBounds(69, 656, 108, 14);
		registerPanel_2.add(lblNrSuiteRooms);
		
		txtNrSuiteRooms = new JTextField();
		txtNrSuiteRooms.setColumns(10);
		txtNrSuiteRooms.setBounds(175, 653, 64, 23);
		registerPanel_2.add(txtNrSuiteRooms);
		
		JLabel lblSuitePrice = new JLabel("Price:");
		lblSuitePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSuitePrice.setBounds(249, 656, 46, 14);
		registerPanel_2.add(lblSuitePrice);
		
		txtSuitePrice = new JTextField();
		txtSuitePrice.setColumns(10);
		txtSuitePrice.setBounds(290, 653, 86, 23);
		registerPanel_2.add(txtSuitePrice);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(696, 142, -665, 14);
		registerPanel_2.add(separator);
		
		JButton btnSingle = new JButton("Upload Image");
		btnSingle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSingle.setBounds(386, 68, 108, 23);
		registerPanel_2.add(btnSingle);
		
		JButton btnDouble = new JButton("Upload Image");
		btnDouble.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDouble.setBounds(386, 185, 108, 23);
		registerPanel_2.add(btnDouble);
		
		JLabel label = new JLabel("");
		label.setBounds(507, 156, 202, 111);
		registerPanel_2.add(label);
		
		JButton button = new JButton("Upload Image");
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(386, 302, 108, 23);
		registerPanel_2.add(button);
		
		JButton button_1 = new JButton("Upload Image");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBounds(386, 419, 108, 23);
		registerPanel_2.add(button_1);
		
		JButton button_2 = new JButton("Upload Image");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(386, 536, 108, 23);
		registerPanel_2.add(button_2);
		
		JButton button_3 = new JButton("Upload Image");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_3.setBounds(386, 653, 108, 23);
		registerPanel_2.add(button_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(507, 273, 202, 111);
		registerPanel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(507, 390, 202, 111);
		registerPanel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(507, 507, 202, 111);
		registerPanel_2.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(507, 624, 202, 111);
		registerPanel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(507, 39, 202, 111);
		registerPanel_2.add(label_5);
		
		
		//krijimi i tabbedPane Update
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Update", null, updatePanel, null);
		
	}
}
