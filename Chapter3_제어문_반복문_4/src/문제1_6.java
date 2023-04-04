import java.util.Scanner;
public class 문제1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int start = scan.nextInt();
		
		/*while(true)
		{
			System.out.print("두개의 정수를 입력(10 20):");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.printf("num1 * num2 = %d",num1*num2);
			break;*/
			
		int end=0;
		while(true)
		{
			System.out.print("두번째 정수 입력:");
			end=scan.nextInt();
			if(end<start)
			{
				System.out.println("첫번째 정수보다 큰수여야 합니다");
				continue;
			}
			break;
		}
		int gop=1;
		for(int i=start;i<=end;i++)
		{
			gop*=1;
		}
		System.out.println(start+"부터 "+end+"까지의 합:"+gop);
		
		
		
	}

}
