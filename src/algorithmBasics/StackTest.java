package algorithmBasics;
//스택을 이용한 n값을 받아 1부터 n까지 합 구하기
public class StackTest {

	public static void main(String[] args) {
		MySum1 mysum1 = new MySum1();
		System.out.println(mysum1.sum(10000));
		
		MySum2 mysum2 = new MySum2();
		System.out.println(mysum2.sum(10000));

	}

}
//1부터 n까지 재귀함수 호출의 합
class MySum1{
	int sum(int n) {
		if(n<2)
			return n;
		return n +sum(n-1);
	}
}
//1부터 n까지 반복을 사용한 합
class MySum2{
	int sumResult =0;
	int sum(int n) {
		while(n>=0) {
			sumResult += n--;
		}
		return sumResult;
	}
}
