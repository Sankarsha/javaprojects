package demo.java;

	import java.util.Arrays;
	import java.util.Scanner;

	public class indexout {
		public static void main(String args[]) {
			int[] arr= {2,4,6,8,10,12,14};
			System.out.println("Elemets in the array are:");
			System.out.println(Arrays.toString(arr));
			Scanner sc=new Scanner(System.in);
			System.out.println("enter index of required element:");
			try {
				int element=sc.nextInt();
				System.out.println("element in the given index is:"+arr[element]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("the index is invalid,\n enter an index between 0 and 6");
				
			}
			
		}

	}

