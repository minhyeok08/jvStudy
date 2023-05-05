package com.sist.client;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import com.sist.common.ImageChange;
															// ActionListener 버튼 눌렀을 때, 처리하는 역할
public class NetworkMain2 extends JFrame implements ActionListener
{
	MenuPanel mp;
	ControlPanel cp;
	SidePanel tp;
	JButton b1,b2,b3,b4,b5;
	JLabel logo;	// 로고 
	
	// 로그인 가져오기
	Login login=new Login();
	
	public NetworkMain2()
	{
		logo=new JLabel();
		Image img=ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 200, 130);
		
		logo.setIcon(new ImageIcon(img));
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new SidePanel();
		// 생성자를 통해서 메모리 할당해주기 
		// 메뉴, 탑패널은 고정시키고 => 컨트롤패널만 메뉴 클릭에 따라서 변경되도록 설정하기 
		
		setLayout(null); 		//Layout 없이 직접 배치
		
		logo.setBounds(10, 15, 200, 130);
		
		// 배치 ==> 크기와 위치 잡기
		mp.setBounds(10, 150, 600, 50);
		cp.setBounds(10, 210, 960, 730);
		tp.setBounds(980, 210, 200, 730);
		
		b1=new JButton("홈");
		b2=new JButton("영화검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스검색");
		b5=new JButton("영화추천");
		
		mp.setLayout(new GridLayout(1, 5, 10,10)); 			// 줄, 갯수, 간격 간격
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		
		// 추가
		
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		//윈도우 크기 결정
		setSize(1200, 1000);
		setVisible(true);
		// 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("4조 영화 프로그램");
		
		
		// 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		// 로그인 이벤트 등록
		login.b1.addActionListener(this);	// this는 addActionListener 메소드가 이 클래스 내에 있다는 것을 의미
		login.b2.addActionListener(this);	
		// 채팅
		cp.cp.tf.addActionListener(this);
		
		
	}
	
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch (Exception e)
		{
		}
		new NetworkMain2();
	}

	
	// 버튼 눌렀을 때, 처리되는 기능 오버라이딩하기
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			cp.card.show(cp, "home");		// cp에서 설정한 이름에 따라서 화면이 변경되도록 하는 cardLayout 
		}else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
			
		}else if(e.getSource()==b3)
		{
			cp.card.show(cp, "chat");
			
		}else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
			
		}else if(e.getSource()==b5)
		{
			cp.card.show(cp, "recomm");
			
		}
		else if(e.getSource()==login.b1)
		{
			login.setVisible(false);		// login.b1(로그인)을 눌렀을 때, login 창을 안보이게 --> this.setVisible(전체창) 보이도 
			setVisible(true);
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initStyle();
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1)
				return;
			cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");
		}
	}
}