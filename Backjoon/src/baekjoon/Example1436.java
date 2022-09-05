package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int i = 1;
		String N;
		List<String> list = new ArrayList<String>();
		
		while(list.size() <= 10000) {
			N = Integer.toString(i);
			if(N.contains("666"))
				list.add(N);
			i++;
		}
		int result = Integer.parseInt(list.get(n-1));
		System.out.println(result);
	}

}
