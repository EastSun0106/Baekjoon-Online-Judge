package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int tmp = 0;
		
		if(N<1 || N>1000)
			return;
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1; j++) {
				if(arr[j+1] < arr[j]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0; i<N; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}

}
