package baekjoon;

import java.io.*;
import java.util.*;

public class Example2606_바이러스 {
	public static int N;	// 컴퓨터 대수
	public static int M;	// 간선 개수
	public static int[][] edge;	// 간선 연결 정보
	public static boolean[] visited;	// 방문 여부
	public static int result = 0;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		edge = new int[N+1][N+1];
		visited = new boolean[N+1];
		if(N > 100)
			return;
		
		for(int i=1; i<=M; i++) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			edge[x][y] = edge[y][x] = 1;
		}
		dfs(1);
		System.out.println(result);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		for(int i=1; i<=N; i++) {
			if(edge[start][i] == 1 && visited[i] == false) {
				result++;
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true;
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i=1; i<=N; i++) {
				if(edge[temp][i] == 1 && visited[i] == false) {
					visited[i] = true;
					result++;
					queue.offer(i);
				}
			}
		}
	}
}
