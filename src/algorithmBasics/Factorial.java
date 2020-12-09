package algorithmBasics;
//팩토리얼 구현
public class Factorial {
	public static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}

	public static void main(String[] args) {
		System.out.println("3의 팩토리얼은:"+ factorial(3));

	}

}
