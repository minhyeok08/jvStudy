import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50};
		int[] arr2= new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //확장할 때 쓰는 것 -> 메모리 공간 새로생성 (기존의 것 + 빈 공간)
		//0, 1, 2...
		System.out.println(Arrays.toString(arr2));
	}

}
