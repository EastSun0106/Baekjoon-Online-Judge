package baekjoon;

public class Example4673_셀프넘버 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10001];
		for(int i=1; i<10001; i++) {
			int temp = i;
			int sum = temp;
			while(temp > 0 && sum < 10001) {
				sum += temp%10;
				temp /= 10;
			}
			if(sum < 10001)
				arr[sum]++;
		}
		for(int i=1; i<10001; i++) {
			if(arr[i] == 0)
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
