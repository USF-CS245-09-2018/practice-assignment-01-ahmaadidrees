//package Factorial.java;
public class FactorialRecursive implements Factorial{
	public int factorial(int n){
		if(n<=2){
			return n;
		}
		return n * factorial(n-1);
	}
}