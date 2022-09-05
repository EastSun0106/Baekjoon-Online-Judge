package baekjoon;

import java.io.*;

public class Example2875_대회or인턴 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);
		int cnt = 0;
		
		while(N > 0 && M > 0) {
			N -= 2;
			M -= 1;
			cnt++;
		}
		if(N+M-K < 0 ) {
			cnt--;
		}
		
		System.out.println(cnt);
	}

}
