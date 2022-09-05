package baekjoon;

import java.io.*;
public class Example2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		int cnt = 0;
		while(true) {
			V -= A;
			cnt++;
			if(V <= 0) 
				break;
			V += B;
		}
		sb.append(cnt);
		System.out.println(sb);
	}

}
