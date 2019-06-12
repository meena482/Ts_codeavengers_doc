import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class homepag extends JFrame {

	private JPanel contentPane;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepag frame = new homepag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public homepag() {
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		setAlwaysOnTop(true);
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userid=textuserid.getText();
				String password=textpassword.getText();
				if((userid.equals("admin"))&&(password.equals("admin@123"))) {
					Main.main(new String[]{});
					frame.dispose();
					
				}
				else {
					JOptionPane.showInputDialog(this, "userid and password doesnot match");
				}
			
		});
		btnAdminLogin.setBounds(71, 160, 89, 23);
		contentPane.add(btnAdminLogin);
		
		JButton btnReceptionist = new JButton("Receptionist Login");
		btnReceptionist.setHorizontalAlignment(SwingConstants.RIGHT);
		btnReceptionist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReceptionist.setBounds(278, 160, 119, 23);
		contentPane.add(btnReceptionist);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(55, 34, 119, 112);
		contentPane.add(lbl);
		
		JLabel label = new JLabel("");
		label.setBounds(71, 58, 46, 14);
		contentPane.add(label);
		
		
	}
	
}
