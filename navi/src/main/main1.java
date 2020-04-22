package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import data.DataEvent;
import data.Database;

public class main1 {
	DataEvent de;
	String locationStr = "";
	Label q1;
	void init_str() {
		System.out.println(de.getName_list());
		ArrayList<String> tmp = de.getName_list();
		System.out.println(tmp);
		if(tmp.size() == 0) {
			locationStr = "";
			return;
		}
		locationStr += de.getDb().getName();
		for(int i =0 ; i < tmp.size(); i++) {		
			locationStr += tmp.get(i);
			locationStr += "\n";		
		}
	}

	void create_new() {
		Font f = new Font("",Font.PLAIN, 30);
		Frame nameLocation = new Frame();

		nameLocation.setBounds(500, 500, 300, 350);
		nameLocation.setBackground(Color.gray);
		Label loc = new Label("목록 이름");

		loc.setBounds(20, 20, 300, 100);

		TextField text = new TextField(10);
		text.setBounds(20, 100, 200, 70);
		text.setFont(f);

		Button make = new Button("생성");
		make.setBounds(20, 300, 80, 40);
		make.setEnabled(false);

		Button esc = new Button("취소");
		esc.setBounds(150, 300, 80, 40);


		nameLocation.add(text);
		nameLocation.add(make);
		nameLocation.add(esc);
		nameLocation.add(loc);

		nameLocation.setVisible(true);

		

		//TextField 에 값이 들어간 경우에만 입력버튼 활성화
		text.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {

				if(text.getText().trim().equals("")) {
					make.setEnabled(false);
				}else {
					make.setEnabled(true);	
				}

			}
		});

		//make 버튼
		make.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String s = text.getText();
				System.out.println("*"+de.getDb().getName());
				de.add_database(s);
				init_str();
				System.out.println("*"+de.getDb().getName());
				//System.out.println(de.getDb().getName());
				q1.setText(locationStr);
				nameLocation.setVisible(false);

			}
		});
		//x버튼 종료
		nameLocation.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				nameLocation.setVisible(false);
			}
		});

		//esc버튼 종료
		esc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				nameLocation.setVisible(false);

			}
		});

	}


	public static void main(String[] args) {	
		main1 m = new main1();
		Frame f = new Frame("초기 화면");
		Font font = new Font("", Font.PLAIN, 18);
		m.de = new DataEvent();
		m.init_str();
		f.setLayout(null);
		f.setBounds(20, 20, 1000, 1000);
		f.setBackground(Color.lightGray);

		m.q1 = new Label(m.locationStr);
		m.q1.setBounds(100, 100, 800, 400);
		m.q1.setBackground(Color.gray);
		m.q1.setFont(font);
		f.add(m.q1);

		//하단부 추가 버튼
		Panel bottomAdd = new Panel();
		bottomAdd.setLayout(null);
		bottomAdd.setFont(font);
		bottomAdd.setBackground(Color.DARK_GRAY);
		bottomAdd.setBounds(0, 900, 1000, 100);
		int buttonXbase = 75;
		int gan= 180;

		Button reset = new Button("새로 만들기");
		reset.setBounds(buttonXbase, 25, 130, 50);

		Button load = new Button("불러오기");
		load.setBounds(buttonXbase+200, 25, 100, 50);

		Button addInfo = new Button("장소추가");
		addInfo.setBounds(buttonXbase+gan*2, 25, 100, 50);

		Button deleteInfo = new Button("장소삭제");
		deleteInfo.setBounds(buttonXbase+gan*3, 25, 100, 50);

		Button start = new Button("길찾기 시작");
		start.setBounds(buttonXbase+gan*4, 25, 130, 50);



		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("새로 만들기");
				m.create_new();

			}



		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("불러오기");
			}		
		});
		addInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("장소추가");
			}
		});
		deleteInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("장소삭제");
			}
		});
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("길찾기 시작");
			}
		});


		bottomAdd.add(reset);
		bottomAdd.add(load);
		bottomAdd.add(addInfo);
		bottomAdd.add(deleteInfo);
		bottomAdd.add(start);
		//하단부 추가 버튼

		//새로만들기 불러오기 정보 추가 길찾기 시작

		f.add(bottomAdd);//하단 추가 패널
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});





	}//main
}
