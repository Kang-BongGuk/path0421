package main;
//�밡�� flowlayerout
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

public class mMain3 {
	public static void main(String[] args) {

		Frame f = new Frame("���� �Է±�");
		Font font = new Font("", Font.PLAIN, 18);
		
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
		Panel locate = new Panel();
		
		TextField tf1 = new TextField(20);
		Font font2 = new Font("", Font.PLAIN, 40);
		tf1.setFont(font2);
		Button add = new Button("�Է�");
		add.setPreferredSize(new Dimension(150,40));
		Button delete = new Button("����");
		delete.setPreferredSize(new Dimension(150,40));
		
		locate.add(tf1);
		locate.add(add);
		locate.add(delete);
		//��� �߰�
		TextField tf2 = new TextField(20);
		tf2.setBounds(100, 200, 500, 80);
		Button add2 = new Button("�Է�");
		add2.setBounds(630, 200, 150, 80);
		Button delete2 = new Button("����");
		delete2.setBounds(800, 200, 150, 80);
		//���2
		TextField tf3 = new TextField(20);
		tf3.setBounds(100, 300, 500, 80);
		Button add3 = new Button("�Է�");
		add3.setBounds(630, 300, 150, 80);
		Button delete3 = new Button("����");
		delete3.setBounds(800, 300, 150, 80);
		
		
		addB.addActionListener(new ActionListener() {

			int addcnt = 0; //�߰���ư ������ Ƚ��
			@Override
			public void actionPerformed(ActionEvent e) {
				addcnt++;
				if(addcnt == 1) {
				locate.add(tf2);
				locate.add(add2);
				locate.add(delete2);
				}
				
				if(addcnt == 2) {
					locate.add(tf3);
					locate.add(add3);
					locate.add(delete3);
				}
				
				
			}
		});


		f.add(locate, BorderLayout.CENTER);//��� �߰� �г�
		f.add(addP, BorderLayout.SOUTH);//�ϴ� �߰� �г�
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}//main
}
