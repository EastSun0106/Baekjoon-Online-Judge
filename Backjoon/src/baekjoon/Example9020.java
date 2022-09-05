package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Example9020 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while (T > 0) {
			int n = Integer.parseInt(br.readLine());
			List<Integer> primeNum = new ArrayList<Integer>();
			// 입력조건
			if (n < 4 || n > 10000 || n % 2 == 1)
				return;
			// n까지의 소수 구하기
			for (int i = 2; i <= n; i++) {
				int cnt = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0)
						cnt++;
				}
				if (cnt == 1)
					primeNum.add(i);
			}
			int size = primeNum.size();
			int tmpI = 0, tmpJ = size - 1;
			// 소수의 합이 n인 경우 찾기
			for (int i = 0; i < size; i++) {
				for (int j = i; j < size; j++) {
					if (primeNum.get(i) + primeNum.get(j) == n) {
						if (primeNum.get(tmpJ) - primeNum.get(tmpI) > primeNum.get(j) - primeNum.get(i)) {
							tmpI = i;
							tmpJ = j;
						}
					}
				}
			}
			sb.append(primeNum.get(tmpI)).append(" ");
			sb.append(primeNum.get(tmpJ)).append("\n");
			T--;
		}
		System.out.println(sb);
	}
}
