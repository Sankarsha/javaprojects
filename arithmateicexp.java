package demo.java;

public class arithmateicexp {
		public static void main(String [] args) {
			try {
				int num1=20, num2=0;
				int output=num1/num2;
				System.out.println("result:"+output);
			}
			catch(ArithmeticException e) {
				System.out.println("number cannot divide by zero");
			}
		}

	}
