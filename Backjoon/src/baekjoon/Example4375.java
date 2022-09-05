package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long n;
		while(true) {
			n = Long.parseLong(br.readLine());
			if(n < 1 || n > 10000)
				break;
			
			long result = 3;
			long plus = 1000;
			long i = 111;
			while(true) {
				if(i%n == 0) {
					sb.append(result).append("\n");
					break;
				} else {
					i+=plus;
					plus*=10;
					result++;
				}
			}
		}
		System.out.println(sb);
	}

}
