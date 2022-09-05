package baekjoon;

import java.io.*;

public class Example1463_1로만들기 {
	static int N;
	static int[] arrayDp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arrayDp = new int[1000001];
		arrayDp[1] = 0;
		arrayDp[2] = 1;
		arrayDp[3] = 1;
		
		for(int i=4; i<=N; i++) {
			arrayDp[i] = arrayDp[i-1] + 1;
			
			if(i%2 == 0 && arrayDp[i/2] + 1 < arrayDp[i]) {
				arrayDp[i] = arrayDp[i/2] + 1;
			} 
			if(i%3 == 0 && arrayDp[i/3] + 1 < arrayDp[i]) {
				arrayDp[i] = arrayDp[i/3] + 1;
			}
		}
		System.out.println(arrayDp[N]);
	}

}
