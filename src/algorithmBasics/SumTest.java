package algorithmBasics;
//1부터 100까지의 짝수 (2의 배수)의 합
public class SumTest {
	public static void main(String[] args) {
		//type1
		int sum =0;
		int i=0;
		for( i = 1; i<=100; i++) {
			if(i%2 ==0) {
				sum = sum +i;
			}
		}
		System.out.println(sum);
		//type1
		sum =0;
		i =1;
		while(i<=100) {
			if(i%2 ==0) sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}

}
