package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;


//class ColorButtonListener implements ActionListener{ // ActionListener을 구현한 클래스
//	private MainPanel mainPanel;
//	private Color c;
//	
//	public ColorButtonListener(MainPanel mainPanel,Color c) {
//		this.mainPanel = mainPanel;
//		this.c = c;
//	}
//	
//	public void actionPerformed(ActionEvent e) {
//		//System.out.println("빨간색 버튼 클릭!");
//		mainPanel.setBackground(c);
//	}
//}
//class BlueButtonListener implements ActionListener{
//	private MainPanel mainPanel;
//	public BlueButtonListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		//System.out.println("파란색 버튼 클릭!");
//		mainPanel.setBackground(Color.blue);
//	}
//	
//}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		//버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener( e -> mainPanel.setBackground(Color.red)); //람다식
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.blue);
			}
		});
		
		//툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
	}
}
