package baekjoon;

import java.io.*;
import java.util.*;

public class Example4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk = new Stack<Character>();
		
		while(true) {
			stk.clear();
			String str = br.readLine();
			if(str.contentEquals("."))
				break;
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == '(')
					stk.push('(');
				else if(str.charAt(i) == '[')
					stk.push('[');
				else if(str.charAt(i) == ')') {
					if(stk.isEmpty()) {
						stk.push(' ');
						sb.append("NO").append("\n");
						break;
					}
					if(stk.peek() == '(')
						stk.pop();
				} else if(str.charAt(i) == ']') {
						if(stk.isEmpty()) {
							stk.push(' ');
							sb.append("NO").append("\n");
							break;
						}
						if(stk.peek() == '[')
							stk.pop();
					}
				}
				if(stk.isEmpty())
					sb.append("YES").append("\n");
				else if(stk.contains('[') || stk.contains('('))
					sb.append("NO").append("\n");
			}
			System.out.print(sb);
		}
	}
