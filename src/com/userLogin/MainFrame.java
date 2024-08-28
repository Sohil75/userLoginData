package com.userLogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MainFrame implements ActionListener{
	// global variables are defined here
	JFrame login_frame = new JFrame(); // login page frame
	JTextField userid_text = new JTextField(); // username textarea
	JTextField password_text = new JTextField(); // password textarea
	JLabel lblNewLabel_3 = new JLabel(">-wrong pin-<");
	JButton signup_button = new JButton("signup");
	JButton login_button = new JButton("login");
	JButton reset_button = new JButton("reset pin");

	JFrame frame2 = new JFrame(); // frame to lunch to after login

	JFrame reset_pin_frame = new JFrame(); // reset pin frame
	JButton confirm_button = new JButton("confirm"); // confirm button to change pin
	JPanel panel = new JPanel();
	JTextArea new_pin = new JTextArea();
	JTextArea confirm_pin = new JTextArea();
	String username; // global variable for storing username

	
	
	JFrame popframe= new JFrame();
	JButton capatchabt = new JButton("login");
	TextField a1 = new TextField();
	TextField a2 = new TextField();
	Random r=new Random();
	String str=String.format("%03d", r.nextInt(1000  ));
	 
	 Random random = new Random();
		char c = (char)(random.nextInt(26) + 'a');
		private final JButton reloadbt = new JButton("re-load");
		
		
	// login frame
	public void fronty() {
		login_frame.getContentPane().setLayout(null);
		login_frame.setSize(500, 369);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		panel.setBounds(0, 0, 491, 332);
		login_frame.getContentPane().add(panel);
		panel.setLayout(null);

		userid_text.setBounds(201, 96, 144, 28);
		panel.add(userid_text);
		userid_text.setColumns(10);

		JLabel lblNewLabel = new JLabel("UserName:"); // Username label
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(83, 96, 108, 28);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password:"); // Password label
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(100, 152, 92, 28);
		panel.add(lblNewLabel_1);

		password_text = new JTextField();
		password_text.setBounds(201, 151, 144, 28);
		panel.add(password_text);
		password_text.setColumns(10);

		signup_button.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 15));
		signup_button.setBounds(151, 223, 92, 28);
		panel.add(signup_button);
		signup_button.addActionListener(this);

		JLabel lblNewLabel_2 = new JLabel(" Signup/Login page");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(83, 24, 321, 48);
		panel.add(lblNewLabel_2);

		login_button.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 15));
		login_button.setBounds(272, 223, 92, 28);
		panel.add(login_button);
		reset_button.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 9));

		reset_button.setBounds(323, 189, 77, 21);
		panel.add(reset_button);
		reset_button.setVisible(false);
		lblNewLabel_3.setForeground(new Color(102, 0, 0));

		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(186, 189, 108, 21);
		panel.add(lblNewLabel_3);
		login_frame.setVisible(true);
		lblNewLabel_3.setVisible(false);

		login_button.addActionListener(this);
		reset_button.addActionListener(this);

	}

	public void fr2() {
		frame2.setVisible(false);

	}

	// password reset frame
	public void forgotpin() {
		reset_pin_frame.getContentPane().setLayout(null);
		reset_pin_frame.setSize(534, 351);
		reset_pin_frame.setVisible(true);

		reset_pin_frame.getContentPane().add(panel);
		panel.setBackground(new Color(204, 153, 153));
		panel.setBounds(0, 0, 541, 332);
		reset_pin_frame.getContentPane().add(panel);
		panel.setLayout(null);

		confirm_button.setForeground(new Color(47, 79, 79));
		confirm_button.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 13));
		confirm_button.setBounds(238, 187, 116, 32);
		panel.add(confirm_button);

		new_pin.setBounds(219, 91, 158, 22);
		panel.add(new_pin);

		confirm_pin.setBounds(219, 142, 158, 22);
		panel.add(confirm_pin);

		JLabel lblNewLabel_2 = new JLabel("Reset Password");
		lblNewLabel_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_2.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(128, 22, 296, 48);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("new password :");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(90, 90, 138, 22);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("confirm password :");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(59, 141, 150, 22);
		panel.add(lblNewLabel_1);

		confirm_button.addActionListener(this);

	}
	
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object pres = e.getSource(); // object created to get acction listener
		DbClass ins;
		String str;
		String str1;
		String value;
		try {
			ins = new DbClass();

			if (pres == signup_button) {
				str=userid_text.getText();
				str1=password_text.getText();
				
				value=ins.insert_data(str, str1);
				userid_text.setText(null);
				password_text.setText(null);
				//login_frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "SignUp Complete","sign",JOptionPane.INFORMATION_MESSAGE);  // to display 

			} else if (pres == login_button) {
				username=userid_text.getText();
				String st1=password_text.getText();
				 String pin_from_db=ins.getpassword(username);
				 
				 if(pin_from_db.equals(st1)) {  
						System.out.println("inside if");  //check wheather pin entered is correct or wrong	
						login_frame.setVisible(false);
						popup p=new popup();
						p.popupframe();                // capatacha frame
						p.actionPerformed(e);
						
						
					}
				 else {
						System.out.println("inside else");// if wrong pin entered then change pin option is shown
						reset_button.setVisible(true);
						lblNewLabel_3.setVisible(true);	
					}

			} else if (pres == reset_button) {
				forgotpin();
				
				
			} else if(pres==confirm_button){
				String newpin=new_pin.getText();
				String confirmpin= confirm_pin.getText();
				reset_pin_frame.setVisible(false);
				if(newpin.equals(confirmpin)) {                    // check wheater the both the pins are same or not
					ins.updateq(username, confirmpin);             // calling method to update pin 
					JOptionPane.showMessageDialog(null, "your password has been changed successfully","reset pin",JOptionPane.INFORMATION_MESSAGE);
				
				}
				else
				{
					System.out.println("please enter same pin in both boxes");
					JOptionPane.showMessageDialog(null, "please enter same pin ","error",JOptionPane.INFORMATION_MESSAGE);
				}


			}

		} catch (ClassNotFoundException | SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

	}

}