package demo.java;

public class Createexp {

public static void main(String args[])
{



int num=-10;
try{
if(num<0)
{
throw new number("The number is negative exception");
}
}
catch(number n)
{

System.out.println(n);
}
}
}
class number extends Exception
{

public number(String message) {
super(message);



}
}
