package baekjoon;

import java.io.*;
import java.util.*;

public class Example2178_미로탐색 {
	public static int N;
	public static int M;
	public static int[][] board;
	public static boolean[][] visited;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		board = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for(int i=1; i<=N; i++) {
			String temp = br.readLine();
			for(int j=1; j<=M; j++) {
				board[i][j] = temp.charAt(j-1) - '0';
			}
		}
		//bfs(1, 1);
		//System.out.println(board[N][M]);
		
		dfs(1, 1, 1);
		System.out.println(result);
	}
	public static void bfs(int x, int y) {
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();
		queueX.offer(x);
		queueY.offer(y);
		
		while(!queueX.isEmpty() || !queueY.isEmpty()) {
			visited[x][y] = true;
			int curX = queueX.poll();
			int curY = queueY.poll();
			
			for(int i=1; i<=4; i++) {
					int nextX = curX + dx[i-1];
					int nextY = curY + dy[i-1];
					if(nextX < 1 || nextY < 1 || nextX > N || nextY > M)
						continue;
					if(board[nextX][nextY] == 0 || visited[nextX][nextY] == true)
						continue;
					
					visited[nextX][nextY] = true;
					queueX.offer(nextX);
					queueY.offer(nextY);
					board[nextX][nextY] = board[curX][curY] + 1;
			}
		}
	}
	
	public static void dfs(int x, int y, int cnt) {
		visited[x][y] = true;
		int curX = x;
		int curY = y;
		int nextX = 0;
		int nextY = 0;
		for(int i=1; i<=4; i++) {
			System.out.println("i: " + i);
			nextX = curX + dx[i-1];
			nextY = curY + dy[i-1];
			if(nextX >= 1 && nextY >= 1 && nextX <= N && nextY <= M && 
					visited[nextX][nextY] == false	&& board[nextX][nextY] == 1 ) {
				visited[nextX][nextY] = true;
				System.out.println("x y : " + nextX + " " + nextY);
				dfs(nextX, nextY, cnt+1);
			}
			if(result > cnt)
				result = cnt;
		}
		visited[nextX][nextY] = false;
	}
}
