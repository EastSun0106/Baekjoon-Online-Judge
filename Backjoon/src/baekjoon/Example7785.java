package baekjoon;

import java.io.*;
import java.util.*;

public class Example7785 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		String str[] = new String[2];
		
		for(int i=0; i<n; i++) {
			str = br.readLine().split(" ");
			if(str[1].equals("enter")) {
				set.add(str[0]);
			} else if(str[1].equals("leave")) {
				if(set.contains(str[0])) {
					set.remove(str[0]);
				}
			}
		}
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			list.add(iter.next());
		}
		Collections.sort(list, Collections.reverseOrder());
		for(String name : list) {
			sb.append(name).append("\n");
		}
		System.out.println(sb);
	}

}
