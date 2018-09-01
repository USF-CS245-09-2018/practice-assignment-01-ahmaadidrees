//package Fiboacci.java;
public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int current = 1;
		int prev = 1;

		for (int i = 2; i < n; i++) {
			int temp = current;
			current += prev;
			prev = temp;
		}
		return current;
	}
}