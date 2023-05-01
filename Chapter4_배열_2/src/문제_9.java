// 문자 10개를 저장할 수 있는 배열을 선언하고 
//10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 

public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (char)((Math.random()*26)+65);
		}
		for(char c:arr)
		{
			System.out.print(c);
		}
	}
}
