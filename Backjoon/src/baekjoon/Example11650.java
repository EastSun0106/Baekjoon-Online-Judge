package baekjoon;

import java.io.*;

public class Example11650 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if(N<1 || N>100000)
			return;
		
		int[][] arr = new int[N][2];
		int tmpX = 0;
		int tmpY = 0;
		
        String[] str;
		for(int i=0; i<N; i++) {
            str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int j=0; j<N; j++) {
			for(int i=0; i<N-1; i++) {
				if(arr[i][0] > arr[i+1][0]) {
					tmpX = arr[i+1][0];
					tmpY = arr[i+1][1];
					arr[i+1][0] = arr[i][0];
					arr[i+1][1] = arr[i][1];
					arr[i][0] = tmpX;
					arr[i][1] = tmpY;
				}
				if(arr[i][0] == arr[i+1][0] && arr[i][1] > arr[i+1][1]) {
					tmpY = arr[i+1][1];
					arr[i+1][1] = arr[i][1];
					arr[i][1] = tmpY;
				}
			}
		}
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}