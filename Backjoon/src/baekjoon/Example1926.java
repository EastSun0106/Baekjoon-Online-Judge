package baekjoon;

import java.util.*;
import java.io.*;
public class Example1926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		//int[][] arr = new int[6][5];
		int[][] visit = new int[6][5];
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int arr[][] = {{1, 1, 0, 1, 1},
			{0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0},
			{1, 0, 1, 1, 1},
			{0, 0, 1, 1 ,1},
			{0, 0, 1, 1, 1}
		};
		
		Queue<Integer> queue = new LinkedList<Integer>();
	}

}
