package baekjoon;

import java.io.*;
import java.util.*;

public class Example1475_방번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[10];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		if(N == 1) {
			System.out.println(1);
			return;
		}
		
		while(N > 0) {
			queue.offer(N%10);
			N /= 10;
		}
		
		while(!queue.isEmpty()) {
			num[queue.poll()]++;
		}
		
		num[6] += num[9];
		num[9] = 0;
		if(num[6]%2 == 1)
			num[6] = num[6]/2 + 1;
		else
			num[6] = num[6]/2;
		
		Arrays.sort(num);
		System.out.println(num[9]);
	}

}
