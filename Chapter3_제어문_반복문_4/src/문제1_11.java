import java.util.Scanner;
public class 문제1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("정수 10개 입력");
			int num
		
		}*/
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			if(num%2==0)
				count++;
		}
		System.out.println("===== 결과값 ======");
		System.out.println("짝수의 총 개수:"+count);
		
		int count3=0, count5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			if(num%3==0)
				count3++;
			if(num%5==0)
				count5++;
		}
		System.out.println("===== 결과값 ======");
		System.out.println("3의 배수의 총 개수:"+count3);
		System.out.println("5의 배수의 총 개수:"+count5);
		
		
		
	}

}
