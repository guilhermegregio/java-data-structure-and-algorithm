package net.gregio;

public class Fibonacci {
	public static long iteractive(int n) {
		int i = 1;
		int j = 0;
		int t;
		
		for (int k = 1; k <= n; k+=1) {
			t = i + j;
			i = j;
			j = t;
		}
		
		return j;
	}

	public static long recurcive(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		return recurcive(n-1) + recurcive(n-2);
	}
}