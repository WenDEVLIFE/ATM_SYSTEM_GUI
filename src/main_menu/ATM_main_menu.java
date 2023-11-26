package main_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import DEPOSIT.DEPOSIT;
import SOFTWARE_INFO.SOFTWARE_INFO;
import WITHDRAW.WITHDRAW;
import login_pin.login_pin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ATM_main_menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Double Balance= (double) 0;
	public static Double withdraw=(double) 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_main_menu frame = new ATM_main_menu();
					frame.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
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
	public ATM_main_menu() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		ATM_main_menu frame = this;
		setTitle("HOME");
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
			@SuppressWarnings("null")
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1);
				ATM_main_menu frame = null;
				try {
					frame = new ATM_main_menu();
					frame.setVisible(true);
					frame.dispose();
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
					frame.dispose();
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
					frame.dispose();
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
			@SuppressWarnings("null")
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_1_1_1_1);
				SOFTWARE_INFO frame3 = null;
				try {
					frame3 = new SOFTWARE_INFO();
					frame3.setVisible(true);
					frame.dispose();
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(0, 128, 64));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBackground(new Color(64, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(panel_3_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblWithdraw = new JLabel("WITHDRAW");
		lblWithdraw.setForeground(Color.WHITE);
		lblWithdraw.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		
		JLabel lblBalance_1_1 = new JLabel(""+ withdraw);
		lblBalance_1_1.setForeground(Color.WHITE);
		lblBalance_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("src\\philippine-peso.png"));
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(220)
					.addComponent(lblWithdraw, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
					.addGap(202))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(279)
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(291))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(305)
					.addComponent(lblBalance_1_1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(327))
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(lblWithdraw, GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblBalance_1_1, GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
					.addGap(41))
		);
		panel_3_1.setLayout(gl_panel_3_1);
		
		JLabel lblBalance = new JLabel("BALANCE");
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		
		JLabel lblBalance_1 = new JLabel(""+Balance);
		lblBalance_1.setForeground(Color.WHITE);
		lblBalance_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("src\\money.png"));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(288)
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addGap(279))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(252)
					.addComponent(lblBalance, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addGap(202))
				.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
					.addGap(290)
					.addComponent(lblBalance_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(327))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblBalance, GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblBalance_1, GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
					.addGap(35))
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				 JLabel hericon1 = new JLabel(new ImageIcon("problem.png"));
				 ImageIcon icon1 = new ImageIcon("src/problem.png");
				int option = JOptionPane.showOptionDialog(null, "Are you sure you want to log out?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1, null, null);
				if (option == JOptionPane.YES_OPTION) {
					login_pin framelogin = null;
					try {
						framelogin = new login_pin();
						framelogin.setVisible(true);
						frame.dispose();
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
