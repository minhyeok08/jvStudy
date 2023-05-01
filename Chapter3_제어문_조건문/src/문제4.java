//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
//       합계와 평균을 구해보자.

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력(4 5 6):");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max=num1; 
		int min=num1;
		int total = num1 + num2 + num3;
		double avg = total / 3.0;
		
		if(max<num2)
			max = num2;
		if(max<num3)
			max = num3;
		if(min>num2)
			min = num2;
		if(min>num3)
			min = num3;
			
		System.out.printf("최대값:%d, 최소값:%d\n",max,min);
		System.out.printf("합계:%d, 평균:%.2f",total,avg);
		
		
	}

}
