package baekjoon;

import java.io.*;

public class Example14888_연산자끼워넣기 {
	static int N;
	static int[] number;
	static int[] operator;
	static int[] remainOperator;
	static int min = 1000000000;
	static int max = -1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		number = new int[N];
		operator = new int[N-1];
		remainOperator = new int[4];
		
		String[] str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			number[i] = Integer.parseInt(str[i]);
		}
		
		str = br.readLine().split(" ");
		for(int i=0; i<4; i++) {
			remainOperator[i] = Integer.parseInt(str[i]);
		}
		bruteForce(0);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void bruteForce(int num) {
		if(num < N-1) {
			for(int i=0; i<4; i++) {
				if(remainOperator[i] <= 0) {
					continue;
				}
				operator[num] = i;
				remainOperator[i]--;
				bruteForce(num+1);
				remainOperator[i]++;
			}
		} else {
			cal();
		}
	}
	public static void cal() {
		int result = number[0];
		for(int i=0; i<N-1; i++) {
			if(operator[i] == 0) { // 덧셈
				result += number[i+1];
			} else if(operator[i] == 1) { // 뺄셈
				result -= number[i+1];
			} else if(operator[i] == 2) { // 곱셈
				result *= number[i+1];
			} else if(operator[i] == 3) { // 나눗셈
				result /= number[i+1];
			}
		}
		min = Math.min(min, result);
		max = Math.max(max, result);
	}
}
