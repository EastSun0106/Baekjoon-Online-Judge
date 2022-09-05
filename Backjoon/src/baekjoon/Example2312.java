package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2312 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int num, cnt, size;
		while(n != 0) {
			num = Integer.parseInt(br.readLine());
			if(num < 2 || num > 100000)
				break;
			size = num;
			for(int i=2; i<=size; i++) {
				cnt = 0;
				while(num % i == 0) {
					num /= i;
					cnt++;
				}
				if(cnt != 0)
					sb.append(i).append(" ").append(cnt).append("\n");
			}
			n--;
		}
		System.out.println(sb);
	}

}
