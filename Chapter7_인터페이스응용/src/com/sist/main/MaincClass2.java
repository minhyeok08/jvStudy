package com.sist.main;
class A
{
	public A() // 상위클래스의 매개변수있는 생성자 호출전에 기본생성자를 호출해야하므로 기본생성자를 만들어야함
	{
		System.out.println("A() call...");
	}
	public A(int a)
	{
		System.out.println("A(int a) call...");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B() call...");
	}
}
public class MaincClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(); //*****
		A a = new A();
		A aa = new B(); //***** 인터페이스, 추상클래스
		B bb = (B)aa;
	}

}
