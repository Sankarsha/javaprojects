package demo.java;

public class Recurrsionfactorial {


    public static void main(String[] args) {
        int num = 4;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

//7.implement factorial of a number using recursion