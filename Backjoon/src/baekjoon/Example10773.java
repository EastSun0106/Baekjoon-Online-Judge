package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		if(K<1 || K>1000000)
			return;
		
		while(K>0) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stk.pop();
			}else {
				stk.push(num);
			}
			K--;
		}
		while(!stk.isEmpty()) {
			sum += stk.pop();
		}
		System.out.println(sum);
	}

}
