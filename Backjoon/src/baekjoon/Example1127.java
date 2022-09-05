package baekjoon;

import java.io.*;

public class Example1127 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-65]++;
		}
		int max = -1;
		char ch = '?';
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i+65);
			} else if(max == arr[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
