package baekjoon;

import java.io.*;

public class Example2156_포도주시식 {
	static int juice[];
	static int sumJuice[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		juice = new int[10001];
		sumJuice = new int[3][10001]; // 0번째 : 1칸점프, 1번째 : 2칸점프, 2번째 : 3칸점프
		
		for(int i=0; i<n; i++) {
			juice[i] = Integer.parseInt(br.readLine());
		}
		sumJuice[0][0] = juice[0];
		sumJuice[0][1] = juice[0] + juice[1];
		sumJuice[0][2] = juice[1] + juice[2];
		sumJuice[1][1] = juice[1];
		sumJuice[2][2] = juice[2];
		sumJuice[1][2] = juice[0] + juice[2];
		
		for(int i=3; i<n; i++) {
			sumJuice[0][i] = juice[i] + Math.max(sumJuice[1][i-1], sumJuice[2][i-1]);
			sumJuice[1][i] = juice[i] + Math.max(Math.max(sumJuice[0][i-2], sumJuice[2][i-2]), sumJuice[1][i-2]);
			sumJuice[2][i] = juice[i] + Math.max(Math.max(sumJuice[0][i-3], sumJuice[1][i-3]), sumJuice[2][i-3]);
		}
		int result0 = Math.max(Math.max(sumJuice[0][n-1], sumJuice[1][n-1]), sumJuice[2][n-1]);
		if(n==1) {
			System.out.println(result0);
			return;
		}
		int result1 = Math.max(Math.max(sumJuice[0][n-2], sumJuice[1][n-2]), sumJuice[2][n-2]);
		System.out.println(Math.max(result1, result0));
	}

}
