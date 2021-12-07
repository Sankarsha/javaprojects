package demo.java;

public class Power {
	 public static void main(String[] args) {

		  int basenumber = 2, exponent = 6;
		  long temp = 1;

		  while (exponent != 0) {
		   temp *= basenumber;
		   --exponent;
		  }

		  System.out.println("Result: " + temp);
		 }
		}



//3.calculate power of a number
