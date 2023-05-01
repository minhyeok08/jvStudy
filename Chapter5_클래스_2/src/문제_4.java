import java.util.Scanner;
public class 문제_4 {

	static int method3(int num)
	{
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum += i;
		}
		return sum;
	}
	
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = scan.nextInt();
		
		int sum = method3(num);
		System.out.println("1~"+num+"까지의 합은 "+sum);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
