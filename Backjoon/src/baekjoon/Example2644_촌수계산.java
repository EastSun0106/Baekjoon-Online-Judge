package baekjoon;

import java.io.*;

public class Example2644_촌수계산 {
	static int n;	// 전체 사람의 수
	static int m;	// 관계의 수
	static int target1;	// 사람1
	static int target2;	// 사람2
	static int [][] relation;	// 관계
	static boolean[] visited;	// 방문여부
	static int result = -1;	// 촌수
	static int cnt = 1;
	static int start;
	static int end;
	static int minCnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		target1 = Integer.parseInt(str[0]);
		target2 = Integer.parseInt(str[1]);
		m = Integer.parseInt(br.readLine());
		relation  = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<=m; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			relation[x][y] = relation[y][x] = 1;
		}
		
		start = Math.min(target1, target2);	// 탐색 시작 정점
		end = Math.max(target1, target2);	// 탐색 종료 정점
		dfs(start, cnt);
		
		System.out.print(result);
	}
	
	public static void dfs(int start, int cnt) {
		visited[start] = true;
		for(int i=1; i<=n; i++) {
			if(relation[start][i] == 1 && visited[i] == false) {
				if(i == end) {
					result = cnt;
					return;
				}
				dfs(i, cnt+1);
			}
		}
	}
}
