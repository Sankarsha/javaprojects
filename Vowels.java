package demo.java;

public class Vowels {
	public static void main(String[] args)
	       
	    {
	        String str = "sankarshana";
	  
	        str = str.toLowerCase();
	        char[] chars = str.toCharArray();
	  
	        int count = 0;
	  
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	  
	        // display total count of vowels in string
	        System.out.println("Total no of vowels in string are: " + count);
	    }
	}

//4.Take 10 characters as input and count the no of vowels in it