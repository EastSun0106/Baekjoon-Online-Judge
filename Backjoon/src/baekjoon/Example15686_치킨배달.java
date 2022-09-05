package baekjoon;

import java.io.*;
import java.util.*;


public class Example15686_치킨배달 {
	public static int N;					// 도시 크기
	public static int M;					// 최대 치킨집 수
	public static int[][] board;			// 도시 정보
	public static boolean[][] visited;		// 방문 여부
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		board = new int[N+1][N+1];		
		visited = new boolean[N+1][N+1];
		for(int i=1; i<=N; i++) {
			str = br.readLine().split(" ");
			for(int j=1; j<=N; j++) {
				board[i][j] = Integer.parseInt(str[j-1]);
			}
		}
	}

	// 치킨집 폐업시키기
	public static void bruteForce(int n) {
		if(n > M)
			return;
		
	}
}
