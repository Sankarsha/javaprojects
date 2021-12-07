package demo.java;

public class Customerexpstudent {

		public static void main(String arg[])throws Failed {
		int marks=100;
		try {
		if(marks<=200) {
		throw new Failed("the student has failed");
		}
		else {
		System.out.println("the student has passed");
		}
		}catch(Failed e) {
		System.out.println(e);
		}

		}



		}
		class Failed extends Exception{
		public Failed(String msg) {
		super(msg);
		}
		}

