package com.example.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DBUtil.dbconn == null) DBUtil.DBConnect();
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(146, 35, 200, 24);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(24, 105, 108, 24);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(35, 154, 95, 15);
		getContentPane().add(lblNewLabel_2);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtUserName.setBounds(142, 107, 147, 21);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("굴림", Font.PLAIN, 16));
		txtPassword.setBounds(142, 152, 147, 21);
		getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DBUtil.dbconn == null) DBUtil.DBConnect();
				String username = txtUserName.getText();
				String password = new String (txtPassword.getPassword());
				
				String query = "SELECT * FROM users WHERE username=? nad password=?";
				
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(query);
					pstmt.setString(1, username);
					pstmt.setString(2, password);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next() ) {// 해당계정 비번이 존재, 정상 로그인
						rs.close();
						pstmt.close();
						dispose();
						AppHome apphome = new AppHome();
						apphome.setVisible(true);
						
					}{
						System.out.println("유저명과 비밀번호를 확인하세요.");
					}
				}
				catch(SQLException elogin) {
					System.out.println("유저명과 비밀번호를 확인하세요.");
				}
			}
		});
		btnLogin.setBounds(192, 201, 97, 23);
		getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("프로그램을 모두 종료합니다.");
				if(DBUtil.dbconn != null) DBUtil.DBClose();
				System.exit(0);
			}
		});
		btnExit.setBounds(325, 228, 97, 23);
		getContentPane().add(btnExit);
	}
}
