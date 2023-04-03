//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*2);
		char ch;
		if(num==0)
			{
				ch=(char)((Math.random()*26)+65); // 대문자
			}
		else
			{	
				ch=(char)((Math.random()*26)+97); // 소문자
			}
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는 대문자입니다");
		else
			System.out.println(ch+"는 소문자입니다");
	}
	
}
