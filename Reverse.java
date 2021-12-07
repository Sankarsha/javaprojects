package demo.java;

public class Reverse {
    public static void main(String[] args) {
        
        
        String str = "Hello";
        char[] c= str.toCharArray();
        
        for(int i=c.length-1; i>=0; i--) {
            
        System.out.print(c[i]);
        }
        
    }
}
//1. reverse of string"hello"
