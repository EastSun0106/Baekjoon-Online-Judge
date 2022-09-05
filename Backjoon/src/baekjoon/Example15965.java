package baekjoon;

import java.io.*;
import java.util.*;

public class Example15965 {
	public static boolean[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int size = 10_000_000;
		int cnt = 0;
		arr = new boolean[size+1];
		List<Integer> list = new ArrayList<Integer>();
		setPrimeNum(size);
		
		for(int i=0; i<=size; i++) {
			if(arr[i] == false)
				list.add(i);
		}
		System.out.println(list.get(k-1));
	}
	public static void setPrimeNum(int size) {
		arr[0] = arr[1] = true;
		for(int i=2; i<=Math.sqrt(size)+1; i++) {
			if(arr[i] == true)
				continue;
			for(int j=i*i; j<=size; j+=i) {
				arr[j] = true;
			}
		}
	}
}
