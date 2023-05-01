import java.util.Arrays;

/*
 * 
 *  
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		for(int i:arr)
		{
			i=100;
			System.out.println("i="+i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
