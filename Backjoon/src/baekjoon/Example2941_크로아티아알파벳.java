package baekjoon;

import java.io.*;

public class Example2941_크로아티아알파벳 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		boolean[] check = new boolean[str.length()];
		//c= , c- , dz= , d- , lj, nj, s=, z=
		if(str.contains("dz=")) {
			str = str.replace("dz=", "a");
		}
		
		if(str.contains("c=")) {
			str = str.replace("c=", "a");
		}
		
		if(str.contains("c-")) {
			str = str.replace("c-", "a");
		}
		
		if(str.contains("d-")) {
			str = str.replace("d-", "a");
		}

		if(str.contains("lj")) {
			str = str.replace("lj", "a");
		}

		if(str.contains("s=")) {
			str = str.replace("s=", "a");
		}
		
		if(str.contains("nj")) {
			str = str.replace("nj", "a");
		}
		
		if(str.contains("z=")) {
			str = str.replace("z=", "a");
		}
		
		System.out.println(str.length());
	}

}
