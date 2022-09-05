package baekjoon;

import java.io.*;

public class ShowMeTheCode2B {
	static int[][] board;
	static int[][] tempBoard;
	static int ballNum;
	static boolean[][] check;
	static int result = 100000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		board = new int[7][7];
		tempBoard = new int[7][7];
		
		for(int i=0; i<7; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<7; j++) {
				board[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		ballNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<7; i++) {
			check = new boolean[7][7];
			checkEvent(i);
		}
		System.out.println(result);
	}
	
	// 보드 초기화 메소드
	public static void resetPosition() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				tempBoard[i][j] = board[i][j];
			}
		}
	}
	
	// 그룹 이벤트 체크 메소드
	public static void checkEvent(int n) {
		resetPosition();
		
		for(int i=1; i<7; i++) {
			if(tempBoard[i][n] != 0) {
				insertBall(i-1, n);
				break;
			}
			if(i == 6 && tempBoard[i][n] == 0) {
				insertBall(i, n);
				break;
			}
		}
	}
	
	// 남는 공 체크 메소드
	public static void checkBoardCnt() {
		int cnt = 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(tempBoard[i][j] != 0)
					cnt++;
			}
		}
		result = Math.min(cnt, result);
		return;
	}
	
	// 공 삽입 메소드
	public static void insertBall(int x, int y) {
		tempBoard[x][y] = ballNum;
		deleteBall();
	}
	
	// 공이 터진 후 재배열 시키는 메소드
	public static void moveBall() {
		for(int idx = 0; idx < 7; idx++){
	        for(int i = 6; i >= 0; i--){
	            if(tempBoard[i][idx] != 0){
	                for(int j = 6; j > i; j--){
	                    if(tempBoard[j][idx] == 0){
	                        tempBoard[j][idx] = tempBoard[i][idx];
	                        tempBoard[i][idx] = 0;
	                        break;
	                    }
	                }
	            }
	        }
	    }
		deleteBall();
	}
	
	// 공 터뜨리기 메소드
	public static void deleteBall() {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		int nx = 0, ny = 0;
		for(int x=0; x<7; x++) {
			for(int y=0; y<7; y++) {
				int horiLen = 1;	// 가로그룹 길이
				int vertiLen = 1;	// 세로그룹 길이
				// 세로
				nx = x + dx[0];
				ny = y + dy[0];
				while(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && tempBoard[nx][ny] != 0){
					vertiLen++;
			        nx += dx[0]; ny += dy[0];
			    }
				nx = x + dx[1];
				ny = y + dy[1];
				while(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && tempBoard[nx][ny] != 0){
					vertiLen++;
			        nx += dx[1]; ny += dy[1];
			    }
				
				// 가로
				nx = x + dx[2];
				ny = y + dy[2];
				while(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && tempBoard[nx][ny] != 0){
					horiLen++;
			        nx += dx[2]; ny += dy[2];
			    }
				nx = x + dx[3];
				ny = y + dy[3];
				while(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && tempBoard[nx][ny] != 0){
					horiLen++;
			        nx += dx[3]; ny += dy[3];
			    }
				
				if(horiLen == tempBoard[x][y] || vertiLen == tempBoard[x][y])
					check[x][y] = true;
			}
		}
		int deleteCnt = 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(check[i][j]) {
					tempBoard[i][j] = 0;
					check[i][j] = false;
					deleteCnt++;
				}
			}
		}
		if(deleteCnt == 0) {
			checkBoardCnt();
			return;
		} else {
			moveBall();
			return;
		}
	}
}
