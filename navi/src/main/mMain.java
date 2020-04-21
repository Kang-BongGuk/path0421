package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mMain {
	public static void main(String[] args) {

		Frame f = new Frame("문장 입력기");
		Font font = new Font("", Font.PLAIN, 18);
		f.setLayout(null);
		f.setBounds(200, 200, 1000, 800);
		f.setBackground(Color.lightGray);


		//하단부 추가 버튼
		Panel addP = new Panel();
		addP.setLayout(null);
		addP.setFont(font);
		addP.setBackground(Color.DARK_GRAY);
		addP.setBounds(0, 700, 1000, 100);
		Button addB = new Button("추가");
		addB.setBounds(105, 25, 100, 50);

		Button deleteB = new Button("????");
		deleteB.setBounds(330, 25, 100, 50);

		Button makeB = new Button("새로만들기");
		makeB.setBounds(555, 25, 100, 50);

		Button loadB = new Button("불러오기");
		loadB.setBounds(780, 25, 100, 50);

		addP.add(makeB);
		addP.add(loadB);
		addP.add(deleteB);
		addP.add(addB);
		//하단부 추가 버튼

		//경로 추가 
		Font font2 = new Font("", Font.PLAIN, 40);
		
		Panel locate1 = new Panel();
		locate1.setBounds(0, 50, 1000, 200);
		TextField tf1 = new TextField(20);
		tf1.setFont(font2);
		Button add1 = new Button("입력");
		add1.setPreferredSize(new Dimension(150,40));
		Button delete1 = new Button("삭제");
		delete1.setPreferredSize(new Dimension(150,40));
		
		locate1.add(tf1);
		locate1.add(add1);
		locate1.add(delete1);
		//경로 추가
		
		Panel locate2 = new Panel();
		locate2.setBounds(0, 200, 1000, 200);
		TextField tf2 = new TextField(20);
		tf2.setFont(font2);
		Button add2 = new Button("입력");
		add2.setPreferredSize(new Dimension(150,40));
		Button delete2 = new Button("삭제");
		delete2.setPreferredSize(new Dimension(150,40));
		
		
		addB.addActionListener(new ActionListener() {

			 //추가버튼 누르는 횟수
			@Override
			public void actionPerformed(ActionEvent e) {
				locate2.add(tf2);
				locate2.add(add2);
				locate2.add(delete2);
				
					
			}
		});


		f.add(locate2);//경로2 추가 패널
		f.add(locate1);//경로 추가 패널
		f.add(addP);//하단 추가 패널
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}//main
}
