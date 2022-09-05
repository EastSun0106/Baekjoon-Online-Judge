package baekjoon;

import java.io.*;

public class Example2579_계단오르기 {
	static int[] stair;
	static int[][] stairSum;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		stair = new int[301];			// 0이 첫 번째 계단
		stairSum = new int[2][301];	// stairSum[0][n] : 1칸 점프 , [1][n] : 2칸 점프
		
		for(int i=0; i<N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		stairSum[0][0] = stair[0];
		stairSum[1][1] = stair[1];
		stairSum[0][1] = stair[0] + stair[1];
		for(int i=2; i<N; i++) {
			stairSum[0][i] = stair[i] + stairSum[1][i-1];
			stairSum[1][i] = stair[i] + Math.max(stairSum[0][i-2], stairSum[1][i-2]);
		}
		int max = Math.max(stairSum[0][N-1], stairSum[1][N-1]);
		System.out.println(max);
	}
}
