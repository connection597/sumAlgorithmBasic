package algorithmBasics;

import java.util.Scanner;

//n숫자의 합 프로그램 
//5개 숫자 합산 프로그램 재귀 함수 사용한 샘플 프로그램
//재귀 합수라나 자기자신을 호출 하는 함수로 똑같은 구조의 함수로 반복해서 사용할때 필요할때 적용
public class sumTest1 {

	public static void main(String[] args) {
		int n ;
		int s=0,a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you want sum");
		n=sc.nextInt();
		a = new int[n];
		System.out.println("enter the"+n+"number");
		for(int i =0; i<n; i++) {
			System.out.println("enter number"+(i+1)+":");
			a[i] =sc.nextInt();
			s =sumTest1.sumofnum(a,n-1,s);
			System.out.println("sum is"+s);
		}
	}
		static int sumofnum(int a[], int n, int s1) {
			if(n<0)
				return s1;
			else {
				s1 += a[n];
				return sumTest1.sumofnum(a,n-1,s1);
			}	
	}

}
