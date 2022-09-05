package baekjoon;

import java.io.*;

public class Example11047_동전0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] str = new String[2];
		str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);	// 동전 종류 개수
		int K = Integer.parseInt(str[1]);	// 금액
		int cnt = 0;
		int coin = 0;
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(K != 0) {
			coin = arr[N-1];
			if(K >= coin) {
				K -= coin;
				cnt++;
			} else {
				N--;
			}
		}
		System.out.println(cnt);
	}

}
