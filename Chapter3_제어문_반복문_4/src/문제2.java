
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
	}

}
