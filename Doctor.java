import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doctor Details");
		lblNewLabel.setBounds(240, 11, 147, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDocid = new JLabel("DOC_ID");
		lblDocid.setBounds(23, 66, 46, 14);
		contentPane.add(lblDocid);
		
		textField = new JTextField();
		textField.setBounds(68, 63, 55, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(149, 69, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 63, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddDoctor.setBounds(499, 23, 104, 23);
		contentPane.add(btnAddDoctor);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(499, 62, 104, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(499, 105, 104, 23);
		contentPane.add(btnDelete);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(428, 11, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(438, 11, 210, 138);
		contentPane.add(label_2);
		
		JLabel lblCityid = new JLabel("CITY_ID");
		lblCityid.setBounds(293, 66, 46, 14);
		contentPane.add(lblCityid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(337, 63, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSpecalist = new JLabel("SPECALIST");
		lblSpecalist.setBounds(10, 123, 59, 14);
		contentPane.add(lblSpecalist);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 120, 98, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAvailableDatetime = new JLabel("AVAILABLE DATE &TIME");
		lblAvailableDatetime.setBounds(190, 123, 116, 14);
		contentPane.add(lblAvailableDatetime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(316, 120, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
