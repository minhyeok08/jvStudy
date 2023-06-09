// do~while => 후조건 무조건 1번 수행가능하다
/*
 * 	1. 초기화
 * 	2. 게임
 * 	3. 형식)
 * 		초기값 (1)
 * 		do
 * 		{
 * 			반복 실행문장 (2)
 * 			증감식 (3)
 * 		}while(조건식); => 증가된 변수로 조건 검색
 * 			
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
			// i=2가 된 상태에서 while 조건 검색
			// i=11(종료)
		}while(i<=10);
		System.out.println("\n================");
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan=scan.nextInt();
		i=1;
		do
		{
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
			i++;
		}while(i<=9);
		System.out.println("====================");
		i=10;
		System.out.println("===== for문 =====");
		for(i=10;i<10;i++)
		{
			System.out.println("i="+i);
		}
		i=10;
		System.out.println("===== while문 =====");
		while(i<10)
		{
			System.out.println("i="+i);
			i++;
		}
		System.out.println("===== do~while문 ======");
		i=10;
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<10);
	}

}
