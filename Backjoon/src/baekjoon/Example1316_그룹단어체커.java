package baekjoon;

import java.io.*;

public class Example1316_그룹단어체커 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		boolean[] arr = new boolean[26]; // arr[0] = a
		
		for(int i=1; i<=N; i++) {
			boolean flag = false;
			arr = new boolean[26];
			String str = br.readLine();
			arr[str.charAt(0)-97] = true;
			
			for(int j=1; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(str.charAt(j) != str.charAt(j-1) && arr[ch-97]) {
					flag = true;
					break;
				} else {
					arr[ch-97] = true;
				}
			}
			
			if(flag == false)
				cnt++;
		}
		System.out.println(cnt);
	}

}
