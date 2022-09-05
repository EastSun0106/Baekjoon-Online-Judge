package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Example11866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int cnt = 1;
		int tmp;
		
		if(N < K || K < 1 || N > 1000)
			return;
		
		for(int i=0; i<N; i++) {
			queue.add(i+1);
		}
		
		while(!queue.isEmpty()) {
			if(K == cnt && queue.size() == 1) {
				sb.append(queue.poll()).append(">");
			}else if(K == cnt && !queue.isEmpty()) {
				sb.append(queue.poll()).append(", ");
				cnt = 1;
			}else {
				tmp = queue.poll();
				queue.add(tmp);
				cnt++;
			}
			
		}
		System.out.println(sb);
	}

}
