import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.*;


//ù��° ������ Ŭ����
class ex2 extends JFrame  {
    private JButton btn;
    private JLabel Head_lbl;
    private JLabel lbl;
    private JLabel log;
    private JLabel pass;
    private JPasswordField passText;
    private JTextField userText;
    private boolean isLoginCheck;
    
	public ex2() {
		
	setTitle("�꼺�� ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(getOwner());
    Container c = getContentPane();
    c.setLayout(null);
   
    log = new JLabel("ID");
    log.setBounds(233,50,20,20);
    c.add(log);
    
    userText = new JTextField(20);
    userText.setBounds(233,72,100,20);
    c.add(userText);
    
    pass = new JLabel("PASS");
    pass.setBounds(233,95,50,20);
    c.add(pass);
    
    passText = new JPasswordField(20);
    passText.setBounds(233,117,100,20);
    c.add(passText);
    passText.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		isLoginCheck();
    	}
    });
    
    Head_lbl = new JLabel();
    Head_lbl.setFont((new Font("Comic Sans Ms",Font.BOLD, 20)));
    Head_lbl.setText("Java is Funny!");
    c.add(Head_lbl);
    Head_lbl.setBounds(230,0,200,40);
    
    ImageIcon img = new ImageIcon("img/snoopy.gif");
    lbl = new JLabel(img);
    lbl.setBounds(0,0,230,200);
    c.add(lbl);
    
    btn = new JButton("Gmae Start");
	btn.setBounds(230,150,100,30);
	btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			new ex3();
			isLoginCheck();
		}
	});
	c.add(btn);
	
	setResizable(false);
	setSize(400, 240);
	setVisible(true);
}
	
public void isLoginCheck() {
	if(userText.getText().equals("java")&&new String(passText.getPassword()).equals("1234")) {
		isLoginCheck = true;
				
		if(isLogin()) {
		new ex3();
		}
	}else {JOptionPane.showMessageDialog(null,"Faild");
	new ex2();
}
}
public boolean isLogin() {
	return isLoginCheck;
}



public static void main(String[] args) {
	new ex2();
}

}
//���� ū Ŭ���� �ι�° �����ӿ���
class ex3 extends JFrame implements ActionListener, KeyListener, ListSelectionListener {
	private JTextField tf ;
	private JButton btn_start;
	private JPanel life1;
	private JPanel life2;
	private JPanel life3;
	private int life = 0;
	private JLabel level;
	private JList list;
	private JLabel label[] = new JLabel[10000];
	private int scorenum = 0;
	private JLabel score;
	private int i = 0;
	private JLabel End;
	private int spd = 1000;
	private JPanel panel_Screen;
	private String[] work = { "�ٺ�","�ʴ�","������","�ұ���","������","����","����",
			"����","�ȳ�","������","���","����","�ڹ�","�⽤","�ʷϺ�","�ܿ����","����ɴ�","������",
			"��������","���ε�","���θ���","������","����","������","����","���̵�","����","��������","��������","��������",
			"����","��ȣ��","��Ȥ","������","��ȭ�ϴ�","������","�Ÿ�","�ǵ帮��","�Դٰ�","���","��","������","������","���빮 ����",
			"�θ�","�Ѵ�","�����ϴ�","���νô�","�ܴ��ϴ�","�޸���","�ؿܰ�","�����̴�","���ϴ�","�θ����Ÿ���","�ε帮��","����",
			"����","��������","���������","�����ϴ�","�����ϴ�","�ñ��","����","���ϴ�","���ڶ��","�����ϴ�","���̴�","�̲�������","�ٶ��",
			"�и�","�δ�","���ϴ�","��ü","Ű","��ȸ","�׷��Ƿ�","�����ϴ�","���ݴ�","��","���","����","��","���","�","��","�׳�",
			"�ڽ�","�׷���","�ϱ�","�����ϴ�","����","�����ϴ�","��","����","����","�������","���","�밨�ϴ�","���輺","��ũ",
			"����","����","�����Ǵ�","��ۻ�","�����ϴ�","�����ϴ�","����","�����","¥��","���ȸ","�ݿ���","������",
			"�ߵ�","���","��������","����","�����ϴ�","�쳻��","ȭ��","�ϵ����","�ո�","�Ʒ����","��������",
			"�����ϴ�","����","�����ϴ�","���","�״Ͻ�","������","ȣ��","��ӵ���","������","�̳���","����","�����ϴ�","����","�����ϴ�",
            "�̸�","���","��ٶ�","���","����ϴ�","�繫��","����","��","�õ��","�Ļ�Ȱ","��ȣ��","��ȥ����","��","�����ϴ�","������","������","����","�Ƿ�","�Կ�","��������","�߻��",
           "�尡", "����","�����Ǵ�","��","������","�״�","â���ϴ�","ģ��","ħ��","�±ǵ�","����ϴ�","�ϳ��ϳ�","���ϴ�","�ڵ��","�ܹ���","��������",
          "����","������","������","����","��Ÿ","�������","���ұ�","��������","��","���Ƶδ�","�����ϴ�","����","�پ����","����ȭ",
              "���̷���","��ٴ�","���ŷӴ�", "���","��ȸ","��Ȱ","������","����","�����ϴ�","����","���۸���","�ɸ���","����",
               "����","�̿���","�Է��ϴ�","�ڰ���","����","â��","�����ϴ�","Ÿ��","�����ϴ�","�Բ��ϴ�",
               "����","Ǫ����","�ǿ��","�����ϴ�","��Ȱ","����","���"
			};
	private String[] game_LV=
	{ "level 1", "level 2", "level 3", "level 4", "level 5", "level 6", "level 7","level 8"};
	private JLabel Line;
	private JLabel Nick;

