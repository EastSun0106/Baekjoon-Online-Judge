package baekjoon;

import java.io.*;

public class Example1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int E = Integer.parseInt(str[0]);
		int S = Integer.parseInt(str[1]);
		int M = Integer.parseInt(str[2]);
		
		if(E>15 || S>28 || M>19)
			return;
		int year = 1;
		while(true) {
			if((year-E)%15==0 && (year-S)%28==0 && (year-M)%19==0) {
				System.out.println(year);
				break;
			}
			year++;
		}
	}

}
