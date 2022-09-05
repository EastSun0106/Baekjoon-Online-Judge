package baekjoon;

import java.io.*;

public class Example1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = N;
		int cnt = 0;
		int ten;
		int one;
		int sum;
		
		while(true) {
			if(result == N && cnt != 0) {
				break;
			}
			one = result % 10;
			ten = result / 10;
			sum = one + ten;
			result = one * 10 + sum % 10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
