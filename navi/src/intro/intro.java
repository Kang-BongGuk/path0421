package intro;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class intro extends Thread {
	public static void main(String[] args) {
		Boolean t = true;
		Frame f = new Frame();
		
		f.setBounds(800, 100, 800, 500);
		ImageIcon intro1 = new ImageIcon("1.png");
		JLabel j1 = new JLabel(intro1); //�̹��� �߰�
		j1.setBounds(0, 0, 800, 500);//��Ʈ��1 ��ġ
		
		ImageIcon intro2 = new ImageIcon("2.png");
		JLabel j2 = new JLabel(intro2); //�̹��� �߰�
		j2.setBounds(0, 0, 800, 500);//��Ʈ��2 ��ġ
		
		
		f.add(j1);
		f.setVisible(t);
		
		try {
			Thread.sleep(3000);
			t = false;
			f.remove(j1);
			f.add(j2);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		f.setVisible(true);
	
		//
	
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}//main
}
