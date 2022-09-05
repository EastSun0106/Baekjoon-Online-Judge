package baekjoon;

import java.io.*;

public class Example14500_테트로미노 {
	static int N;
	static int M;
	static int[][] board;
	static int maxResult = 0;
	static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		board = new int[N+3][M+3];
		for(int i=3; i<N+3; i++) {
			str = br.readLine().split(" ");
			for(int j=3; j<M+3; j++) {
				board[i][j] = Integer.parseInt(str[j-3]);
			}
		}
		solution(1);
		System.out.println(maxResult);
	}
	
	public static void solution(int n) {
		if(n > 5)
			return;
		// 'ㅡ' 모양
		if(n == 1) {
			for(int i=3; i<N; i++) {
				for(int j=3; j<=M-4; j++) {
					result = board[i][j] + board[i][j+1] + board[i][j+2] + board[i][j+3];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<=N-4; i++) {
				for(int j=3; j<M; j++) {
					result = board[i][j] + board[i+1][j] + board[i+2][j] + board[i+3][j];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
		} else if(n == 2) { //'ㅁ' 모양
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i+1][j] + board[i][j+1] + board[i+1][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
		} else if(n == 3) { // 'ㄴ' 모양
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i+1][j] + board[i+2][j] + board[i+2][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i+1][j] + board[i+1][j+1] + board[i+1][j+2] + board[i][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i][j+1] + board[i+1][j+1] + board[i+2][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i][j] + board[i+1][j] + board[i][j+1] + board[i][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			// 대칭반전
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i+2][j] + board[i+2][j+1] + board[i+1][j+1] + board[i][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i][j] + board[i][j+1] + board[i][j+2] + board[i+1][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i][j+1] + board[i+1][j] + board[i+2][j];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i][j] + board[i+1][j] + board[i+1][j+1] + board[i+1][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
		} else if (n == 4) {
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i+1][j] + board[i+1][j+1] + board[i+2][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i+1][j] + board[i+1][j+1] + board[i][j+1] + board[i][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j+1] + board[i+1][j+1] + board[i+1][j] + board[i+2][j];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i][j] + board[i][j+1] + board[i+1][j+1] + board[i+1][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
		} else if (n == 5) {
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i][j] + board[i][j+1] + board[i][j+2] + board[i+1][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i][j] + board[i+1][j] + board[i+2][j] + board[i+1][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
 				}
			}
			for(int i=3; i<N-1; i++) {
				for(int j=3; j<M-2; j++) {
					result = board[i+1][j] + board[i+1][j+1] + board[i+1][j+2] + board[i][j+1];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
			for(int i=3; i<N-2; i++) {
				for(int j=3; j<M-1; j++) {
					result = board[i+1][j] + board[i+1][j+1] + board[i][j+1] + board[i+1][j+2];
					maxResult = Math.max(maxResult, result);
					result = 0;
				}
			}
		}
		// if문 종료
		solution(n+1);
	}
}
