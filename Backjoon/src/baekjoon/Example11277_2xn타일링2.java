package baekjoon;

import java.io.*;

public class Example11277_2xn타일링2 {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] result = new int[1001];
		
		result[0] = 1;
		result[1] = 3;
		result[2] = 5;
		if(n<=3) {
			System.out.println(result[n-1]);
			return;
		}
		for(int i=3; i<n; i++) {
			if(i%2 == 1)
				result[i] = (2*result[i-1]+1)%10007;
			else
				result[i] = (2*result[i-1]-1)%10007;
		}
		System.out.println(result[n-1]);
	}

}
