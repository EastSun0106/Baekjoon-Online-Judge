package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Example2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if(N<0 || N>500000)
			return;
		int tmp = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			queue.add(i+1);
		}
		while(queue.size()>1) {
			queue.poll();
			tmp = queue.poll();
			queue.add(tmp);
		}
		sb.append(queue.peek());
		System.out.println(sb); 
		
	}
}
