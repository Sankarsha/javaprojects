package demo.java;

public class fibonaaciusingdowhile {
	public static void main(String[] args) {
	int a=0,b=1,c=0,n=3;
	System.out.print("the fibonacci series ");
	System.out.print(a);
	System.out.print(b);
	do {
		c=a+b;
		System.out.print(c);
		a=b;
		b=c;
		n=n+1;
	}

	while(n<=10);
}
}
