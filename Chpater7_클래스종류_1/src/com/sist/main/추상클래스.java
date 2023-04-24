package com.sist.main;

import java.io.*;
abstract class 도형
{
	// 무조건 구현이 필요하다
	public abstract void draw();
	// 필요에 따라 오버라이딩
	public void color() 
	{
		System.out.println("검정색");
	}
}
class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 네모 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("네모를 그린다");
	}
	
}

/*
 * 	1. 일반 클래스 => new (O)
 * 	2. 추상 클래스 => 구현 후 사용
 * 	3. 인터페이스 => 추상 클래스와 동일 (O)
 *  4. 종단 클래스 => 상속해서 확장이 불가능
 *  5. static => 메모리 => 클래스명으로 접근
 *  ---------------------------------
 */
abstract class A
{
	public abstract void aaa();
	public void bbb() {}
	public void ccc() {}
	public void ddd() {}
	public abstract void eee();
}
class B extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 추상클래스 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오버라이딩 기법
		도형 a = new 선();
		a.draw();
		a = new 원();
		a.draw();
		a = new 네모();
		a.draw();
		OutputStream out;
	}

}
