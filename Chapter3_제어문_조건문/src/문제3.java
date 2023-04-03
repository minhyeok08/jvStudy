import java.util.Scanner;

/*
 * 문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!

 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("학년, 점수 입력(4 30):");
		int num = scan.nextInt();
		int score = scan.nextInt();
		
		/*if(num==4)
			if(score>=70)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");
		if(num>=1 && num<=3)
			if(score>=60)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");*/
		if(score<0 || score>100)
			System.out.println("잘못된 입력입니다");
		else
		{
			if(num==4)
			{
				if(score>=70)
					System.out.println("합격");
				else
					System.out.println("불합격");			
			}
			else
			{
				if(score>=60)
					System.out.println("합격");
				else
					System.out.println("불합격");
			}
		}
		
	}

}
