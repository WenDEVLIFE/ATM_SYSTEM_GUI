package WITHDRAW;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.LocalTime;

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

import login_pin.login_pin;
import main_menu.ATM_main_menu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.util.Random;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

import DEPOSIT.DEPOSIT;
import SOFTWARE_INFO.SOFTWARE_INFO;

import javax.swing.border.BevelBorder;
public class WITHDRAW extends ATM_main_menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					WITHDRAW frame2 = new WITHDRAW();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public WITHDRAW() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setTitle("WITHDRAW");
		WITHDRAW frame2 = this;
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
					frame2.dispose();
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
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1_1);
				WITHDRAW frame2 = null;
				try {
					frame2 = new WITHDRAW();
					frame2.setVisible(true);
					frame2.dispose();
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
					frame2.dispose();
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
					frame2.dispose();
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
		
		JLabel lblCardNo = new JLabel("CARD NO");
		lblCardNo.setForeground(Color.WHITE);
		lblCardNo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblWithdrawMoney = new JLabel("WITHDRAW MONEY");
		lblWithdrawMoney.setForeground(Color.WHITE);
		lblWithdrawMoney.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblPinNumber = new JLabel("PIN NUMBER");
		lblPinNumber.setForeground(Color.WHITE);
		lblPinNumber.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblAmountOfWithdrwal = new JLabel("AMOUNT OF WITHDRAWAL");
		lblAmountOfWithdrwal.setForeground(Color.WHITE);
		lblAmountOfWithdrwal.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(128, 128, 128));
		
		JLabel lblReferenceNumber = new JLabel("Receipt");
		lblReferenceNumber.setForeground(Color.WHITE);
		lblReferenceNumber.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel_3_1.setBackground(new Color(128, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblPinNumber, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblAmountOfWithdrwal)
												.addComponent(lblCardNo, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
											.addGap(18))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(0)
											.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
									.addGap(4))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGap(51)
									.addComponent(lblWithdrawMoney, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
									.addComponent(lblReferenceNumber, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
									.addGap(42)))
							.addGap(4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblWithdrawMoney, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblReferenceNumber, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCardNo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPinNumber, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAmountOfWithdrwal, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setVisible(false);
		lblName_1.setForeground(Color.WHITE);
		lblName_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblName_1_1 = new JLabel("Ref No:");
		lblName_1_1.setVisible(false);
		lblName_1_1.setForeground(Color.WHITE);
		lblName_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblName_1_2 = new JLabel("ATM SYSTEM");
		lblName_1_2.setVisible(false);
		lblName_1_2.setForeground(Color.WHITE);
		lblName_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblName_1_2_1 = new JLabel("Date:");
		lblName_1_2_1.setVisible(false);
		lblName_1_2_1.setForeground(Color.WHITE);
		lblName_1_2_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblName_1_2_1_1 = new JLabel("Time:");
		lblName_1_2_1_1.setVisible(false);
		lblName_1_2_1_1.setForeground(Color.WHITE);
		lblName_1_2_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblName_1_1_1 = new JLabel("Amount:");
		lblName_1_1_1.setVisible(false);
		lblName_1_1_1.setForeground(Color.WHITE);
		lblName_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblName_1_2_2 = new JLabel("THANK YOU FOR USING!");
		lblName_1_2_2.setVisible(false);
		lblName_1_2_2.setForeground(Color.WHITE);
		lblName_1_2_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName_1_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblName_1_2_1_1, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
						.addComponent(lblName_1_1_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName_1_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblName_1_2_2, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
							.addGap(63))
						.addComponent(lblName_1_2_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblName_1_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblName_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(lblName_1_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName_1_2_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName_1_2_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addComponent(lblName_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblName_1_2_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource()==btnConfirm) {
					  LocalTime time = LocalTime.now();
					  LocalDate date = LocalDate.now();

				 String Card =textField.getText();
				 String name =textField_1.getText();
				 String Pin = textField_2.getText();
				 String Amount = textField_3.getText();
				 withdraw = Double.parseDouble(Amount);
				 int cardn1 =Integer.parseInt(Card);
				 int Pinum =Integer.parseInt(Pin);
				 
				 
				 if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() ) {
					 JOptionPane.showMessageDialog(null, "TextField is empty!", "Error", JOptionPane.ERROR_MESSAGE);
				 }
				 else {
					 if (withdraw>Balance) {
						 JOptionPane.showMessageDialog(null, "Not Enough Balance", "Error", JOptionPane.ERROR_MESSAGE);
						 
					 }
					 else {
						if (Pinum==893456) {
							 Balance-=withdraw;
							 lblName_1.setText("Name:"+name);
							 lblName_1_1_1.setText("Amount:"+ withdraw);
							 lblName_1_2_1.setText("Date:"+date);
							 textField_4.setText(""+Balance);
							 textField_5.setText(""+withdraw);
							 lblName_1.setVisible(true);
							 
								lblName_1_2_1.setVisible(true);
								lblName_1_2_2.setVisible(true);
								lblName_1_2_1_1.setVisible(true);
								lblName_1_2.setVisible(true);
								lblName_1_1.setVisible(true);
								lblName_1_1_1.setVisible(true);
							 int length = 10;
						        StringBuilder referenceNumber = new StringBuilder();
						        Random random = new Random();
						        lblName_1_2_1_1.setText("Time:"+time.toString().substring(0, 5));
						        for (int i = 0; i < length; i++) {
						        	
						            referenceNumber.append(random.nextInt(10));
						        }
						        {
						        	lblName_1_1.setText("Ref No:" + referenceNumber);
						    }
						
							 }
						else {
							 JOptionPane.showMessageDialog(null, "Incorrect Credentials", "Error", JOptionPane.ERROR_MESSAGE);
						}
						}
						 
						 
					 
				 }
					
				}
				
				
				
			}
		});
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnConfirm.setBackground(new Color(0, 255, 64));
		
		JLabel lblOptions = new JLabel("OPTIONS");
		lblOptions.setForeground(Color.WHITE);
		lblOptions.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("SansSerif", Font.PLAIN, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JLabel lblBalanceRemaining = new JLabel("BALANCE REMAINING");
		lblBalanceRemaining.setForeground(Color.WHITE);
		lblBalanceRemaining.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JButton btnDeleteAll = new JButton("TRY AGAIN");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				lblName_1.setVisible(false);
				
				lblName_1_2_1.setVisible(false);
				lblName_1_2_2.setVisible(false);
				lblName_1_2_1_1.setVisible(false);
				lblName_1_2.setVisible(false);
				lblName_1_1.setVisible(false);
				lblName_1_1_1.setVisible(false);
			}
		});
		btnDeleteAll.setForeground(Color.WHITE);
		btnDeleteAll.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnDeleteAll.setBackground(new Color(0, 64, 64));
		
		JLabel lblTotalWithdraw = new JLabel("TOTAL WITHDRAW");
		lblTotalWithdraw.setForeground(Color.WHITE);
		lblTotalWithdraw.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("SansSerif", Font.PLAIN, 30));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		JButton btnDeleteAll_1 = new JButton("DELETE ALL");
		btnDeleteAll_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnDeleteAll_1.setForeground(Color.WHITE);
		btnDeleteAll_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnDeleteAll_1.setBackground(Color.RED);
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(83)
					.addComponent(lblOptions, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGroup(gl_panel_3_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnDeleteAll_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addGap(84)
							.addComponent(btnDeleteAll, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
					.addGroup(gl_panel_3_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addComponent(lblBalanceRemaining, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addComponent(lblTotalWithdraw, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addGap(46)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
					.addGap(25))
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap(3, Short.MAX_VALUE)
					.addComponent(lblOptions, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_3_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel_3_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBalanceRemaining, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDeleteAll_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_3_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_panel_3_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotalWithdraw, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3_1.createSequentialGroup()
							.addGap(18)
							.addComponent(btnDeleteAll, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addGap(52))
		);
		panel_3_1.setLayout(gl_panel_3_1);
		
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
						frame2.dispose();
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
