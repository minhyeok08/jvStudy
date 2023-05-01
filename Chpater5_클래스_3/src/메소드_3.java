import java.util.Arrays;

public class 메소드_3 {
	static int[] rand()
	{
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	static void rand2(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====리턴형으로 값채우기=====");
		
		int[] arr1 = rand(); 
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("=====매개변수로 값채우기(활용도가 더 높음)=====");
		
		int[] arr2 = new int[5];
		rand2(arr2); // 주소값을 메소드에 주고 메모리에 값 채워라
		System.out.println(Arrays.toString(arr2));
	}
	
}
