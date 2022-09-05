package baekjoon;

import java.io.*;
import java.util.*;

public class Example1260_DFS와BFS2 {
	static boolean[] visited;	// 방문여부
	static int[][] edge;	// 연결 간선
	static int N, M, V;	// N:정점의 개수, M:간선의 개수, V:탐색시작점
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		V = Integer.parseInt(str[2]);
		visited = new boolean[1001];
		edge = new int[1001][1001];
		
		for(int i=0; i<M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			edge[x][y] = edge[y][x] = 1;
		}
		
		dfs(V);
		System.out.println(sb);
		
		sb.setLength(0);
		visited = new boolean[1001];
		
		bfs();
		System.out.println(sb);
	}
	
	public static void dfs(int V) {
		visited[V] = true;
		sb.append(V).append(" ");
		for(int i=1; i<=N; i++) {
			if(edge[V][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[V] = true;
		queue.offer(V);
		while(!queue.isEmpty()) {
			int visitedPoint = queue.poll();
			sb.append(visitedPoint).append(" ");
			for(int i=1; i<=N; i++) {
				if(edge[visitedPoint][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
