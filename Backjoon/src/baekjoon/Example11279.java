package baekjoon;

import java.io.*;
import java.util.*;

public class Example11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>(N, Collections.reverseOrder());
		
		for(int i=1; i<=N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(queue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}
			} else {
				queue.offer(x);
			}
		}
		System.out.println(sb);
	}

}
