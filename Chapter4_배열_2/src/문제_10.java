import java.util.Arrays;

//정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//입력예) 5 3 9 6 8 4 2 8 10 1 출력예) 9 8 1

public class 문제_10 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		for(int i:arr)
			System.out.print(i+" ");
			System.out.println();
			System.out.print(arr[2]+" "+arr[4]+" "+arr[9]);*/
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("세번째 숫자:"+arr[2]);
		System.out.println("다섯번째 숫자:"+arr[2]);
		System.out.println("마지막 숫자:"+arr[arr.length-1]);
		
		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
	}

}
