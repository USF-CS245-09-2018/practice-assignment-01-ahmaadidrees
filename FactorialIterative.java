//package Factorial.java;
public class FactorialIterative implements Factorial{
    public int factorial(int n){
        int answer = 1;
        for(int i=1;i<=n;i++){
            answer *=i;
        }
        return answer;
    }
}