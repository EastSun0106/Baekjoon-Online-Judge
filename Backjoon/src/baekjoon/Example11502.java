package baekjoon;

import java.io.*;
import java.util.*;

public class Example11502 {
	public static boolean[] primeNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int K = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		primeNum = new boolean[1000];
		
		setPrimeNum(999);
		for(int i=0; i<1000; i++) {
			if(primeNum[i] == false)
				list.add(i);
		}
		
		while(T != 0) {
			K = Integer.parseInt(br.readLine());
			if(K < 7 || K >= 1000 || K%2 == 0)
				break;
			boolean flag = false;
			
			for(int i=0; i<list.size(); i++) {
				if(flag) break;
				for(int j=0; j<list.size(); j++) {
					if(flag) break;
					for(int k=0; k<list.size(); k++) {
						if( K == (list.get(i) + list.get(j) + list.get(k))) {
							sb.append(list.get(i)).append(" ")
							.append(list.get(j)).append(" ")
							.append(list.get(k)).append("\n");
							flag = true;
							break;
						}
					}
				}
			}
			if(!flag)
				sb.append("0").append("\n");
			T--;
		}
		System.out.println(sb);
	}
	public static void setPrimeNum(int n) {
		primeNum[0] = primeNum[1] = true;
		for(int i=2; i<=Math.sqrt(n)+1; i++) {
			if(primeNum[i] == true)
				continue;
			for(int j=i*i; j<=n; j+=i) {
				primeNum[j] = true;
			}
		}
	}
}
