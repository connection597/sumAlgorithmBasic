package algorithmBasics;
//배열의 합 구하기
public class RecurisonSumTest {

	public static void main(String[] args) {
		int [] date = {5,6,89,56,23,98};
		int a =sum(6, date);
		System.out.println(a);
	}
	public static int sum(int n, int[]date) {
		if(n<=0) {
			return 0;
		}else {
			return sum(n-1,date) +date[n-1];
		}
	}

}
