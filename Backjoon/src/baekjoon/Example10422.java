package baekjoon;

import java.io.*;

public class Example10422 {
	public static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		arr = new long[5001];
		while(T != 0) {
			int L = Integer.parseInt(br.readLine());
			if(L%2 == 1) {
				L=0;
			}
			sb.append(fibo(L/2)).append("\n");
			T--;
		}
		System.out.println(sb);
	}
	public static long fibo(int L) {
		int mod = 1_000_000_007;
		if(L==0)
			return 0;
		else if(L==1)
			return 1;
		else if(L==2)
			return 2;
		else if(arr[L] != 0)
			return arr[L];
		else
			return ((fibo(L-1) % mod) + (fibo(L-2) % mod)) % mod;
	}
}
