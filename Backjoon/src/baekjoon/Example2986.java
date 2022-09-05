package baekjoon;

import java.io.*;

public class Example2986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=N-1; i>=1; i--) {
			count++;
			if(N%i == 0)
				break;
		}
		System.out.println(count);
	}

}
