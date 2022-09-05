package baekjoon;

import java.io.*;
import java.util.*;

public class Example1124 {
	public static boolean arr[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		
		List<Integer> list = new ArrayList<Integer>();
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int cnt = 0;
		final int size = 100000;
		arr = new boolean[size+1];
		setPrimeNum(size);
		
		for(int i=0; i<=size; i++) {
			if(arr[i] == false)
				list.add(i);
		}
		for(int i=A; i<=B; i++) {
			if(list.contains(func(i)))
				cnt++;
		}
		sb.append(cnt);
		System.out.println(sb);
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
	public static int func(int n) {
		int size = n/2+1;
		int result = 0;
		for(int i=2; i<=size; i++) {
			while(n % i == 0) {
				n /= i;
				result++;
			}
		}
		return result;
	}
}
