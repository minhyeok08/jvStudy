
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=10; i<=99; i++)
		{
			if(i%11==0)
				System.out.print(i+" ");
		}*/
		for(int i=10;i<=99;i++)
		{
			int a=i/10;
			int b=i%10;
			if(a==b)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
