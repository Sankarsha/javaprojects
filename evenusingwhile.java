package demo.java;

public class evenusingwhile {
	public static void main(String[] args) {
	    int n = 100;
	    int sum=0, num=1, count=0;
	    while(count<n) {
	    	
	    	if(num%2 == 0) {
	    		sum+= num;
	    		count++;
	    		
	    	}
	    	num++;
	    }
	    System.out.print("sum: " +sum);
	}

}
