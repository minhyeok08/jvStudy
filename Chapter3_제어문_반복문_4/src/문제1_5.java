
public class 문제1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num1 = (int)((Math.random()*6)+1);
		//int num2 = (int)((Math.random()*6)+1);
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==6)
				{
					System.out.printf("[%d,%d]\n",i,j);
				}
			}
		}
		
	}

}