	private JPanel bar;
	
    ex3(){
    setTitle("�꼺�� ���� ���ο� â");
	setSize(660, 700);
	setResizable(false);
	setVisible(true);
	Container t = getContentPane();
	
    tf = new JTextField();
	tf.setBounds(100,560, 267, 38);
    t.add(tf);
   
    
    list = new JList(game_LV);// ���� ����Ʈ �����ֱ�
	list.setSelectedIndex(0);
	list.setFont(new Font("����", Font.BOLD, 22));
	list.setBounds(386, 44, 140, 230);
	t.add(list);
	
	btn_start = new JButton("����");// ���� ��ư
	btn_start.setFont(new Font("����", Font.BOLD, 23));
	btn_start.setBounds(440, 600, 105, 38);
	t.add(btn_start);
	
	level = new JLabel("level 1"); //���� ����Ʈ
	level.setHorizontalAlignment(SwingConstants.CENTER);
	level.setFont(new Font("����", Font.BOLD, 24));
	level.setBounds(376, 300, 99, 42);
	t.add(level);
    
	panel_Screen = new JPanel();//�� ȭ��
	panel_Screen.setBackground(new Color(181,93,118));
	panel_Screen.setForeground(new Color(181,93,118));
	panel_Screen.setBounds(43,29,330,500);
	t.add(panel_Screen);
	panel_Screen.setLayout(null);
	panel_Screen.setVisible(true);

	bar = new JPanel();//���Ѽ�
	bar.setBackground(new Color(173,178,216));
	panel_Screen.add(bar);
	bar.setBounds(0,440,330,10);
	
	score = new JLabel("0��");// ������
	score.setHorizontalAlignment(SwingConstants.CENTER);
	score.setFont(new Font("����", Font.BOLD, 25));
	score.setBounds(423, 450, 149, 45);
	t.add(score);
	
	Line = new JLabel("");
	t.add(Line);
	Line.setBounds(500,536,460,34);
	Line.setForeground(Color.RED);
	Line.setFont(new Font("����",Font.BOLD,34));
	Line.setHorizontalAlignment(SwingConstants.CENTER);
	

	life1 = new JPanel();
	life1.setBackground(Color.BLUE);
	life1.setBounds(424, 356, 26, 26);
	t.add(life1);
	
	life2 = new JPanel();
	life2.setBackground(Color.blue);
	life2.setBounds(456,356,26,26);
	t.add(life2);
	
	life3 = new JPanel();
	life3.setBackground(Color.blue);
	life3.setBounds(486,356,26,26);
	t.add(life3);
	
	
	
	End = new JLabel("GAME OVER");
    End.setFont((new Font("Comic Sans Ms",Font.BOLD, 50)));
    End.setForeground(new Color(195,11,7));
    End.setVisible(false);
	t.add(End);
	End.setLayout(null);
    
	

	
	
	btn_start.addActionListener(this); // ��ư �̺�Ʈ
	tf.addKeyListener(this); // Ű �̺�Ʈ
	list.addListSelectionListener(this); // ����Ʈ �̺�Ʈ
	tf.requestFocus(); // �ؽ�Ʈ ��Ŀ��
}
//Ŭ���� �ȿ� Ŭ���� ������
class Voca_Thread extends Thread{
	public void run() {
		
		panel_Screen.setVisible(true);// ����ȭ�� ����
		// �ܾ x�� �������λ���
		for ( i = 0; i <= 10000; i++) {

			try {

				Random random = new Random();// ���� ��ü ����
				label[i] = new JLabel(work[random.nextInt(work.length)]);// �ܾ� �������� ������ ��											
				label[i].setBounds(0, 0, 80, 35);// �ܾ� �ʱ� ��ġ ����,�� ����
				panel_Screen.add(label[i]);// �ܾ� �߰�
				label[i].setLocation(random.nextInt(270), 2);// x�� �������� �����ֱ�
				// �ܾ �����̴� ������ ����
				new Voca_Move().start();

				Thread.sleep(spd);// ���ӷ����� ���� �ܾ�ӵ�

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
class Voca_Move extends Thread {
	public void run() {

		// �ܾ� ���� ���� ��ŭ for ���� �� �ܾ�� y�� ����
		for (int a = 0; a <= i; a++) {
			if (label[a].isVisible()){
				int sp = label[a].getY();
				int xp = label[a].getX();

				label[a].setLocation(xp, sp + 15);

			}

			// �ܾ �������ִ� ���·� �������� �Ѿ����� Ȯ��
			if (label[a].isVisible() && label[a].getY() > 420) {
				label[a].setVisible(false);// �ܾ ���� ������ �ܾ� �����
				life++;// ������ 1 = ���� 1������
			}
		}

		
		switch (life) {
		case 0:
			life1.setBackground(Color.BLUE);
			life2.setBackground(Color.BLUE);
			life3.setBackground(Color.BLUE);
			break;

		case 1: 
			life1.setBackground(Color.white);
			life2.setBackground(Color.BLUE);
			life3.setBackground(Color.BLUE);
			break;

		case 2:
			life1.setBackground(Color.white);
			life2.setBackground(Color.white);
			life3.setBackground(Color.BLUE);
			break;
		case 3:
			life1.setBackground(Color.white);
			life2.setBackground(Color.white);
			life3.setBackground(Color.white);
			
			panel_Screen.setVisible(false);
			End.setVisible(true);
			
			
			//������ ����
			new Voca_Thread().interrupt();
			new Voca_Move().interrupt();

			break;
		default:
			break;
		}
	}
}

@Override
public void valueChanged(ListSelectionEvent e) {
	// TODO Auto-generated method stub
	String str;
	
		
	
	if (e.getSource() == list) {
		

		switch (list.getSelectedIndex()) {
		case 0:
			spd = 1000;// ���Ӽӵ�
			str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
			level.setText(str); // ���� �󺧿� �����ֱ�
		
			
	
			break;
		case 1:
			spd = 980;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			
			break;
		case 2:
			spd = 960;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			
			break;
		case 3:
			spd = 940;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
		
			
			break;
		case 4:
			spd = 920;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			break;
		case 5:
			spd = 900;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			break;
		case 6:
			spd = 880;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			break;
		case 7:
			spd = 860;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			break;
		case 8:
			spd = 840;
			str = (String) list.getSelectedValue();
			level.setText(str);
			
			break;
	

		default:
			break;
		}
	}
	}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		// �ؽ�Ʈ �ʵ忡 ���� �ִ��� ������ Ȯ��
		if (!tf.getText().equals("")) {
			// String ������ �ؽ�Ʈ �� �ֱ�
			String work_answer = tf.getText().toString();
			/*
			 * �ؽ�Ʈ �Է°��� ������ �ܾ� �ִ��� �˻� ���� �ܾ� ������ �Ⱥ��̰� �ϰ� ���� 5�� �ø���
			 * ����(�ܾ Ʋ������ )
			 * 
			 */

			for (int i = 0; i <= label.length; i++) { // ���� �ܾ� �˻� for
				try {
					if (work_answer.equals(label[i].getText())) {// ���ϴܾ� �˻�
						if (label[i].isVisible()) { // ���ϴܾ ȭ�鿡 ������ �ִ��� �˻�
							scorenum = scorenum += 5; // ���� +5
							score.setText(scorenum + "��"); // ������ ���� ����
							label[i].setVisible(false);// �ܾ� ȭ�鿡�� �Ⱥ��̰�
							tf.setText("");// �ؽ�Ʈ �� ���ֱ�
						}
					} else {
						tf.setText("");
					}
				} catch (Exception e2) {
					e2.getMessage();
				}

			}

		}

	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(btn_start)) {

		
		life = 0;
		score.setText("0��"); 
		scorenum = 0; 
		// ���࿡ ���Ӱ��ȭ���� ������ �ʰ�
		if (End.isVisible()) {
			End.setVisible(false);// ���ȭ�� �Ⱥ��̰�
		}

		// ������� �ִ��� Ȯ��
		if (label[0] != null) {
			for (int i = 0; i < label.length; i++) {
				// �����尡 ���ư��� ������ ����
				if (!new Voca_Thread().isAlive() || !new Voca_Move().isAlive()) {
					new Voca_Thread().interrupt();
					new Voca_Move().interrupt();// ����
				}
				// �ܾ �ִٸ� �Ⱥ��̰�
				if (label[i] != null) {
					label[i].setVisible(false);
				}

			}
		}

		// ���۽� �ؽ�Ʈ�ʵ� ��Ŀ�� �ֱ�
		tf.requestFocus();
		// �ܾ ������ ����
		new Voca_Thread().start();

	}
}

}
