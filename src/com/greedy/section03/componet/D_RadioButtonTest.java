package com.greedy.section03.componet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButtonTest {

	public static void main(String[] args) {
	
		JFrame mf = new JFrame("라이도 버튼 테스트");
		mf.setSize(300,150);
		
		JPanel topPnal = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPnal.add(label);
		mf.add(topPnal, BorderLayout.NORTH);
		
		JPanel sizeJPanel = new JPanel();
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("Medium size");
		JRadioButton large = new JRadioButton("Large size");
		
		
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		sizeJPanel.add(small);
		sizeJPanel.add(medium);
		sizeJPanel.add(large);
		
		mf.add(sizeJPanel, BorderLayout.CENTER);
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		JPanel resultJPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultJPanel.add(text);
		
		mf.add(resultJPanel, BorderLayout.SOUTH);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
