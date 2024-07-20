package org.ikiseh;

class SumOfFirstFibonacciNumbers{

public int findTheSum(int n){
    if (n <= 0)
        return 0;

    int fibo[]=new int[n+1];
    fibo[0] = 0; fibo[1] = 1;

    int sum = fibo[0] + fibo[1];

    for (int i=2; i<=n; i++) {
        fibo[i] = fibo[i-1]+fibo[i-2];
        sum += fibo[i];
    }

    return sum;
}
}

public class FibonacciNumbers {

    public static void main(String args[]) {
        int num = 10;
        SumOfFirstFibonacciNumbers fiboObject = new SumOfFirstFibonacciNumbers();
        System.out.println("The sum of first " + num + " Fibonacci numbers is " + fiboObject.findTheSum(num));
    }
}