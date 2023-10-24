package actionevent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExCalcEvent {

	public static void main(String[] args) {
		// 프레임 > 패널1, 패널2(BorderLayout, FlowLayout) > 버튼, 텍스트 상자
		JFrame frame = new JFrame("사칙연산 프로그램");
		frame.setSize(400, 120);
		frame.setLocation(200, 100);
		
		// 패널1, 패널2 생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		//프레임에서 패널 배치 - BorderLayout
		frame.add(pane1, BorderLayout.NORTH);	//위쪽
		frame.add(pane2, BorderLayout.CENTER);	//위쪽
		
		//패널에서 버튼, 텍스트 상자 배치 - FlowLayout
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		//패널에 버튼, 텍스트 상자 추가
		pane1.add(text1);
		pane1.add(new JLabel("□"));
		pane1.add(text2);
		pane1.add(new JLabel("="));
		pane1.add(text3);
		
		pane2.setLayout(new FlowLayout());
		JButton sumBtn = new JButton("+");
		JButton subBtn = new JButton("-");
		JButton mulBtn = new JButton("×");
		JButton divBtn = new JButton("÷");
		JButton resetBtn = new JButton("취소");
		
		pane2.add(sumBtn);
		pane2.add(subBtn);
		pane2.add(mulBtn);
		pane2.add(divBtn);
		pane2.add(resetBtn);
		
		//버튼 이벤트 - 익명 객체 구현
		// 계산 버튼 구현
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());	//입력된 문자를 숫자로 변환
				int num2 = Integer.parseInt(text2.getText());
				int sum = num1 + num2;
				text3.setText(String.valueOf(sum));	//숫자를 문자형으로 변환

			}
		};
		sumBtn.addActionListener(listener);	//계산 실행
		
		ActionListener sublistener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());	//입력된 문자를 숫자로 변환
				int num2 = Integer.parseInt(text2.getText());
				int sub = num1 - num2;
				text3.setText(String.valueOf(sub));	//숫자를 문자형으로 변환
				
			}
		};
		subBtn.addActionListener(sublistener);	//계산 실행
		
		ActionListener mullistener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());	//입력된 문자를 숫자로 변환
				int num2 = Integer.parseInt(text2.getText());
				int mul = num1 * num2;
				text3.setText(String.valueOf(mul));	//숫자를 문자형으로 변환
				
			}
		};
		mulBtn.addActionListener(mullistener);	//계산 실행
		
		ActionListener divlistener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());	//입력된 문자를 숫자로 변환
				int num2 = Integer.parseInt(text2.getText());
				float div = (float) num1 / num2;
				text3.setText(String.valueOf(Math.round(div * 1000) / 1000));	//숫자를 문자형으로 변환
				
			}
		};
		divBtn.addActionListener(divlistener);	//계산 실행
		
		// 취소 버튼 구현 - 취소 버튼을 누르면 입력된 숫자가 지워지고 공백으로 초기화됨
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");	
				text2.setText("");	
				text3.setText("");	
			}
		};
		resetBtn.addActionListener(listener2);
		
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
