package demo.java;

public class Createexp2 {



		public static void main(String args[])
		{



		String pass="samarth";
		try{
		if(pass.length()<10)
		{
		throw new string("String length is not match exception");
		}
		}
		catch(string n)
		{

		System.out.println(n);
		}
		}
		}
		class string extends Exception
		{

		public string(String message) {
		super(message);



		}
		}
