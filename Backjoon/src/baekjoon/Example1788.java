package baekjoon;

import java.io.*;

public class Example1788 {
	public static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==0)
			sb.append(0).append("\n");
		else if(n<0 && Math.abs(n)%2 == 0)
			sb.append(-1).append("\n");
		else
			sb.append(1).append("\n");
		
		n = Math.abs(n);
		arr = new long[n+1];
		
		sb.append(fibo(n)).append("\n");
		System.out.println(sb);
	}
	public static long fibo(int n) {
		long div = 1_000_000_000;
		if(n <= 1)
			return n;
		else if(arr[n]!=0)
			return arr[n];
		else
			return ((fibo(n-1)%div) + (fibo(n-2)%div))%div;
	}
}
