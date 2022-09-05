package baekjoon;

import java.util.*;
import java.io.*;

public class Example11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		Collections.sort(list);
		int sum = 0;
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
			result += sum;
		}
		System.out.println(result);
	}
}
