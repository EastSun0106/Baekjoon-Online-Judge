package baekjoon;

import java.io.*;
import java.util.*;

public class Example1822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] str = new String[2];
		str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		str = new String[n];
		str = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			A.add(Integer.parseInt(str[i]));
		}
		
		str = new String[m];
		str = br.readLine().split(" ");
		for(int i=0; i<m; i++) {
			B.add(Integer.parseInt(str[i]));
		}
		int cnt = 0;
		for(int i=0; i<A.size(); i++) {
			if(B.contains(A.get(i)))
				continue;
			sb.append(A.get(i)).append(" ");
			cnt++;
		}
		sb.insert(0, cnt).insert(1, "\n");
		System.out.println(sb);
	}

}
