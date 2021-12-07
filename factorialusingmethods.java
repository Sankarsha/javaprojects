package demo.java;
import java.util.Scanner;
public class factorialusingmethods {
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);//create a scanner object
	System.out.println("Enter a number for find factorial");
	int num=scan.nextInt();//get input from user 
	
	System.out.print("Factorial of the "+num+"is "+factorial(num));
	}

	static int factorial(int num)
	{
	int i,fact=1;
	for(i=1; i<=num; i++){
	fact=fact*i;//calculate the factorial using for loop

	}
	return fact;

	}
	}

