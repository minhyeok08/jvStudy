//5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//입력예) 5 10 9 3 2 출력예) 5 10 9 3 2

import java.util.Scanner;
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		for(int i:arr)
			System.out.print(i+" ");*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 5개 입력:");
		int[] arr = new int[5];
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		/*arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		arr[3]=scan.nextInt();
		arr[4]=scan.nextInt();*/
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
