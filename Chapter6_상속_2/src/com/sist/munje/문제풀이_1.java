package com.sist.munje;
// 1. 캡슐화
// => 데이터 보호
// =? 데이터를 은닉화 (private) / 메소드를 통해서 접근이 가능 (다른 클래스 연결=> public)
// 사용자 정의 데이터형 => 필요에 의해 데이터를 묶어서 관리할 목적으로 만든다
// 사용자 정의 데이터형 => ~VO
class SutdaCard
{
	private int num;
	private boolean isKwang;
	// getter => 읽기
	// getter => 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}
class Student
{
	private String name;
	private int no, kor, eng, math, ban;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
}
class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}

/*
 * 	인스턴스 변수 : 데이터를 각각 저장시에 사용
 * 		=> kind, num
 * 	정적변수(공유변수) : 공통으로 사용되는 변수 = 메모리가 1개만 생성
 * 		=> width, height
 * 	------------------------- 프로그램 종료시까지 메모리 유지 (자동 초기화)
 * 	지역변수 : 메소드에서 선언되는 변수 (지역변수, 매개변수)
 * 			=> 메소드 안에서만 사용 ({}을 벗어나면 사라진다)
 * 			=> 반드시 초기화 후에 사용
 * 			=> k,n
 * 
 * 	
 * 	생성자
 * 	1) 모든 생성자의 이름은 클래스명과 동일하다 (O)
 * 	2) 생성자는 객체를 생성하기 위한 것이다 (X) => new // 생성자는 초기값을 담당
 * 	3) 클래스에는 생성자가 반드시 하나 이상 있어야 한다 (X)
 * 		=> 생성자는 없어도 상관 없다
 * 		   ------------------ 컴파일러가 자동을 기본 생성자를 추가한다
 * 	4) 생성자는 오버로딩을 할 수 있다
 * 			 ------ 같은 이름의 메소드를 여러개 만들어서 사용
 * 					= 여러개 만들 수 있다
 * 		*** 오버로딩의 조건
 * 		= 한개의 클래스나 상속 관계의 클래스
 * 		= 메소드명 동일
 * 		= 매개변수의 개수나 데이터형이 다르다
 * 		= 리턴형은 관계 없다
 * 
 * 		class A
 * 		{
 * 			public void display(){}
 * 			public int display(int a){}
 * 		}
 * 		class B extends A
 * 		{
 * 			public int display(int a, int b){} => 오버로딩
 * 		}
 * 
 * 	this
 * 	----
 * 	1) 모든 클래스는 this를 가지고 있다
 * 	2) 객체 자신을 가리키는 참조변수 (static Object this) => new
 * 		=> this는 생성자, 인스턴스 메소드에서 사용이 가능
 * 		class A
 * 		{
 * 			public A(//A this 생략) {
 * 			}
 * 			public void display(//A this 생략){
 * 			}
 * 			public static void aaa(//static은 this 사용 불가){
 * 			}
 * 		}
 * 	3) 클래스 내에서는 어디서든 사용이 가능 (X) static 메소드에서는 사용 불가능
 * 	4) 지역변수와 인스턴스 변수를 구분할 때 사용한다
 * 		class A
 * 		{
 * 			private String name; => heap
 * 			public void display(String name) => stack
 * 			{
 * 				this.name = name(매개변수)
 * 				---------
 * 				A 클래스에 설정된 변수
 * 			}
 * 		}
 * 	5) 클래스 메소드(static) 내에서는 사용할 수 없다 (O)
 * 		인스턴스 메소드 , 객체 메소드
 * 		 객체명.메소드
 * 		정적 메소드 , 공유 메소드 , 클래스 메서드
 * 		 클래스명.메소드
 * 	------------------------------------------
 * 	오버로딩 조건
 * 	1) 메소드명이 동일 (한개의 이름으로 여러개의 새로운 기능을 추가)
 * 	2) 매개변수의 개수가 데이터형이 달라야 한다
 * 	3) 리턴형은 관계 없다
 * 	4) 매개변수의 이름이 달라야 한다
 * 		void display(int a) => display(int) 이렇게 저장됨 (변수명 제외하고)
 * 		void display(int b)	=> display(int)
 * 	예)
 * 	long add(int a, int b) { return a+b; } add(int,int)
	(X)a. long add(int x, int y) { return x+y; } add(int,int)
	b. long add(long a, long b) { return a+b; }	add(long,long)
	c. int add(byte a, byte b) { return a+b; } add(byte,byte)
	d. int add(long a, int b) { return (int)(a+b); } add(long,int)
	
	a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
	   ----- 인스턴스변수, 정적변수 => 자동 초기화
	   int => 0
	   double => 0.0
	   boolean => false
	   String => null (클래스, 배열)
	   null => 참조하는 주소가 없는 경우
	   => String s = null
	   	  if(s==null)
	   	  String s = "";
	   	  if(s.equals(""))
	b. 지역변수는 사용하기 전에 반드시 초기화해야 한다. (O)
		지역변수는 자동 초기화가 안된다 (반드시 초기화 후에 사용)
	c. 초기화 블럭보다 생성자가 먼저 수행된다.
		명시적 초기화 => 초기화 블럭 => 생성자
					 클래스 변수 => 인스턴스
	d. 명시적 초기화를 제일 우선적으로 고려해야 한다. (O)
	   ---------
	   class A
	   {
	      int a = 100;
	   }
	e. 클래스변수보다 인스턴스변수가 먼저 초기화된다. (X)
	   ------- 컴파일시, new
	   
	   
	a. 기본값-명시적초기화-초기화블럭-생성자 (O) => 초기화 순서 답
					 -------
					 static = > instance
	b. 기본값-명시적초기화-생성자-초기화블럭
	c. 기본값-초기화블럭-명시적초기화-생성자
	d. 기본값-초기화블럭-생성자-명시적초기화
	
	 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
		
	a. 자동 초기화되므로 별도의 초기화가 필요없다.(x)
	b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
	c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
	d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다. (x)
	e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. (x)
	
	 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?

	a. public-protected-(default)-private
	b. public-(default)-protected-private
	c. (default)-public-protected-private
	d. private-protected-(default)-public
	
		접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
		
	(private     ) - 같은 클래스 내에서만 접근이 가능하다.
	(default     ) - 같은 패키지 내에서만 접근이 가능하다.
	(protected     ) - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
	( public    ) - 접근 제한이 전혀 없다.

 		다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

	a. public은 접근제한이 전혀 없는 접근 제어자이다.
	b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
	c. 지역변수에도 접근 제어자를 사용할 수 있다. (x)
	   --------
	   지역변수는 static, 접근지정어, abstract는 사용이 불가능
	   지역변수 중에 유일하게 사용 : final
	d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
	e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.





 */
class A
{
	int a = 10;
	static int b = 20;
	{
		a = 100;
		System.out.println("a="+a);
	}
	
	static
	{
		b = 200;
		System.out.println("b="+b);
	}
	
	A(){
		a = 1000;
		b = 2000;
		System.out.println("a="+a+",b="+b);
	}
}
public class 문제풀이_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
	}

}
