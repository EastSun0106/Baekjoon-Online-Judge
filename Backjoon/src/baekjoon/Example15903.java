package baekjoon;

import java.util.*;
import java.io.*;

public class Example15903 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Long> queue = new PriorityQueue<>();
		String[] str = new String[2];
		str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		str = new String[n];
		str = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			queue.offer(Long.parseLong(str[i]));
		}
		long sum = 0;
		
		for(int i=1; i<=m; i++) {
			sum = queue.poll() + queue.poll();
			queue.offer(sum);
			queue.offer(sum);
		}
		sum = 0;
		while(!queue.isEmpty()) {
			sum += queue.poll();
		}
		System.out.println(sum);
	}

}
