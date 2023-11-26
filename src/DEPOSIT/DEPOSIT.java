package DEPOSIT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import WITHDRAW.WITHDRAW;
import login_pin.login_pin;
import main_menu.ATM_main_menu;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

import SOFTWARE_INFO.SOFTWARE_INFO;

import javax.swing.border.BevelBorder;

public class DEPOSIT extends ATM_main_menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					DEPOSIT frame4 = new DEPOSIT();
					frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DEPOSIT() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setTitle("WITHDRAW");
		DEPOSIT frame4 = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Add a heading (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 84, 0));
		panel.setForeground(new Color(211, 84, 0));
		
		JLabel lblNewLabel = new JLabel("ATM MACHINE SYSTEM");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 84, 0));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_1 ) {
				panel_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (211, 84, 0));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1);
				
				try {
					ATM_main_menu frame = null;
					frame = new ATM_main_menu();
					
					frame.setVisible(true);
					frame4.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetColor(panel_1);
			}
		});
		lblNewLabel_1.setBounds(0, 0, 247, 76);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HOME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(88, 51, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src\\house.png"));
		lblNewLabel_3.setBounds(88, 11, 46, 40);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(211, 84, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(0, 0, 247, 76);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("WITHDRAW");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(61, 56, 126, 20);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("src\\money.png"));
		lblNewLabel_3_1.setBounds(68, 0, 92, 62);
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_1_1 ) {
				panel_1_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (211, 84, 0));
				
			}
			@SuppressWarnings("null")
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1_1);
				WITHDRAW frame2 = null;
				try {
					frame2 = new WITHDRAW();
					frame2.setVisible(true);
					frame4.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetColor(panel_1_1);
			}
		});
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(211, 84, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBounds(0, 0, 247, 76);
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_1_1_1) {
				panel_1_1_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (211, 84, 0));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1_1_1);
				try {
					DEPOSIT frame4 = new DEPOSIT();
					frame4.setVisible(true);
					frame4.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetColor(panel_1_1_1);
			}
		});
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("DEPOSIT");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(78, 56, 66, 20);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("src\\deposit.png"));
		lblNewLabel_3_1_1.setBounds(93, 0, 32, 62);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(211, 84, 0));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setBounds(0, 0, 247, 76);
		lblNewLabel_1_1_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_1_1_1_1) {
				panel_1_1_1_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (211, 84, 0));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1_1_1_1);
				SOFTWARE_INFO frame3 = null;
				try {
					frame3 = new SOFTWARE_INFO();
					frame3.setVisible(true);
					frame4.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				resetColor(panel_1_1_1_1);
			}
		});
		panel_1_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SOFTWARE INFO");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(34, 56, 144, 20);
		panel_1_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("src\\icons8-more-info-48.png"));
		lblNewLabel_3_1_1_1.setBounds(93, 0, 48, 62);
		panel_1_1_1_1.add(lblNewLabel_3_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 84, 0));
		
		JLabel lblDeposit = new JLabel("DEPOSIT");
		lblDeposit.setForeground(Color.WHITE);
		lblDeposit.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		
		JLabel lblCardNo = new JLabel("CARD NO");
		lblCardNo.setForeground(Color.WHITE);
		lblCardNo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblPinNo = new JLabel("PIN NO");
		lblPinNo.setForeground(Color.WHITE);
		lblPinNo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblAmountToDeposit = new JLabel("AMOUNT TO DEPOSIT");
		lblAmountToDeposit.setForeground(Color.WHITE);
		lblAmountToDeposit.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("DEPOSIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cardno = textField.getText();
				String name = textField_1.getText();
				String pin = textField_2.getText();
				String deposit = textField_3.getText();
				int pins =Integer.parseInt(pin);
				double Balance1 =Double.parseDouble(deposit);
				 if (textField.getText().isEmpty() && textField_1.getText().isEmpty() && textField_2.getText().isEmpty() && textField_3.getText().isEmpty() ) {
					 JOptionPane.showMessageDialog(null, "TextField is empty!", "Error", JOptionPane.ERROR_MESSAGE);
				 }
				 else {
					 if(pins==893456) {
						 JLabel hericon1 = new JLabel(new ImageIcon("problem.png"));
						 ImageIcon icon1 = new ImageIcon("src/problem.png");
						    int option = JOptionPane.showOptionDialog(null, "Are you sure you want to deposit?", "Deposit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1, null, null);

							if (option == JOptionPane.YES_OPTION) {
								Balance+=Balance1;
								JLabel hericon = new JLabel(new ImageIcon("depo.png"));
						         ImageIcon icon = new ImageIcon(new ImageIcon("src/depo.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));
						         JOptionPane.showMessageDialog(null, "Your Balance:" + Balance,null, JOptionPane.INFORMATION_MESSAGE, icon);
								
							}
							else {
								
							}
					 } 
					 else {
						 JOptionPane.showMessageDialog(null, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
					 }

				 }
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 64));
		
		JButton btnNewButton_1_1 = new JButton("DELETE ALL");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(128, 128, 128));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(128, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(195)
									.addComponent(lblDeposit, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(47)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblAmountToDeposit)
										.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblPinNo, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCardNo)))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
										.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
									.addGap(21))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(198)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
										.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
							.addGap(58)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblDeposit, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCardNo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPinNo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAmountToDeposit, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(57)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_4.setLayout(null);
		
		JLabel lblV = new JLabel("V1.0");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblV.setBounds(22, 12, 93, 44);
		panel_4.add(lblV);
		
		JLabel lblAds = new JLabel("ADS");
		lblAds.setForeground(Color.WHITE);
		lblAds.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("src\\Add a heading (2).png"));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("src\\Add a heading (3).png"));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(107)
					.addComponent(lblAds, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(9)
					.addComponent(lblAds, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
					.addGap(39))
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JLabel hericon1 = new JLabel(new ImageIcon("problem.png"));
				 ImageIcon icon1 = new ImageIcon("src/problem.png");
				int option = JOptionPane.showOptionDialog(null, "Are you sure you want to log out?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1, null, null);

				if (option == JOptionPane.YES_OPTION) {
					login_pin framelogin = null;
					try {
						framelogin = new login_pin();
						framelogin.setVisible(true);
						frame4.dispose();
						//CHANGE THE ICON OF JOPTIONPANE WITH LAF 
						JLabel hericon2 = new JLabel(new ImageIcon("success.png"));
						 hericon2.setPreferredSize(new Dimension(50, 50));
						 ImageIcon icon2 = new ImageIcon("src/success.png");
						 UIManager.setLookAndFeel(new javax.swing.plaf.nimbus.NimbusLookAndFeel());
						 UIManager.put("OptionPane.background", Color.orange);
						 UIManager.put("Panel.background", Color.orange);
						 
						JOptionPane.showMessageDialog(null, "Successfully Logout!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE,icon2);
					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
							| UnsupportedLookAndFeelException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 192));
		
		JLabel lblTest = new JLabel("USERTEST");
		lblTest.setForeground(Color.WHITE);
		lblTest.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(526, Short.MAX_VALUE)
					.addComponent(lblTest, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
						.addComponent(lblTest, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblcopyright = new JLabel("@COPYRIGHT 2023");
		lblcopyright.setForeground(Color.WHITE);
		lblcopyright.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_1_1_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblcopyright, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(panel_1_1_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(panel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
					.addComponent(lblcopyright, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
