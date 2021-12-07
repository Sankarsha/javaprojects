package demo.java;
import java.util.Scanner;
public class avgarray {
	public static void main(String[] args)
	{
	int n,sum = 0;
	float avg;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter number of elements in array : ");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter all the elements : ");
	for(int i = 0; i < n ; i++)
	{
	a[i] = s.nextInt();
	sum = sum + a[i];
	}



	System.out.print("Sum of the array elements is : " +sum+"\n");
	avg = (float)sum / n;
	System.out.print("Average of the array elements is : " +avg);
	}
	}