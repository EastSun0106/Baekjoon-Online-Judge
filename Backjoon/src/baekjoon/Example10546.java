package baekjoon;

import java.io.*;
import java.util.*;

public class Example10546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		N = 2*N-1;
		
		Set<String> set = new HashSet<String>();
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				set.remove(str);
			} else {
				set.add(str);
			}
		}
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
