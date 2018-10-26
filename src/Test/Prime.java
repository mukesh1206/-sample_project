package Test;

import java.util.Scanner;

public class Prime {
	int n=13;
	void printPrime() {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println("no. is prime");
			}
		}
	}
	public static void main(String args[]) {
		//Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		Prime obj=new Prime();
		obj.printPrime();
	}

}
