package login_pin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main_menu.ATM_main_menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class login_pin extends JFrame {
	/**
	 * 
	 */
	public String stars;
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-30,109
	 */
	@SuppressWarnings("unused")
	private final JPanel panel = new JPanel();
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					login_pin framelogin = new login_pin();
					framelogin.setVisible(true);
					framelogin.setSize(1024 ,720);
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
	public login_pin() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		login_pin framelogin = this;
		setTitle("ATM_SYSTEM_MACHINE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Add a heading (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(211, 84, 0));
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src\\atm.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
					.addGap(115)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(64))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		textField1 = new JTextField();
		textField1.setForeground(new Color(255, 255, 255));
		textField1.setBackground(new Color(0, 128, 255));
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField1.setColumns(10);
		
		JLabel lblEnterYourPin = new JLabel("ENTER YOUR PIN NUMBER");
		lblEnterYourPin.setForeground(Color.WHITE);
		lblEnterYourPin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stars=textField1.getText();
				int starToint = Integer.parseInt(stars);
				if (textField1.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "TextField is empty!", "Error", JOptionPane.ERROR_MESSAGE);
				} 
				if (starToint==893456) {
					ATM_main_menu frame = null;
				    try {
				    	JLabel hericon2 = new JLabel(new ImageIcon("success.png"));
						 hericon2.setPreferredSize(new Dimension(50, 50));
						 ImageIcon icon2 = new ImageIcon("src/success.png");
				        JOptionPane.showMessageDialog(null, "Login Successful ", "MESSAGE", JOptionPane.INFORMATION_MESSAGE,icon2);
				        frame = new ATM_main_menu();
				        frame.setVisible(true);
				        framelogin.dispose();
				    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
				        e1.printStackTrace();
				    }
				}
				else {
					 JOptionPane.showMessageDialog(null, "PIN Number Incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("0"));
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("1"));
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_2 = new JButton("CLEAR");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_3 = new JButton("DELETE");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stars=textField1.getText();
				textField1.setText("");
				for(int i=0;i<stars.length()-1;i++) {
					textField1.setText(textField1.getText()+stars.charAt(i));
				}
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_1 = new JButton("2");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("2"));
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_2 = new JButton("3");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("3"));
			}
		});
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_2.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_3 = new JButton("4");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("4"));
			}
		});
		btnNewButton_1_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_3.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_4 = new JButton("5");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("5"));
			}
		});
		btnNewButton_1_1_4.setForeground(Color.WHITE);
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_4.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_4_1 = new JButton("6");
		btnNewButton_1_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("6"));
			}
		});
		btnNewButton_1_1_4_1.setForeground(Color.WHITE);
		btnNewButton_1_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_4_1.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_4_1_1 = new JButton("7");
		btnNewButton_1_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("7"));
			}
		});
		btnNewButton_1_1_4_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_4_1_1.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_4_1_2 = new JButton("8");
		btnNewButton_1_1_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("8"));
			}
		});
		btnNewButton_1_1_4_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_4_1_2.setBackground(new Color(0, 128, 192));
		
		JButton btnNewButton_1_1_4_1_3 = new JButton("9");
		btnNewButton_1_1_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textField1.getText().concat("9"));
			}
		});
		btnNewButton_1_1_4_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_4_1_3.setBackground(new Color(0, 128, 192));
		
		JLabel lblcopyright = new JLabel("@COPYRIGHT 2023");
		lblcopyright.setForeground(Color.WHITE);
		lblcopyright.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(137)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(33)
							.addComponent(lblEnterYourPin, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(48)
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(74)
							.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(btnNewButton_1_1_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnNewButton_1_1_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblcopyright, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(btnNewButton_1_1_4_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1_1_4_1_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnNewButton_1_1_4_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(44)
									.addComponent(btnNewButton_1_1_4_1_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblEnterYourPin)
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1_1_4_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_4_1_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_4_1_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton_1_1_4_1_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(lblcopyright, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
