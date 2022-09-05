package baekjoon;

import java.io.*;
import java.util.*;

public class Example14501_퇴사 {
	public static int[] T;	// 소요시간
	public static int[] P;	// 받는 금액
	public static int N;
	public static int maxPrice = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());	// 상담가능일
		T = new int[N+1];
		P = new int[N+1];
		for(int i=1; i<=N; i++) {
			String[] str = br.readLine().split(" ");
			T[i] = Integer.parseInt(str[0]);
			P[i] = Integer.parseInt(str[1]);
		}
		int curDay = 1;
		int curPrice = 0;
		
		bruteForce(curDay, curPrice);
		
		System.out.println(maxPrice);
	}
	
	public static void bruteForce(int curDay, int curPrice) {
		if(curDay > N)
			return;
		int nextPrice = curPrice + P[curDay];
		int nextDay = curDay + T[curDay];
		if(maxPrice < curPrice)
			maxPrice = curPrice;
		if(nextDay == N+1 && maxPrice < nextPrice)
			maxPrice = nextPrice;
		
		//상담X
		bruteForce(curDay+1, curPrice);
		//상담O
		bruteForce(nextDay, nextPrice);
	}
}
