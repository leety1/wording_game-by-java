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


//첫번째 프레임 클래스
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
		
	setTitle("산성비 게임");
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
//제일 큰 클래스 두번째 프레임에서
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
	private String[] work = { "바보","너는","빛쟁이","쌀국수","마라톤","날기","딸기",
			"수박","냠냠","붉은달","멜론","가게","자바","잡숴","초록빛","겨울과일","가라앉다","가듣히",
			"가려지다","가로등","가로막다","가르다","가뭄","가만히","가스","가이드","가입","가정교사","가져가다","가정교사",
			"간섭","간호사","간혹","갇히다","강화하다","개개인","거리","건드리다","게다가","결심","고개","관계자","끝없이","남대문 시장",
			"널리","넘다","논의하다","눈부시다","단단하다","달리다","해외계","덧붙이다","독하다","두리번거리다","두드리다","따라서",
			"마당","마찬가지","만등어지다","만만하다","말씀하다","맡기다","먹이","면하다","모자라다","묘사하다","묶이다","미끄러지다","바라다",
			"분리","부당","취하다","업체","키","국회","그러므로","포함하다","깨닫다","숨","행사","누나","신","경우","어떤","잘","그녀",
			"자신","그러다","일기","의지하다","절대","방지하다","달","예보","요일","운전기사","욕실","용감하다","위험성","마크",
			"만족","묘사","발전되다","방송사","방지하다","유행하다","으응","자장면","짜다","토론회","금요일","때때로",
			"발등","밤새","보내오다","세상에","슬퍼하다","펴내다","화장","하드웨어","손목","아랫사람","쓰레기통",
			"여전하다","정오","제대하다","찌꺼기","테니스","형식적","호남","고속도로","가까이","겁나다","성공","수행하다","감각","부족하다",
            "미만","백색","비바람","사기","사망하다","사무직","소질","솜","시디롬","식생활","신호등","신혼여행","실","씩씩하다","연구실","월드컵","유머","의류","입원","잊혀지다","잘살다",
           "장가", "적응","정리되다","조","졸업생","죽다","창피하다","친절","침실","태권도","토론하다","하나하나","합하다","핸드백","햄버거","가정교사",
          "감사","공통적","교육자","교재","기타","길어지다","깨소금","나빠지다","남","놓아두다","대접하다","두통","뛰어내리다","무궁화",
              "바이러스","방바닥","번거롭다", "사냥","사회","생활","설거지","수년","수출하다","숙소","슈퍼마켓","심리적","연기",
               "위로","이용자","입력하다","자격증","진료","창가","초조하다","타다","한잔하다","함께하다",
               "흔들다","푸르다","피우다","부족하다","생활","쓰다","방법"
			};
	private String[] game_LV=
	{ "level 1", "level 2", "level 3", "level 4", "level 5", "level 6", "level 7","level 8"};
	private JLabel Line;
	private JLabel Nick;

	private JPanel bar;
	
    ex3(){
    setTitle("산성비 게임 새로운 창");
	setSize(660, 700);
	setResizable(false);
	setVisible(true);
	Container t = getContentPane();
	
    tf = new JTextField();
	tf.setBounds(100,560, 267, 38);
    t.add(tf);
   
    
    list = new JList(game_LV);// 레벨 리스트 보여주기
	list.setSelectedIndex(0);
	list.setFont(new Font("굴림", Font.BOLD, 22));
	list.setBounds(386, 44, 140, 230);
	t.add(list);
	
	btn_start = new JButton("시작");// 시작 버튼
	btn_start.setFont(new Font("굴림", Font.BOLD, 23));
	btn_start.setBounds(440, 600, 105, 38);
	t.add(btn_start);
	
	level = new JLabel("level 1"); //레벨 리스트
	level.setHorizontalAlignment(SwingConstants.CENTER);
	level.setFont(new Font("굴림", Font.BOLD, 24));
	level.setBounds(376, 300, 99, 42);
	t.add(level);
    
	panel_Screen = new JPanel();//겜 화면
	panel_Screen.setBackground(new Color(181,93,118));
	panel_Screen.setForeground(new Color(181,93,118));
	panel_Screen.setBounds(43,29,330,500);
	t.add(panel_Screen);
	panel_Screen.setLayout(null);
	panel_Screen.setVisible(true);

	bar = new JPanel();//제한선
	bar.setBackground(new Color(173,178,216));
	panel_Screen.add(bar);
	bar.setBounds(0,440,330,10);
	
	score = new JLabel("0점");// 점수판
	score.setHorizontalAlignment(SwingConstants.CENTER);
	score.setFont(new Font("굴림", Font.BOLD, 25));
	score.setBounds(423, 450, 149, 45);
	t.add(score);
	
	Line = new JLabel("");
	t.add(Line);
	Line.setBounds(500,536,460,34);
	Line.setForeground(Color.RED);
	Line.setFont(new Font("굴림",Font.BOLD,34));
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
    
	

	
	
	btn_start.addActionListener(this); // 버튼 이벤트
	tf.addKeyListener(this); // 키 이벤트
	list.addListSelectionListener(this); // 리스트 이벤트
	tf.requestFocus(); // 텍스트 포커스
}
//클래스 안에 클래스 쓰레드
class Voca_Thread extends Thread{
	public void run() {
		
		panel_Screen.setVisible(true);// 게임화면 등장
		// 단어를 x값 랜덤으로생성
		for ( i = 0; i <= 10000; i++) {

			try {

				Random random = new Random();// 랜덤 객체 생성
				label[i] = new JLabel(work[random.nextInt(work.length)]);// 단어 랜덤으로 가지고 옴											
				label[i].setBounds(0, 0, 80, 35);// 단어 초기 위치 높이,폭 설정
				panel_Screen.add(label[i]);// 단어 추가
				label[i].setLocation(random.nextInt(270), 2);// x값 랜덤으로 보여주기
				// 단어를 움직이는 쓰레드 실행
				new Voca_Move().start();

				Thread.sleep(spd);// 게임레벨에 따른 단어속도

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
class Voca_Move extends Thread {
	public void run() {

		// 단어 생성 갯수 만큼 for 돌려 각 단어마다 y값 변경
		for (int a = 0; a <= i; a++) {
			if (label[a].isVisible()){
				int sp = label[a].getY();
				int xp = label[a].getX();

				label[a].setLocation(xp, sp + 15);

			}

			// 단어가 보여져있는 상태롤 빨간선을 넘었는지 확인
			if (label[a].isVisible() && label[a].getY() > 420) {
				label[a].setVisible(false);// 단어가 선을 넘으면 단어 사라짐
				life++;// 라이프 1 = 생명 1없어짐
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
			
			
			//쓰레드 중지
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
			spd = 1000;// 게임속도
			str = (String) list.getSelectedValue();// 리스트 이름 저장
			level.setText(str); // 레벨 라벨에 보여주기
		
			
	
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
		// 텍스트 필드에 값이 있는지 없는지 확인
		if (!tf.getText().equals("")) {
			// String 변수에 텍스트 값 주기
			String work_answer = tf.getText().toString();
			/*
			 * 텍스트 입력값과 동일한 단어 있는지 검사 동일 단어 있을시 안보이게 하고 점수 5점 올리기
			 * 삭제(단어가 틀리더라도 )
			 * 
			 */

			for (int i = 0; i <= label.length; i++) { // 동일 단어 검사 for
				try {
					if (work_answer.equals(label[i].getText())) {// 동일단어 검사
						if (label[i].isVisible()) { // 동일단어가 화면에 보여져 있는지 검사
							scorenum = scorenum += 5; // 점수 +5
							score.setText(scorenum + "점"); // 점수판 점수 변경
							label[i].setVisible(false);// 단어 화면에서 안보이게
							tf.setText("");// 텍스트 값 없애기
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
		score.setText("0점"); 
		scorenum = 0; 
		// 만약에 게임결과화면이 보이지 않게
		if (End.isVisible()) {
			End.setVisible(false);// 결과화면 안보이게
		}

		// 만들어져 있는지 확인
		if (label[0] != null) {
			for (int i = 0; i < label.length; i++) {
				// 쓰레드가 돌아가고 있으면 중지
				if (!new Voca_Thread().isAlive() || !new Voca_Move().isAlive()) {
					new Voca_Thread().interrupt();
					new Voca_Move().interrupt();// 중지
				}
				// 단어가 있다면 안보이게
				if (label[i] != null) {
					label[i].setVisible(false);
				}

			}
		}

		// 시작시 텍스트필드 포커스 주기
		tf.requestFocus();
		// 단어를 쓰레드 실행
		new Voca_Thread().start();

	}
}

}
