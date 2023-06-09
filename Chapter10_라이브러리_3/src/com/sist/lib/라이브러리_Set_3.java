package com.sist.lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;

public class 라이브러리_Set_3 {
	private static Object Jsoup;
	public static Set genieMusic()
	{
		Set set = new HashSet();
		try 
		{
			for(int i=1;i<=2;i++)
			{
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg="+i).get();
				Elements title = doc.select("table.list-wrap a.title");	
				for(int j=0;j<title.size();j++);
					{
						set.add(title.get(j).text());
					}
			}
		}catch(Exception ex){}
		return set;
	}
	public static Set melonMusic()
	{
		Set set = new HashSet();
		try
		{
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				//System.out.println(title.get(j).text());
				set.add(title.get(i).text());
			}
		}catch(Exception ex){}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지니뮤직 읽기
		Set genie = genieMusic();
		System.out.println(genie);
		// 멜론 읽기
		Set melon = melonMusic();
		System.out.println(melon);
		
		// 지니뮤직에만 있는 노래 찾기
		genie.removeAll(melon); // 차집함
		// [1,2,3,4,5] - [1,2,3,6,7]	=> 4,5
		//System.out.println(genie);
		/*for(Object o:genie)
		{
			System.out.println(obj.toString());
		}*/
		melon.retainAll(genie);
		System.out.println("멜론과 지니뮤직의 동일한 곡:"+melon.size());
		for(Object obj:melon)
		{
			System.out.println(obj.toString());
		}
	}

}
