package baekjoon;

import java.io.*;

public class ShowMeTheCode2A {
	static int N;	// 마을, 몬스터 개수
	static int K;	// 초기체력
	static int[] A;	// A[N] : N번째 마을의 공격력
	static int[] P; // A[N] : N번째 마을의 주민 수
	static int saveCnt = 0;
	static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		A = new int[N+1];
		P = new int[N+1];
		
		str = br.readLine().split(" ");
		for(int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		str = br.readLine().split(" ");
		for(int i=1; i<=N; i++) {
			P[i] = Integer.parseInt(str[i]);
		}
	}

	public static void burteForce() {
		for(int i=1; i<=N; i++) {
			
		}
	}
}
