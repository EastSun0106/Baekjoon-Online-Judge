package baekjoon;

import java.util.*;
import java.io.*;

public class Example2667_단지번호붙이기 {
	public static int N;
	public static int[][] board;
	public static boolean[][] visited;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int totalHouse = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		board = new int[N+1][N+1];
		visited = new boolean[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			for(int j=1; j<=N; j++) {
				board[i][j] = str.charAt(j-1) - '0';
			}
		}
		bfs();
		Collections.sort(list);
		
		sb.append(totalHouse).append("\n");
		
		for(int a : list) {
			sb.append(a).append("\n");
		}
		
		System.out.println(sb);
	}

	public static void bfs() {
		int cnt = 1;
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();
		// 시작점 탐색을 위한 2중 for
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(board[i][j] == 1) {
					queueX.offer(i);
					queueY.offer(j);
					cnt = 1;
					visited[i][j] = true;
					totalHouse++;
					
					while(!queueX.isEmpty() || !queueY.isEmpty()) {
						int curX = queueX.poll();
						int curY = queueY.poll();
						
						for(int k=1; k<=4; k++) {
							int nextX = curX + dx[k-1];
							int nextY = curY + dy[k-1];
							if(nextX >= 1 && nextY >= 1 && nextX <= N && nextY <= N 
									&& board[nextX][nextY] == 1 && visited[nextX][nextY] == false) {
								board[nextX][nextY] = 0;
								visited[nextX][nextY] = true;
								queueX.offer(nextX);
								queueY.offer(nextY);
								cnt++;
							}
						}
					}
				list.add(cnt);
				}
			}
		}
	}
}
