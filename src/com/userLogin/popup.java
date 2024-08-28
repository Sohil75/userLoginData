package com.userLogin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class popup extends MainFrame implements ActionListener{
	JFrame popframe= new JFrame();
	
	JButton capatchabt = new JButton("login");
	TextField a1 = new TextField();
	TextField a2 = new TextField();
	Random r=new Random();
	String str=String.format("%03d", r.nextInt(1000  ));
	 
	 Random random = new Random();
		char c = (char)(random.nextInt(26) + 'a');
		private final JButton reloadbt = new JButton("re-load");
	/**
	 * @wbp.parser.entryPoint
	 */
	public void popupframe() {
		popframe.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 362, 195);
		popframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Captcha:");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setAlignment(Label.CENTER);
		label.setBounds(49, 36, 93, 21);
		panel.add(label);
		a1.setFont(new Font("Dialog", Font.BOLD, 17));
		
		
		a1.setBounds(148, 26, 118, 31);
		panel.add(a1);
		
		
		a2.setBounds(148, 87, 118, 31);
		panel.add(a2);
		
		Label label_1 = new Label("Enter Captcha:");
		label_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_1.setBounds(22, 87, 132, 21);
		panel.add(label_1);
		
		
		capatchabt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		capatchabt.setBounds(153, 132, 99, 31);
		panel.add(capatchabt);
		reloadbt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		reloadbt.setIcon(null);
		reloadbt.setBounds(240, 63, 76, 21);
		reloadbt.setVisible(false);
		
		panel.add(reloadbt);
		reloadbt.addActionListener(this);
		popframe.setTitle("capatcha");
		popframe.setVisible(true);
		capatchabt.addActionListener(this);
		
		popframe.setBounds(10, 10, 382, 216);
		
		a1.setText(	
				 String.format((char) (random.nextInt(26)+'c')+"%02d", r.nextInt(1000))+(char) (random.nextInt(26)+'c'));
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object d= e.getSource();
		
		if (d==capatchabt)
		{
			String g= a1.getText();
			String s=a2.getText();
		
			if(g.equals(s))
			{
				a2.setText(null);
				System.out.println("success");
				
					popframe.setVisible(false);
					frame2.setVisible(true);
					System.out.println("complete");
				
			}
			else 
			{
				reloadbt.setVisible(true);
				JOptionPane.showMessageDialog(null, "invalid chaptcha","sign",JOptionPane.INFORMATION_MESSAGE);
			}
	
		
		}
		
		if (e.getSource()==reloadbt)
		{
			a1.setText(	
	 String.format("%02d", r.nextInt(1000))+(char) (random.nextInt(26)+'c')  );
			a2.setText("");
			
		}
		
	}
	public static void main(String[] args) {
		popup pu=new popup();
		pu.popupframe();
	}
	}


