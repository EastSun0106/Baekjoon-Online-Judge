package baekjoon;

import java.io.*;

public class Example14490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[2];
		str = br.readLine().split(":");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int gcdNum = gcd(n, m);
		n = n/gcdNum;
		m = m/gcdNum;
		
		System.out.println(n+":"+m);
	}
	public static int gcd(int N, int M) {
		int n = Math.max(N, M);
		int m = Math.min(N, M);
		int r = 0;
		while(m>0) {
			r = n%m;
			n = m;
			m = r;
		}
		return n;
	}
}
