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
		Label loc = new Label("��� �̸�");

		loc.setBounds(20, 20, 300, 100);

		TextField text = new TextField(10);
		text.setBounds(20, 100, 200, 70);
		text.setFont(f);

		Button make = new Button("����");
		make.setBounds(20, 300, 80, 40);
		make.setEnabled(false);

		Button esc = new Button("���");
		esc.setBounds(150, 300, 80, 40);


		nameLocation.add(text);
		nameLocation.add(make);
		nameLocation.add(esc);
		nameLocation.add(loc);

		nameLocation.setVisible(true);

		

		//TextField �� ���� �� ��쿡�� �Է¹�ư Ȱ��ȭ
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

		//make ��ư
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
		//x��ư ����
		nameLocation.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				nameLocation.setVisible(false);
			}
		});

		//esc��ư ����
		esc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				nameLocation.setVisible(false);

			}
		});

	}


	public static void main(String[] args) {	
		main1 m = new main1();
		Frame f = new Frame("�ʱ� ȭ��");
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

		//�ϴܺ� �߰� ��ư
		Panel bottomAdd = new Panel();
		bottomAdd.setLayout(null);
		bottomAdd.setFont(font);
		bottomAdd.setBackground(Color.DARK_GRAY);
		bottomAdd.setBounds(0, 900, 1000, 100);
		int buttonXbase = 75;
		int gan= 180;

		Button reset = new Button("���� �����");
		reset.setBounds(buttonXbase, 25, 130, 50);

		Button load = new Button("�ҷ�����");
		load.setBounds(buttonXbase+200, 25, 100, 50);

		Button addInfo = new Button("����߰�");
		addInfo.setBounds(buttonXbase+gan*2, 25, 100, 50);

		Button deleteInfo = new Button("��һ���");
		deleteInfo.setBounds(buttonXbase+gan*3, 25, 100, 50);

		Button start = new Button("��ã�� ����");
		start.setBounds(buttonXbase+gan*4, 25, 130, 50);



		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� �����");
				m.create_new();

			}



		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ҷ�����");
			}		
		});
		addInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����߰�");
			}
		});
		deleteInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��һ���");
			}
		});
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ã�� ����");
			}
		});


		bottomAdd.add(reset);
		bottomAdd.add(load);
		bottomAdd.add(addInfo);
		bottomAdd.add(deleteInfo);
		bottomAdd.add(start);
		//�ϴܺ� �߰� ��ư

		//���θ���� �ҷ����� ���� �߰� ��ã�� ����

		f.add(bottomAdd);//�ϴ� �߰� �г�
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});





	}//main
}
