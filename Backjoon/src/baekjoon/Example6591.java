package baekjoon;

import java.io.*;
public class Example6591 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str;
		int n = 1;
		int k = 1;
		while(true) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			k = Integer.parseInt(str[1]);
			
			if(n == 0 && k == 0)
				break;
			if (k > n - k) 
				k = n - k;
			sb.append(func(n, k)).append("\n");
		}
		System.out.println(sb);
	}
	public static long func(int n, int k) {
		long result = 1;
		for(int i=1; i<=k; i++) {
			result = result * n;
			result = result / i;
			n--;
		}
		return result;
	}
}
