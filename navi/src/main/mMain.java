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

		Frame f = new Frame("���� �Է±�");
		Font font = new Font("", Font.PLAIN, 18);
		f.setLayout(null);
		f.setBounds(200, 200, 1000, 800);
		f.setBackground(Color.lightGray);


		//�ϴܺ� �߰� ��ư
		Panel addP = new Panel();
		addP.setLayout(null);
		addP.setFont(font);
		addP.setBackground(Color.DARK_GRAY);
		addP.setBounds(0, 700, 1000, 100);
		Button addB = new Button("�߰�");
		addB.setBounds(105, 25, 100, 50);

		Button deleteB = new Button("????");
		deleteB.setBounds(330, 25, 100, 50);

		Button makeB = new Button("���θ����");
		makeB.setBounds(555, 25, 100, 50);

		Button loadB = new Button("�ҷ�����");
		loadB.setBounds(780, 25, 100, 50);

		addP.add(makeB);
		addP.add(loadB);
		addP.add(deleteB);
		addP.add(addB);
		//�ϴܺ� �߰� ��ư

		//��� �߰� 
		Font font2 = new Font("", Font.PLAIN, 40);
		
		Panel locate1 = new Panel();
		locate1.setBounds(0, 50, 1000, 200);
		TextField tf1 = new TextField(20);
		tf1.setFont(font2);
		Button add1 = new Button("�Է�");
		add1.setPreferredSize(new Dimension(150,40));
		Button delete1 = new Button("����");
		delete1.setPreferredSize(new Dimension(150,40));
		
		locate1.add(tf1);
		locate1.add(add1);
		locate1.add(delete1);
		//��� �߰�
		
		Panel locate2 = new Panel();
		locate2.setBounds(0, 200, 1000, 200);
		TextField tf2 = new TextField(20);
		tf2.setFont(font2);
		Button add2 = new Button("�Է�");
		add2.setPreferredSize(new Dimension(150,40));
		Button delete2 = new Button("����");
		delete2.setPreferredSize(new Dimension(150,40));
		
		
		addB.addActionListener(new ActionListener() {

			 //�߰���ư ������ Ƚ��
			@Override
			public void actionPerformed(ActionEvent e) {
				locate2.add(tf2);
				locate2.add(add2);
				locate2.add(delete2);
				
					
			}
		});


		f.add(locate2);//���2 �߰� �г�
		f.add(locate1);//��� �߰� �г�
		f.add(addP);//�ϴ� �߰� �г�
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}//main
}
