//1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.

public class 문제_1 {
	/*
	 * 반복 제어문
	 * => 특정부분을 제외 반복 수행(continue)
	 * 	while : 조건식으로 이동
	 * 	for : 증감식
	 * => 반복 종료 (break)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) { //3의 배수가 아니면 i를 더해라
		        i++;
		        continue; // 정답
		    }
		    else sum += i;
		    i++;
		}

	}

}
