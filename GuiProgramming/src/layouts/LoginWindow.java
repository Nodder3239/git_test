package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import actionevent.ConfirmBtnActionListener;

public class LoginWindow {

	public static void main(String[] args) {
		// 로그인 창 만들기
		JFrame frame = new JFrame("Login");
		frame.setSize(300, 250);	
		frame.setLocation(200, 100);
		frame.setLayout(null);

		
		
		//컴포넌트 객체 생성 - JTextField(입력상자), JButton, JLabel
		JLabel lbl1 = new JLabel("아이디");
		lbl1.setSize(80, 30);
		lbl1.setLocation(30, 30);	
		frame.add(lbl1);	//패널에 추가
		
		JTextField txt1 = new JTextField();
		txt1.setSize(130, 30);
		txt1.setLocation(110, 30);	
		frame.add(txt1);
		
		JLabel lbl2 = new JLabel("비밀번호");
		lbl2.setSize(80, 30);
		lbl2.setLocation(30, 70);	
		frame.add(lbl2);
		
		JTextField txt2 = new JTextField();
		txt2.setSize(130, 30);
		txt2.setLocation(110, 70);	
		frame.add(txt2);
		
		JButton button = new JButton("로그인");
		button.setSize(80, 30);
		button.setLocation(100, 120);	
		frame.add(button);

		
				
				

				
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
