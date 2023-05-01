
public class 문제1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("정수의 합: "+sum);
	}

}
