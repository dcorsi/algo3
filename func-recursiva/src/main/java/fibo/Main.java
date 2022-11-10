package fibo;

public class Main {

	public static void main(String[] args) {
        int fibonacciNumber = getFibonacciNumberAt(6);
        System.out.println(fibonacciNumber);
    }

    public static int getFibonacciNumberAt(int n) {
        if (n < 2)
            return n;
        else
            return getFibonacciNumberAt(n - 1) + getFibonacciNumberAt(n - 2);
    }

}
