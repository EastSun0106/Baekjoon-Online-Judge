package baekjoon;

public class No1000 {
	
	public static void main(String[] args) {
		int i=1;
		int selfNum=0, sum = 0;
		boolean[] arr = new boolean[10000];
		
		while(i<=10000) {
			while(i>0) {
				sum = i;
				sum += i%10;
				i /= 10;
				selfNum = sum;
			}			
			arr[selfNum] = false;
			if(arr[i] == true)
				System.out.println(i);
			i++;
		}
	}
}
