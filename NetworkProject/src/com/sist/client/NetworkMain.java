package com.sist.client;

import java.awt.*; // Layout
import javax.swing.*; // window
import java.awt.event.*;

import com.sist.common.ImageChange;

import java.awt.event.*; 

public class NetworkMain extends JFrame implements ActionListener{
   MenuPanel mp;
   ControlPanel cp;
   SidePanel sp;
   JButton b1,b2,b3,b4,b5;
   JLabel logo;
   public NetworkMain()
   {
      mp = new MenuPanel();
      cp = new ControlPanel();
      sp = new SidePanel();
      
      setLayout(null);
      logo= new JLabel();
      Image img = ImageChange.getImage(new ImageIcon("C:\\javaDev\\logo.png"), 300, 250);
      logo.setIcon(new ImageIcon(img));
      logo.setBounds(1550, 15, 300, 250);
      mp.setBounds(10, 15, 1500, 50);
      cp.setBounds(10, 75, 1500, 850);
      sp.setBounds(1550, 275, 300, 650);
      
      setLayout(null);
      b1=new JButton("영화 랭킹");
      b2=new JButton("검색");
      b3=new JButton("영화 상세 정보");
      b4=new JButton("영화 뉴스");
      b5=new JButton("채팅");
      mp.setLayout(new GridLayout(1, 5, 10, 10));
      mp.add(b1);
      mp.add(b2);
      mp.add(b3);
      mp.add(b4);
      mp.add(b5);
      
      //추가
      add(mp);
      add(cp);
      add(sp);
      add(logo);
      // 윈도우 크기
      setSize(1900, 1000);
      // 윈도우를 보여준다
      setVisible(true);   
      // 종료
      // X 클릭시 메모리 해제
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      
   }

   public static void main(String[] args) {
      try
      {
         UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
      }catch(Exception ex) {}
      
      new NetworkMain();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1)
      {
         
      }
      else if(e.getSource()==b2)
      {
         
      }
      else if(e.getSource()==b3)
      {
         
      }
      else if(e.getSource()==b4)
      {
         
      }
      else if(e.getSource()==b5)
      {
         
      }
      
   }

}