package Test;

public class Fibonacci {
	int a=0;
	int b=1;
	int res;
	int n=10;
	void printFibonacci() {
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n;i++) {
			res=a+b;
			a=b;
			b=res;
			System.out.println(res);
		}
		
	}
	public static void main(String args[]) {
		Fibonacci fb=new Fibonacci();
		fb.printFibonacci();
	}

}
