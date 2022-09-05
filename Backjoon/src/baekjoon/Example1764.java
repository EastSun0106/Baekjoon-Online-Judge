package baekjoon;

import java.io.*;
import java.util.*;

public class Example1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		String[] str = new String[2];
		str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		for(int i=1; i<=N; i++) {
			set1.add(br.readLine());
		}
		for(int i=1; i<=M; i++) {
			String tmp = br.readLine();
			if(set1.contains(tmp))
				list.add(tmp);
		}
		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for(String a : list) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}
