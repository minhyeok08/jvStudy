//문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
//       작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
//        나머지는 F)
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력(80 60 90):");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int total = num1 + num2 + num3;
		double avg = total / 3.0;
		char score = 'F' ;
		
		if(avg>=90 && avg<=100)
			score = 'A';
		if(avg>=80 && avg<90)
			score = 'B';
		if(avg>=70 && avg<80)
			score = 'C';
		if(avg>=60 && avg<70)
			score = 'D';
		
		System.out.printf("총점:%d, 평균:%.2f, 학점:%c",total,avg,score);
		
		
		
			
			
	}

}
