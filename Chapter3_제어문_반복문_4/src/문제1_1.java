// int x > 10 && int x < 20


public class 문제1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int)(Math.random()*100);
		if(x>10 && x<20)
		{
			System.out.println("x="+x+" true");
		}
		else
		{
			System.out.println("x="+x+" false");
		}
	}

}
