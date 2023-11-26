package SOFTWARE_INFO;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MORE extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MORE dialog = new MORE();
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public MORE() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\icons8-more-info-48.png"));
		setTitle("MORE_INFO");
		
		// you need this in order to close JDIALOG
		MORE dialog = this;
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setBackground(new Color(0, 128, 192));
		setBounds(100, 100, 640, 842);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 0, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MORE INFO ABOUT THIS SOFTWARE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(139, 27, 273, 44);
		contentPanel.add(lblNewLabel);
		
		JLabel lblThisSoftwareHas = new JLabel("THIS SOFTWARE HAS NO DATABASE AND IT IS A OFFLINE ATM SYSTEM");
		lblThisSoftwareHas.setForeground(Color.WHITE);
		lblThisSoftwareHas.setBounds(33, 83, 470, 44);
		contentPanel.add(lblThisSoftwareHas);
		
		JLabel lblTheDeveloperOf = new JLabel("THE DEVELOPER OF THIS SOFTWARE STILL LEARNING ABOUT DATABASE AND ETC");
		lblTheDeveloperOf.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTheDeveloperOf.setForeground(Color.WHITE);
		lblTheDeveloperOf.setBounds(33, 139, 470, 44);
		contentPanel.add(lblTheDeveloperOf);
		
		JLabel lblIHopeYou = new JLabel("I HOPE YOU APPRECIATE THIS SOFTWARE");
		lblIHopeYou.setForeground(Color.WHITE);
		lblIHopeYou.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIHopeYou.setBounds(153, 207, 247, 44);
		contentPanel.add(lblIHopeYou);
		
		JLabel lblwendevlifeCeoOf = new JLabel("-John Carl Banate ");
		lblwendevlifeCeoOf.setForeground(Color.WHITE);
		lblwendevlifeCeoOf.setFont(new Font("Dialog", Font.BOLD, 12));
		lblwendevlifeCeoOf.setBounds(33, 362, 247, 44);
		contentPanel.add(lblwendevlifeCeoOf);
		
		JLabel lblDeveloperOfUpcr = new JLabel("Developer POTCHI_BANATE");
		lblDeveloperOfUpcr.setForeground(Color.WHITE);
		lblDeveloperOfUpcr.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDeveloperOfUpcr.setBounds(33, 317, 247, 44);
		contentPanel.add(lblDeveloperOfUpcr);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src\\e426702edf874b181aced1e2fa5c6cde.gif"));
		lblNewLabel_1.setBounds(179, 418, 433, 337);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblStaySafe = new JLabel("STAY SAFE");
		lblStaySafe.setForeground(Color.WHITE);
		lblStaySafe.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStaySafe.setBounds(210, 263, 88, 44);
		contentPanel.add(lblStaySafe);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(128, 128, 128));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					    if(e.getSource()==okButton) {
					    	 // close the JDIALOG
					    	
						        
						     dialog.dispose();
						    
					    }
					    
					}
					
				});
				okButton.setBackground(new Color(0, 128, 192));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
