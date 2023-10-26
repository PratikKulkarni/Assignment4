package neebalgurukul.day4;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no. of elements in the array: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Please enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<(n/2);i++) {
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		System.out.println("The array elements in reverse order are as follows");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
