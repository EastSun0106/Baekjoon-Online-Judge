package baekjoon;

import java.io.*;

public class Example11726_2xn타일링1 {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] result = new int[n];
		if(n<=3) {
			System.out.println(n);
			return;
		}
		
		result[0] = 1;
		result[1] = 2;
		result[2] = 3;
		for(int i=3; i<n; i++) {
			result[i] = (result[i-1] + result[i-2])%10007;
		}
		System.out.println(result[n-1]);
	}

}
