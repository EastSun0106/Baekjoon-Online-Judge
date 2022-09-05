package baekjoon;

import java.util.*;
/////////// add와 query 파라미터 String mGender, String[] mGender --> char[], char[][]로 바꿔야함
public class Samsung_학생DB관리 {
	public static void main(String[] args) {
		run();
		
	}
	public static void run() {
		UserSolution userSolution = new UserSolution();
		userSolution.add(1, 2, "female", 100);
		userSolution.add(2, 2, "female", 80);
		userSolution.add(3, 2, "female", 80);
	}
	static class UserSolution {
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		public void init() {
			list.clear();
			return;
		}

		public int add(int mId, int mGrade, String mGender, int mScore) {
			//String str = new String(mGender);
			list.add(new StudentInfo(mId, mGrade, mGender, mScore));
			/*System.out.println(list.get(0).mId);
			System.out.println(list.get(0).mGrade);
			System.out.println(list.get(0).mGender);
			System.out.println(list.get(0).mScore);*/
			
			
			return 0;
		}

		public int remove(int mId) {
			int grade = 0;;
			String gender = "";
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).mId == mId) {	// mId가 같은 학생의 학년과 성별을 가져오고, list를 성적ASC로 정렬
					grade = list.get(i).mGrade;
					gender = list.get(i).mGender;
					list.remove(i);
					Collections.sort(list, (s1, s2) -> s1.mScore - s2.mScore);
				}
			}
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).mGrade == grade && list.get(i).mGender == gender) {	// mId의 학년과 성별이 같으면
					return list.get(i).mId;	// mId 반환. 성적ASC 정렬되었기 때문에 성적은 무조건 최소값.
				}
			}
			
			return 0;	// mId 학생이 없거나 mId와 같은 학년,성별 학생이 없으면 0반환.
		}

		public int query(int mGradeCnt, int mGrade[], int mGenderCnt, String[] mGender, int mScore) {
			return 0;
		}
		
		class StudentInfo implements Comparable<StudentInfo>{
			public StudentInfo(int mId, int mGrade, String str, int mScore) {
				this.mId = mId;
				this.mGrade = mGrade;
				this.mGender = str;
				this.mScore = mScore;
			}
			int mId;
			int mGrade;
			String mGender;
			int mScore;
			
			@Override
			public int compareTo(StudentInfo o) {
				return this.mGrade - o.mGrade;
			}
		}
	}
	
}
