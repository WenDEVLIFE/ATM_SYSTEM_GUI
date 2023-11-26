package SOFTWARE_INFO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
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
import javax.swing.border.SoftBevelBorder;

import DEPOSIT.DEPOSIT;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class SOFTWARE_INFO extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					SOFTWARE_INFO frame3 = new SOFTWARE_INFO();
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SOFTWARE_INFO() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setTitle("SOFTWARE_INFO");
		SOFTWARE_INFO frame3= this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Add a heading (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
					frame3.dispose();
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
					frame3.dispose();
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
					frame3.dispose();
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
					frame3.dispose();
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
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(211, 84, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(128, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(25))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 474, Short.MAX_VALUE)
					.addGap(57))
		);
		
		JLabel lblSoftwareInformation = new JLabel("SOFTWARE INFORMATION");
		lblSoftwareInformation.setForeground(Color.WHITE);
		lblSoftwareInformation.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("src\\software.png"));
		
		JLabel lblDeveloperTeam = new JLabel("DEVELOPER");
		lblDeveloperTeam.setForeground(Color.WHITE);
		lblDeveloperTeam.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("src\\programming.png"));
		
		JLabel lblUnited = new JLabel("John");
		lblUnited.setForeground(new Color(255, 0, 0));
		lblUnited.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblNewLabel_5_1 = new JLabel("The");
		lblNewLabel_5_1.setIcon(new ImageIcon("src\\soviet-union.png"));
		
		JLabel lblOfCoders = new JLabel("Carl");
		lblOfCoders.setForeground(new Color(255, 255, 0));
		lblOfCoders.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblRepublic = new JLabel("Banate");
		lblRepublic.setForeground(new Color(0, 128, 64));
		lblRepublic.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblAndCoding = new JLabel("The Great");
		lblAndCoding.setForeground(Color.BLUE);
		lblAndCoding.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblHeadquarters = new JLabel("HEADQUARTERS");
		lblHeadquarters.setForeground(Color.WHITE);
		lblHeadquarters.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("src\\philippines.png"));
		
		JLabel lblDavao = new JLabel("Davao");
		lblDavao.setForeground(new Color(0, 64, 128));
		lblDavao.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(new Color(255, 255, 0));
		lblCity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblPhilippines = new JLabel("Philippines");
		lblPhilippines.setForeground(Color.RED);
		lblPhilippines.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblProgrammingLanguage = new JLabel("PROGRAMMING LANGUAGE");
		lblProgrammingLanguage.setForeground(Color.WHITE);
		lblProgrammingLanguage.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon("src\\programming.png"));
		
		JLabel lblJava = new JLabel("JAVA");
		lblJava.setForeground(new Color(0, 128, 192));
		lblJava.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("");
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon("src\\icons8-java-48.png"));
		
		JButton btnClickForMore = new JButton("CLICK FOR MORE DETAILS");
		btnClickForMore.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				MORE dialog = null;
				
				try {
					dialog = new MORE();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnClickForMore.setForeground(Color.WHITE);
		btnClickForMore.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 10));
		btnClickForMore.setBackground(new Color(0, 128, 192));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(182)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSoftwareInformation, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(185))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_1_1_1))
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addComponent(lblDavao, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblPhilippines, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblProgrammingLanguage, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblJava, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addGap(313)
									.addComponent(btnClickForMore, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(80)
									.addComponent(lblDeveloperTeam, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_5))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblUnited)
									.addGap(2)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblHeadquarters, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addComponent(lblOfCoders, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblAndCoding, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblRepublic, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))))))
					.addGap(45))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblUnited, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblOfCoders, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblAndCoding, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblRepublic, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_5)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addContainerGap()
											.addComponent(lblSoftwareInformation, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(lblDeveloperTeam, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(18)
							.addComponent(lblHeadquarters, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblPhilippines, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblDavao, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
											.addGap(14)
											.addComponent(lblProgrammingLanguage, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblJava, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(11)))
							.addContainerGap(61, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClickForMore, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
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
						frame3.dispose();
						
						//change the pic of the icon of JOPTIONPANE
						JLabel hericon2 = new JLabel(new ImageIcon("success.png"));
						 hericon2.setPreferredSize(new Dimension(50, 50));
						 //UI LAF
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
					.addContainerGap(508, Short.MAX_VALUE)
					.addComponent(lblTest, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
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
