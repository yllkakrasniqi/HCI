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
	private JTextField textField_2;
	private JPasswordField passwordField;

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
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				MainWindow window = new MainWindow();
				window.frame.setVisible(true);
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
		
		ButtonGroup group= new ButtonGroup();
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Register", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblEmri = new JLabel("Name : ");
		lblEmri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmri.setBounds(10, 63, 71, 14);
		panel.add(lblEmri);
		
		JLabel lblShteti = new JLabel("State : ");
		lblShteti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblShteti.setBounds(10, 88, 71, 14);
		panel.add(lblShteti);
		
		JLabel lblQyteti = new JLabel("City : ");
		lblQyteti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQyteti.setBounds(10, 113, 71, 20);
		panel.add(lblQyteti);
		
		JLabel lblMadhesia = new JLabel("Size : ");
		lblMadhesia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMadhesia.setBounds(10, 144, 71, 14);
		panel.add(lblMadhesia);
		
		textField = new JTextField();
		textField.setBounds(89, 62, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 115, 86, 20);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "France", "Italy", "Greece"}));
		comboBox.setBounds(89, 86, 86, 22);
		panel.add(comboBox);
		
		JLabel roomslbl = new JLabel("Number of rooms : ");
		roomslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		roomslbl.setBounds(10, 230, 189, 14);
		panel.add(roomslbl);
		
		JComboBox sizeCombo = new JComboBox();
		sizeCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(sizeCombo.getSelectedItem().toString()=="Small Hotel")
				{
					roomslbl.setText("Number of rooms : <100");
				}
				else if(sizeCombo.getSelectedItem().toString()=="Medium sized Hotel")
				{
					roomslbl.setText("Number of rooms : 100-300");
				}
				else if(sizeCombo.getSelectedItem().toString()=="Large Hotel")
				{
					roomslbl.setText("Number of rooms : >300");
				}
				else if(sizeCombo.getSelectedItem().toString()=="Mega Hotel")
				{
					roomslbl.setText("Number of rooms : >1000");
				}
				else
				{
					roomslbl.setText("Number of rooms : ");
				}
			}
		});
		sizeCombo.setModel(new DefaultComboBoxModel(new String[] {"...", "Small Hotel", "Medium sized Hotel", "Large Hotel", "Mega Hotel"}));
		sizeCombo.setBounds(89, 143, 86, 20);
		panel.add(sizeCombo);
		
		
		
		JLabel lblStars = new JLabel("Stars : ");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStars.setBounds(295, 63, 71, 14);
		panel.add(lblStars);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBounds(342, 61, 38, 23);
		panel.add(radioButton);
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBounds(383, 61, 38, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(423, 61, 38, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBounds(463, 61, 38, 23);
		panel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBounds(503, 61, 38, 23);
		panel.add(radioButton_4);
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		
		JLabel lblServices = new JLabel("Services : ");
		lblServices.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblServices.setBounds(10, 169, 71, 14);
		panel.add(lblServices);
		
		JLabel lblFacilities = new JLabel("Facilities : ");
		lblFacilities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFacilities.setBounds(10, 194, 71, 14);
		panel.add(lblFacilities);
		
		JCheckBox chckbxRoomService = new JCheckBox("Room Service");
		chckbxRoomService.setBounds(89, 167, 97, 23);
		panel.add(chckbxRoomService);
		
		JCheckBox chckbxWifi = new JCheckBox("WIFI");
		chckbxWifi.setBounds(188, 167, 49, 23);
		panel.add(chckbxWifi);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setBounds(89, 192, 49, 23);
		panel.add(chckbxSpa);
		
		JCheckBox chckbxSwimmingPool = new JCheckBox("Swimming Pool");
		chckbxSwimmingPool.setBounds(140, 192, 135, 23);
		panel.add(chckbxSwimmingPool);
		
		JCheckBox chckbxArcadeRoom = new JCheckBox("Arcade Room");
		chckbxArcadeRoom.setBounds(277, 192, 103, 23);
		panel.add(chckbxArcadeRoom);
		
		JCheckBox chckbxConferenceRoom = new JCheckBox("Conference Room");
		chckbxConferenceRoom.setBounds(385, 192, 133, 23);
		panel.add(chckbxConferenceRoom);
		
		JLabel lblNewLabel = new JLabel("Register Your Hotel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(220, 11, 245, 36);
		panel.add(lblNewLabel);
		
		JLabel lblPleaseInsertA = new JLabel("Please insert a password for later updating: ");
		lblPleaseInsertA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseInsertA.setBounds(10, 353, 274, 19);
		panel.add(lblPleaseInsertA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 352, 85, 20);
		panel.add(passwordField);
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Update", null, panel_1, null);
	}
}
