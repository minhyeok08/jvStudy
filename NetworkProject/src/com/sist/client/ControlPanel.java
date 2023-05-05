package com.sist.client;

import javax.swing.JPanel;


import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel {
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	HomePanel hp=new HomePanel();
	DetailPanel dp=new DetailPanel();
	
	CardLayout card=new CardLayout();
	
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("detail",dp);
	}
	
}
