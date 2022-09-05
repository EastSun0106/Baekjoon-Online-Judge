package baekjoon;

import java.awt.Point;
import java.util.*;
import java.io.*;

public class Samsung_해수면 {
	public static int N;
	public static int max;
	public static int[][] board;
	public static int[][] tempBoard;
	public static boolean[][] visited;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	static StringBuilder sb = new StringBuilder();
	static int tcNum = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	// TC 개수
		
		while(T>0) {
			tcNum++;
			N = Integer.parseInt(br.readLine());	// 변의 길이
			max = 0;
			board = new int[N][N];
			tempBoard = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String[] str = br.readLine().split(" ");
				for(int j=0; j<N; j++) {
					board[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			for(int i=0; i<=100; i++) {
				initBoard();
				if(bfs(i) == 0)
					break;
			}
			sb.append("#").append(tcNum).append(" ").append(max).append("\n");
			T--;
			//end of while
		}
		System.out.print(sb);
	}
	public static int bfs(int height) {
		int safetyPlace = 0;
		Queue<Point> queue = new LinkedList<Point>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(tempBoard[i][j] > height && tempBoard[i][j] != 0) {
					queue.offer(new Point(i, j));
					visited[i][j] = true;
					safetyPlace++;
					
					while(!queue.isEmpty()) {
						Point curP = queue.poll();
						
						for(int k=0; k<4; k++) {
							tempBoard[curP.x][curP.y] = 0;
							int nextX = curP.x + dx[k];
							int nextY = curP.y + dy[k];
							if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N &&
									tempBoard[nextX][nextY] > height && visited[nextX][nextY] == false) {
								visited[nextX][nextY] = true;
								tempBoard[nextY][nextY] = 0;
								
								queue.offer(new Point(nextX, nextY));
							}
						}
					}
				}
			}
		}
		max = Math.max(max, safetyPlace);
		return safetyPlace;
	}
	
	public static void initBoard() {
		visited = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				tempBoard[i][j] = board[i][j];
			}
		}
	}
}
