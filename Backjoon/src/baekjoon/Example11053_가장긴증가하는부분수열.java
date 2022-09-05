package baekjoon;

import java.io.*;
import java.util.*;

public class Example11053_가장긴증가하는부분수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[1001];
		int[] dp = new int[1001];
		
		for(int i=1; i<n+1; i++) {
			arr[i] = Integer.parseInt(str[i-1]);
		}
		
		dp[1] = 1;
		int max = 0;
		for(int i=2; i<n+1; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(arr[i] > arr[j] && dp[i] <= dp[j])
					dp[i] = dp[j] + 1;
			}
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}

}
