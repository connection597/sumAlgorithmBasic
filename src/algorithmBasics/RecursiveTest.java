package algorithmBasics;
//1~100까지 합
//재귀 합수를 이용한 계산
public class RecursiveTest {
	public static int recursive(int sum) {
		if(sum ==0)
			return 0;
		else
			return sum + recursive(sum -1);
	}

	public static void main(String[] args) {
		System.out.println("1부터 100까지 합은"+ recursive(100));

	}

}
