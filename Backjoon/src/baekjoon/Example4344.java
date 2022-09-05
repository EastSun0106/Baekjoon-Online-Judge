package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		for(int i=1; i<=C; i++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			float[] arr = new float[N];
			float sum = 0;
			for(int j=0; j<N; j++) {
				arr[j] = Long.parseLong(str[j+1]);
				sum += arr[j];
			}
			float avg = sum/N;
			float cnt = 0;
			for(int j=0; j<N; j++) {
				if(arr[j] > avg)
					cnt++;
			}
			sb.append(String.format("%.3f", (cnt/N*100))).append("%").append("\n");
		}
		System.out.print(sb);
	}

}
