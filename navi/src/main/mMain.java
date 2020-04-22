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
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class mMain {
	public static void main(String[] args) {

		Frame f = new Frame("���� �Է±�");
		Font font = new Font("", Font.PLAIN, 18);
		f.setLayout(null);
		f.setBounds(20, 20, 1000, 1000);
		f.setBackground(Color.lightGray);

		//�ϴܺ� �߰� ��ư
		Panel addP = new Panel();
		addP.setLayout(null);
		addP.setFont(font);
		addP.setBackground(Color.DARK_GRAY);
		addP.setBounds(0, 900, 1000, 100);
		Button addB = new Button("�߰�");
		addB.setBounds(105, 25, 100, 50);

		Button newaddB = new Button("������ �Է�");
		newaddB.setBounds(330, 25, 100, 50);

		Button resetB = new Button("�ʱ�ȭ");
		resetB.setBounds(555, 25, 100, 50);

		Button loadB = new Button("�ҷ�����");
		loadB.setBounds(780, 25, 100, 50);

		addP.add(resetB);
		addP.add(loadB);
		addP.add(newaddB);
		addP.add(addB);
		//�ϴܺ� �߰� ��ư

		//��� �߰� �κ�
		Font font2 = new Font("", Font.PLAIN, 40);

		//�ǳ� ������
		int loX = 0;
		int loY = 50;
		int siX =900;
		int siY =50;
		int g = 50; //�ǳڰ� ����

		int tbN = 10;//�ִ� �ؽ�Ʈ�ڽ� ��
		ArrayList<PanelMaker> arr = new ArrayList<>();
		for(int i =0; i < tbN; i++) {
			PanelMaker pm = new PanelMaker(loX, loY, siX, siY);
			loY +=g;
			arr.add(pm);
		}
		//�߰� ��ư Ŭ���� ����Է¹ڽ� �߰�.		
		addB.addActionListener(new ActionListener() {
			int cnt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				f.add(arr.get(cnt));
				//������ ���ſ� ũ�⺯��
				f.resize(1001, 1000);
				f.resize(1000, 1000);
				if(cnt == tbN-1) {
					JOptionPane.showMessageDialog(f, "�׸���");
				}
				//reset ��ư Ŭ���� �ʱ�ȭ
				resetB.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						for(int i =1; i <tbN; i++ ) {
							f.remove(arr.get(i));
							cnt = 0;//��� 1���� ����� ����
						}//for
					}
				});//reset �ʱ�ȭ ��ư
			}
		});//����Է¹ڽ� �߰� ��ư
		

		f.add(arr.get(0));
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
