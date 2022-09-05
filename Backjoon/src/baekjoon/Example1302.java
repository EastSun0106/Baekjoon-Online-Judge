package baekjoon;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Example1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			int value = 1;
			String tmp = br.readLine();
			if (map.containsKey(tmp))
				value = map.get(tmp) + 1;
			map.put(tmp, value);
		}

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		int maxValue = 0;
		List<String> resultList = new ArrayList<String>();
		for (Entry<String, Integer> a : list) {
			if (maxValue <= a.getValue()) {
				maxValue = a.getValue();
				resultList.add(a.getKey());
			}
		}
		Collections.sort(resultList);
		for (String a : resultList) {
			System.out.print(a);
		}
	}
}
