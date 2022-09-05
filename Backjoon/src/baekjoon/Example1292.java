package baekjoon;

import java.io.*;
import java.util.*;

public class Example1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		List<Integer> list = new ArrayList<>();
		if(A < 1 || B > 1000 || B < A)
			return;
		
		for(int i=1; i<=B; i++) {
			for(int j=1; j<=i; j++) {
				list.add(i);
			}
		}
		int sum = 0;
		for(int i=A-1; i<B; i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}
