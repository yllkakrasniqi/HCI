import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class HOTELS extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField txtLocation;
	private JTextField txtNrSingleRooms;
	private JTextField txtSinglePrice;
	private JTextField txtNrDoubleRooms;
	private JTextField txtDoublePrice;
	private JTextField txtDoubleDoubleRooms;
	private JTextField txtDoubleDoublePrice;
	private JTextField txtNrTwinRoom;
	private JTextField txtTwinPrice;
	private JTextField txtNrLanaiRooms;
	private JTextField txtLanaiPrice;
	private JTextField txtNrSuiteRooms;
	private JTextField txtSuitePrice;

	int stars=0;
	String RoomService="";
	String ConferenceRoom="";
	String WIFI="";
	String ArcadeRoom="";
	String Sauna="";
	String Pool="";
	String Alcohol="";
	String Spa="";
	
	String pRoomService="";
	String pConferenceRoom="";
	String pWIFI="";
	String pArcadeRoom="";
	String pSauna="";
	String pPool="";
	String pAlcohol="";
	String pSpa="";
	
	String singleRoomPath="";
	String doubleRoomPath="";
	String twinRoomPath="";
	
	
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

	
	Connection connection=null;
	
	/**
	 * Create the frame.
	 */
	public HOTELS() {
		
		
		
		
		//thirrja e klases e cila krijon lidhjen me databazen e MySQL
		connection=dbConnector.dbConnection();
		
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
		
		
		
		txtName = new JTextField();
		txtName.setBounds(249, 62, 242, 20);
		registerPanel_1.add(txtName);
		txtName.setColumns(10);
		
		
		//grupimi i radiobutonave per stars
		ButtonGroup group= new ButtonGroup();
		
		JLabel lblStars = new JLabel("Stars : ");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStars.setBounds(203, 119, 49, 14);
		registerPanel_1.add(lblStars);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stars=1;
			}
		});
		radioButton.setBounds(249, 119, 49, 21);
		registerPanel_1.add(radioButton);
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stars=2;
			}
		});
		radioButton_1.setBounds(300, 118, 49, 20);
		registerPanel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stars=3;
			}
		});
		radioButton_2.setBounds(351, 118, 49, 21);
		registerPanel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stars=4;
			}
		});
		radioButton_3.setBounds(402, 118, 49, 21);
		registerPanel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stars=5;
			}
		});
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
		chckbxRoomService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!RoomService.isEmpty())
					RoomService="";
				else
					RoomService="Yes";
			}
		});
		chckbxRoomService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRoomService.setBounds(249, 142, 108, 23);
		registerPanel_1.add(chckbxRoomService);
		
		JCheckBox chckbxWifi = new JCheckBox("WIFI");
		chckbxWifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!WIFI.isEmpty())
					WIFI="";
				else
					WIFI="Yes";
			}
		});
		chckbxWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxWifi.setBounds(249, 168, 64, 23);
		registerPanel_1.add(chckbxWifi);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Spa.isEmpty())
					Spa="";
				else
					Spa="Yes";
			}
		});
		chckbxSpa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSpa.setBounds(442, 191, 49, 23);
		registerPanel_1.add(chckbxSpa);
		
		JCheckBox chckbxSwimmingPool = new JCheckBox("Swimming Pool");
		chckbxSwimmingPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Pool.isEmpty())
					Pool="";
				else
					Pool="Yes";
			}
		});
		chckbxSwimmingPool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSwimmingPool.setBounds(249, 192, 114, 23);
		registerPanel_1.add(chckbxSwimmingPool);
		
		JCheckBox chckbxArcadeRoom = new JCheckBox("Arcade Room");
		chckbxArcadeRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!ArcadeRoom.isEmpty())
					ArcadeRoom="";
				else
					ArcadeRoom="Yes";
			}
		});
		chckbxArcadeRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxArcadeRoom.setBounds(316, 168, 103, 23);
		registerPanel_1.add(chckbxArcadeRoom);
		
		JCheckBox chckbxConferenceRoom = new JCheckBox("Conference Room");
		chckbxConferenceRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!ConferenceRoom.isEmpty())
					ConferenceRoom="";
				else
					ConferenceRoom="Yes";
			}
		});
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
		
		txtLocation = new JTextField();
		txtLocation.setBounds(249, 93, 242, 20);
		registerPanel_1.add(txtLocation);
		txtLocation.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sauna");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Sauna.isEmpty())
					Sauna="";
				else
					Sauna="Yes";
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(427, 168, 64, 23);
		registerPanel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alcohol");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Alcohol.isEmpty())
					Alcohol="";
				else
					Alcohol="Yes";
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(365, 191, 71, 23);
		registerPanel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("Room Service");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pRoomService.isEmpty())
					pRoomService="";
				else
					pRoomService="Yes";
			}
		});
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox.setBounds(249, 219, 108, 23);
		registerPanel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Conference Room");
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pConferenceRoom.isEmpty())
					pConferenceRoom="";
				else
					pConferenceRoom="Yes";
			}
		});
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_1.setBounds(368, 219, 123, 23);
		registerPanel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("WIFI");
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pWIFI.isEmpty())
					pWIFI="";
				else
					pWIFI="Yes";

			}
		});
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_2.setBounds(249, 245, 64, 23);
		registerPanel_1.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Arcade Room");
		checkBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pArcadeRoom.isEmpty())
					pArcadeRoom="";
				else
					pArcadeRoom="Yes";
			}
		});
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_3.setBounds(316, 245, 103, 23);
		registerPanel_1.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Sauna");
		checkBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pSauna.isEmpty())
					pSauna="";
				else
					pSauna="Yes";
			}
		});
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_4.setBounds(427, 245, 64, 23);
		registerPanel_1.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Swimming Pool");
		checkBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pPool.isEmpty())
					pPool="";
				else
					pPool="Yes";
			}
		});
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_5.setBounds(249, 269, 114, 23);
		registerPanel_1.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Alcohol");
		checkBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pAlcohol.isEmpty())
					pAlcohol="";
				else
					pAlcohol="Yes";
			}
		});
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkBox_6.setBounds(365, 268, 71, 23);
		registerPanel_1.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Spa");
		checkBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!pSpa.isEmpty())
					pSpa="";
				else
					pSpa="Yes";
			}
		});
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
		btnNewButton.setBounds(10, 11, 103, 23);
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
		btnBack_1.setBounds(7, 11, 108, 23);
		registerPanel_2.add(btnBack_1);
		
		
		//Pytesori per Dhomat Ku per secilin lloj kerkohet nr i dhomave cmimi dhe nje foto
		JLabel lblNewLabel_2 = new JLabel("Rooms");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(291, 11, 72, 23);
		registerPanel_2.add(lblNewLabel_2);
		
		JLabel lblSingleRoom = new JLabel("SingleRoom:");
		lblSingleRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSingleRoom.setBounds(26, 39, 89, 23);
		registerPanel_2.add(lblSingleRoom);
		
		txtNrSingleRooms = new JTextField();
		txtNrSingleRooms.setBounds(175, 68, 51, 23);
		registerPanel_2.add(txtNrSingleRooms);
		txtNrSingleRooms.setColumns(10);
		
		JLabel lblNrSingleRooms = new JLabel("Number of Rooms:");
		lblNrSingleRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNrSingleRooms.setBounds(69, 71, 108, 14);
		registerPanel_2.add(lblNrSingleRooms);
		
		JLabel lblSinglePrice = new JLabel("Price:");
		lblSinglePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSinglePrice.setBounds(236, 71, 46, 14);
		registerPanel_2.add(lblSinglePrice);
		
		txtSinglePrice = new JTextField();
		txtSinglePrice.setBounds(271, 68, 72, 23);
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
		txtNrDoubleRooms.setBounds(175, 185, 51, 23);
		registerPanel_2.add(txtNrDoubleRooms);
		
		JLabel lblDoublePrice = new JLabel("Price:");
		lblDoublePrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDoublePrice.setBounds(236, 188, 46, 14);
		registerPanel_2.add(lblDoublePrice);
		
		txtDoublePrice = new JTextField();
		txtDoublePrice.setColumns(10);
		txtDoublePrice.setBounds(271, 185, 72, 23);
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
		txtNrTwinRoom.setBounds(175, 302, 51, 23);
		registerPanel_2.add(txtNrTwinRoom);
		
		JLabel lblTwinPrice = new JLabel("Price:");
		lblTwinPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTwinPrice.setBounds(236, 305, 46, 14);
		registerPanel_2.add(lblTwinPrice);
		
		txtTwinPrice = new JTextField();
		txtTwinPrice.setColumns(10);
		txtTwinPrice.setBounds(271, 302, 72, 23);
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
		
		//Krijimi i border per labelat e imazheve
		Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
		
		JLabel lblDoubleImage = new JLabel("");
		lblDoubleImage.setBounds(504, 142, 202, 111);
		registerPanel_2.add(lblDoubleImage);
		lblDoubleImage.setBorder(border);
		
		JLabel lblSingleImage = new JLabel("");
		lblSingleImage.setBounds(504, 24, 202, 111);
		registerPanel_2.add(lblSingleImage);
		lblSingleImage.setBorder(border);
		
		JLabel lblTwinImage = new JLabel("");
		lblTwinImage.setBounds(504, 259, 202, 111);
		registerPanel_2.add(lblTwinImage);
		lblTwinImage.setBorder(border);
		
		//Butoni per image upload te fotove
		JButton btnSingle = new JButton("Upload Image");
		btnSingle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Marrja e file nga sistemi
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
			
				singleRoomPath=filename;//ruajme path te imazhit per ruajte ne databaze
				
				//Manipulimi per vendosjen e fotos ne label perkatese
				ImageIcon icon=new ImageIcon(filename);
				Image img=icon.getImage();
				Image newImg=img.getScaledInstance(lblSingleImage.getWidth(),lblSingleImage.getHeight(),Image.SCALE_SMOOTH);
				ImageIcon newIcon=new ImageIcon(newImg);
				lblSingleImage.setIcon(newIcon);
				
				
				
			}
		});
		btnSingle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSingle.setBounds(353, 67, 116, 23);
		registerPanel_2.add(btnSingle);
		
		
		//Butoni per image upload te fotove
		JButton btnDouble = new JButton("Upload Image");
		btnDouble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				
				doubleRoomPath=filename;//ruajme path te imazhit per ruajte ne databaze
				
				ImageIcon icon=new ImageIcon(filename);
				Image img=icon.getImage();
				Image newImg=img.getScaledInstance(lblDoubleImage.getWidth(),lblDoubleImage.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon newIcon=new ImageIcon(newImg);
				lblDoubleImage.setIcon(newIcon);
				
				
			}
		});
		btnDouble.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDouble.setBounds(353, 184, 116, 23);
		registerPanel_2.add(btnDouble);
		
		
		//Butoni per image upload te fotove
		JButton btnTwin = new JButton("Upload Image");
		btnTwin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				
				twinRoomPath=filename;//ruajme path te imazhit per ruajte ne databaze
				
				ImageIcon icon=new ImageIcon(filename);
				Image img=icon.getImage();
				Image newImg=img.getScaledInstance(lblTwinImage.getWidth(),lblTwinImage.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon newIcon=new ImageIcon(newImg);
				lblTwinImage.setIcon(newIcon);
			}
		});
		btnTwin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTwin.setBounds(353, 301, 116, 23);
		registerPanel_2.add(btnTwin);
		
		
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
		
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(507, 390, 202, 111);
		registerPanel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(507, 507, 202, 111);
		registerPanel_2.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(507, 624, 202, 111);
		registerPanel_2.add(label_4);
		
		//Butoni per fshirje te fotos nga labela perkatese
		JButton btnClearSingle = new JButton("Clear");
		btnClearSingle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSingleImage.setIcon(null);
			}
		});
		btnClearSingle.setBounds(406, 41, 64, 23);
		registerPanel_2.add(btnClearSingle);
		
		//Butoni per fshirje te fotos nga labela perkatese
		JButton btnClearDouble = new JButton("Clear");
		btnClearDouble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblDoubleImage.setIcon(null);
			}
		});
		btnClearDouble.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClearDouble.setBounds(406, 158, 64, 23);
		registerPanel_2.add(btnClearDouble);
		
		//Butoni per fshirje te fotos nga labela perkatese
		JButton btnClearTwin = new JButton("Clear");
		btnClearTwin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblTwinImage.setIcon(null);
			}
		});
		btnClearTwin.setBounds(406, 275, 64, 23);
		registerPanel_2.add(btnClearTwin);
		
		//butoni per regjistrimin e hoteleve
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				
				try
				{
					
					InputStream sis=new FileInputStream(new File(singleRoomPath));//inputstream per imazhin e singleroom
					InputStream dis=new FileInputStream(new File(doubleRoomPath));
					InputStream tis=new FileInputStream(new File(twinRoomPath));
					
					
				//Statement per ruajtjen e queryt per insertimin e te dhenave ne tabelen hotels
				PreparedStatement hst=connection.prepareStatement("INSERT INTO hotels (Name,Location,Password,Stars,singleRoomImg,doubleRoomImg,twinRoomImg) VALUES (?,?,?,?,?,?,?)");
				hst.setString(1, txtName.getText());
				hst.setString(2, txtLocation.getText());
				hst.setString(3, passwordField.getText());
				hst.setString(4,Integer.toString(stars));
				hst.setBlob (5, sis);
				hst.setBlob (6, dis);
				hst.setBlob (7, tis);
				hst.executeUpdate();
				
				//marrim id e hotelit me te dhenat e meparshme
				PreparedStatement prep=connection.prepareStatement("SELECT Hid FROM hotels WHERE Name=? AND Location=? AND Password=? AND Stars=?");
				prep.setString(1, txtName.getText());
				prep.setString(2, txtLocation.getText());
				prep.setString(3, passwordField.getText());
				prep.setString(4,Integer.toString(stars));
				ResultSet rs=prep.executeQuery();
				rs.next();
				
				
				//Statement per ruajtjen e queryt per insertimin e te dhenave ne tabelen freeservice per hotelin paraprak
				PreparedStatement freest=connection.prepareStatement("INSERT INTO freeServices (Hid,RoomService,ConferenceRoom,WIFI,ArcadeRoom,Sauna,Pool,Alcohol,Spa) VALUES ("+rs.getString("Hid")+",?,?,?,?,?,?,?,?)");
				freest.setString(1, RoomService);
				freest.setString(2, ConferenceRoom);
				freest.setString(3, WIFI);
				freest.setString(4, ArcadeRoom);
				freest.setString(5, Sauna);
				freest.setString(6, Pool);
				freest.setString(7, Alcohol);
				freest.setString(8, Spa);
				freest.executeUpdate();
				
				//Statement per ruajtjen e queryt per insertimin e te dhenave ne tabelen paidservice per hotelin paraprak
				PreparedStatement pst=connection.prepareStatement("INSERT INTO paidservice (Hid,RoomService,ConferenceRoom,WIFI,ArcadeRoom,Sauna,Pool,Alcohol,Spa) VALUES ("+rs.getString("Hid")+",?,?,?,?,?,?,?,?)");
				pst.setString(1, pRoomService);
				pst.setString(2, pConferenceRoom);
				pst.setString(3, pWIFI);
				pst.setString(4, pArcadeRoom);
				pst.setString(5, pSauna);
				pst.setString(6, pPool);
				pst.setString(7, pAlcohol);
				pst.setString(8, pSpa);
				pst.executeUpdate();
				
				hst.close();
				prep.close();
				freest.close();
				pst.close();
				
				JOptionPane.showMessageDialog(null,"Jeni regjistruar me sukses");
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		btnRegister.setBounds(363, 335, 89, 23);
		registerPanel_2.add(btnRegister);
		
		
		
		
		
		
		//krijimi i tabbedPane Update
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Update", null, updatePanel, null);
		
	}
}
