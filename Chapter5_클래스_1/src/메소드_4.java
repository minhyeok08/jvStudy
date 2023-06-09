import java.util.Arrays;

/*
 * 		리턴형	매개변수
 *  1 	 O		  O
 *  2 	 O		  X
 *  3 	 X		  O
 *  4 	 X		  X
 * 	-------------
 * 1) 2단 ~ 9단까지 구구단을 출력 (4)
 * 	  static void gugudan()
 * 	  {
 * 	  }
 * 2) id, pwd를 받아서 로그인이면 true, 로그인이 아니면 false (1)
 * 	  static boolean isLogin(String id, String pwd)
 * 3) 검색어를 입력받아서 검색된 노래명들을 출력 (3)
 * 	  static void find(String fd)
 * 	  => 검색어를 입력받아서 검색된 노래명들을 받아서 출력
 * 							------(여러개)
 *	  static String[] find(String fd)
 * 4) 5개의 정수를 넘겨주고 정렬된 정수를 받는다
 * 	  static int[] sort(int a, int b, int c, int d, int e)
 * 	  static int[] sort(int[] arr)
 * 	  결과값이 여러개일 경우에는 배열을 이용한다
 * 		
 */
// 6개의 난수를 발생해서 = 전송을 받은 다음 => 총합, 평균
public class 메소드_4 {
	// 6개 난수 발생
	static int[] rand()
	{
		int[] arr = new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	// 최대값, 최소값
	static int max(int[] arr)
	{
		int m = arr[0];
		for(int a:arr)
		{
			if(m<a)
				m=a;
		}
		return m;
	}
	static int min(int[] arr)
	{
		int n = arr[0];
		for(int a:arr)
		{
			if(n>a)
				n=a;
		}
		return n;
	}
	static void process()
	{
		int[] arr = rand(); // 얕은 복사 메모리 그대로 사용
		int total = 0;
		for(int a:arr)
		{
			total+=a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",total/(double)arr.length);
		System.out.println("최대값:"+max(arr));
		System.out.println("최소값:"+min(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
