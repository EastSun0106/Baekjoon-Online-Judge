package baekjoon;

import java.io.*;

public class Example017074_정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());	// 배열 크기 
		int[] arr = new int[N];
		int[] dp = new int[N];
		int result = 0;
		String[] str = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dp[0] = arr[2] - arr[0];
		dp[N-1] = arr[N-1];
		dp[N-2] = arr[N-2];
		for(int i=1; i<N-2; i++) {
			dp[i] = arr[i+1] - arr[i-1];
		}
		
		int unorderCnt = 0;
		for(int i=0; i<N-1; i++) {
			if(arr[i+1] < arr[i]) {
				unorderCnt++;
			}
		}
		
		if(unorderCnt == 0) {
			System.out.println(N);
			return;
		} else if(unorderCnt >= 2) {
			System.out.println(0);
			return;
		} else {
			
		}
	}

}
