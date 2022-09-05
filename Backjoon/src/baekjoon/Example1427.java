package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1427 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		if(N<1 || N>1000000000)
			return;
		
		while(N>0) {
			list.add(N%10);
			N/=10;
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for(int a : list)
			System.out.print(a);
	}
}
