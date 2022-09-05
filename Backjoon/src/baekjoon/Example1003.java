package baekjoon;

import java.util.*;
import java.io.*;

public class Example1003 {
	public static int[] arr;
	public static int[] count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T != 0) {
			int N = Integer.parseInt(br.readLine());
			arr = new int[N+1];
			count = new int[2];
			fibo(N);
			sb.append(count[0]).append(" ").append(count[1]).append("\n");
			T--;
		}
		System.out.println(sb);
	}

	public static long fibo(int n) {
		if(n==0) {
			count[0]++;
			return 0;
		} else if(n==1) {
			count[1]++;
			return 1;
		} else if(arr[n] != 0) {
			return arr[n];
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}
