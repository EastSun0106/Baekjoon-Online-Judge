package baekjoon;

import java.io.*;
import java.util.*;

public class Example18310 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int tmp = 0;
		for(int i=0; i<N; i++) {
			tmp = Integer.parseInt(st.nextToken());
			list.add(tmp);
		}
		Collections.sort(list);
		int num = list.get((N-1)/2);
		
		System.out.println(num);
	}

}
