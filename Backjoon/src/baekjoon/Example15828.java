package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Example15828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		if(N<1 || N>100000)
			return;
		int num = 0;
		while(true) {
			num = Integer.parseInt(br.readLine());
			if(num == -1)
				break;
			if(num == 0 && queue.isEmpty() || N == 0) {
				continue;
			}
			if(num == 0) {
				queue.poll();
				N++;
			}
			else {
				queue.add(num);
				N--;
			}
			
		}
		if(queue.isEmpty())
			sb.append("empty");
		else {
			while(!queue.isEmpty()) {
				sb.append(queue.poll()).append(" ");
			}
		}
		System.out.println(sb);
	}

}
