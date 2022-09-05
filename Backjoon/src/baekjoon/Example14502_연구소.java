package baekjoon;

import java.util.*;
import java.io.*;

public class Example14502_연구소 {
	static int[][] lab;  // 연구실
	static int[][] tempLab;
	static int N;
	static int M;
	static int seq = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		lab = new int[N][M];
		tempLab = new int[N][M];
		
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				lab[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		System.out.println(bruteForce(3));
	}
	
	// 벽을 세울 수 있는 위치 체크
	public static int bruteForce(int wall) {
		int max = 0, result = 0;
		if(wall <= 0)
			return safetySpace();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(lab[i][j] != 0) {
					continue;
				}
				lab[i][j] = 1;
				result = bruteForce(wall-1);
				if(result > max) {
					max = result;
				}
				lab[i][j] = 0; // 질문
			}
		}
		return max;
	}
	
	// 안전지대 개수를 리턴하는 메소드
	public static int safetySpace() {
		int cnt = 0;	// 안전지대 개수
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				tempLab[i][j] = lab[i][j];	//공배열에 복사
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(tempLab[i][j] == 2) {
					infectVirus(i, j);
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(tempLab[i][j] == 0) {
					cnt++;
				}
			}
		}
	
		return cnt;
	}
	
	public static void infectVirus(int x, int y) {
		int[] dx = {1, -1, 0, 0}; 
		int[] dy = {0, 0, 1, -1};
		
		for(int i=0; i<dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			/*if(nx < 0 || ny < 0)
				continue;
			else if(tempLab[nx][ny] == 0) {
				tempLab[nx][ny] = 2;
				infectVirus(nx, ny);
			}*/
			if(nx >= 0 && ny >= 0 && nx < N && ny < M && tempLab[nx][ny] == 0) {
				tempLab[nx][ny] = 2;
				infectVirus(nx, ny);
			}
		}
	}
}
