package baekjoon;

import java.io.*;
import java.util.*;

public class Example1260_DFS와BFS {
	static int N;	// 정점 개수
	static int M;	// 간선 개수
	static int V;	// 탐색 시작 번호
	static int[][] edge;
	static boolean[] checked;
	static StringBuilder sb;
	static StringBuilder sb2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String[] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);	// 정점 개수
		M = Integer.parseInt(str[1]);	// 간선 개수
		V = Integer.parseInt(str[2]);	// 탐색 시작 정점 번호
		
		edge = new int[1001][1001];		// 간선의 연결정보
		checked = new boolean[1001];	// 정점 방문 여부
		
		for(int i=0; i<M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			edge[x][y] = edge[y][x] = 1;
		}
		dfs(V);
		System.out.println("dfs:" + sb);
		
		sb2 = new StringBuilder();
		checked = new boolean[1001];
		
		bfs();
		System.out.println("bfs:" + sb2);
	}
	
	public static void dfs(int V) {
		checked[V] = true;
		sb.append(V).append(" ");
		
		for(int i=1; i<=N; i++) {
			if(edge[V][i] == 1 && checked[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		checked[V] = true;
		sb2.append(V).append(" ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i=1; i<=N; i++) {
				if(edge[temp][i] == 1 && checked[i] == false) {
					queue.offer(i);
					checked[i] = true;
					sb2.append(i).append(" ");
				}
			}
		}
	}
}
