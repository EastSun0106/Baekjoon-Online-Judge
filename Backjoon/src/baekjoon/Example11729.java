package baekjoon;

import java.util.*;

public class Example11729 {
	static int n, cnt = 0;
	static StringBuilder sb = new StringBuilder();
	
	static void hanoi(int n, int start, int mid, int end) {
		cnt++;
		
		if(n == 1) {
			sb.append(start +" "+ end +"\n");
			return;
		}else {
			hanoi(n-1, start, end, mid); // 1 3 2
			sb.append(start +" "+ end +"\n");
			hanoi(n-1, mid, start, end); // 2 1 3
		}
	}
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		hanoi(n, 1, 2, 3);
		
		System.out.println(cnt);
		System.out.println(sb);
	}
}
