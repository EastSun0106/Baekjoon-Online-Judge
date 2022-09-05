package baekjoon;

import java.util.Scanner;

public class Example2839 {
	public static int result = 0;
	public static int cnt = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		if(N < 3 || N > 5000)
			return;
		
		System.out.println(dp(N));
	}
	public static int dp(int N) {
		if(N % 5 == 0) {
			result = N/5 + cnt;
		}else if(N < 0) {
			result = -1;
			return result;
		}else {
			N-=3;
			cnt++;
			dp(N);
		}
		return result;
	}
}
