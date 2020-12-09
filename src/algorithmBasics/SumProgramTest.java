package algorithmBasics;

import java.util.Scanner;

//n숫자의 합 프로그램 
//5개 숫자 합산 프로그램
public class SumProgramTest {
	public static void main(String[] args) {
		int n,sum =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many number you want sum");
		n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the"+n+"number");
		for(int i =0; i<n; i++) {
			System.out.println("enter the"+(i+1)+"number");
			a[i]= sc.nextInt();
		}
		for(int i =0; i<n; i++ ) {
			sum +=a[i];
		}
		System.out.println("sum of"+n+"number is ="+sum);
	}

}
