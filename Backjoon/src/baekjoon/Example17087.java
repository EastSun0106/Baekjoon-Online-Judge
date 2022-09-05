package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Example17087 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int S = scan.nextInt();
		int[] arr = new int[N];
		int tmp = 0;
		
		for(int i=0; i<N; i++) {
			tmp = scan.nextInt();
			arr[i] = Math.abs(S - tmp);
		}
		
		Arrays.sort(arr);
		int result = gcd(arr[0], arr[N-1]);
		System.out.println(result);
	}
	public static int gcd(int a, int b) {
		int r = 0;
		while(b>0) {
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
