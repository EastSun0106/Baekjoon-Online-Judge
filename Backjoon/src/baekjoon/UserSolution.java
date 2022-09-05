package baekjoon;

import java.util.*;

class UserSolution {
    ArrayList<StudentInfo> mlist1 = new ArrayList<StudentInfo>(); 	// 남자 1학년
    ArrayList<StudentInfo> mlist2 = new ArrayList<StudentInfo>();	// 남자 2학년	
    ArrayList<StudentInfo> mlist3 = new ArrayList<StudentInfo>();	// 남자 3학년
    ArrayList<StudentInfo> flist1 = new ArrayList<StudentInfo>();	// 여자 1학년
    ArrayList<StudentInfo> flist2 = new ArrayList<StudentInfo>();	// 여자 2학년
    ArrayList<StudentInfo> flist3 = new ArrayList<StudentInfo>();	// 여자 3학년
    
    ArrayList<Integer> tempList = new ArrayList<Integer>();
	public void init() {
        mlist1.clear(); mlist2.clear(); mlist3.clear();
        flist1.clear(); flist2.clear(); flist3.clear();
        
		return;
	}

	public int add(int mId, int mGrade, char mGender[], int mScore) {
		int maxId = 0;
		if(mGrade == 1 && mGender[0] == 'm') {
			mlist1.add(new StudentInfo(mId, mScore));
			Collections.sort(mlist1, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = mlist1.get(0).mId;
			
			for(int i=0; i<mlist1.size() - 1; i++) {
				if(mlist1.get(i).mScore == mlist1.get(i+1).mScore) {
					maxId = Math.max(mlist1.get(i).mId, mlist1.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		} else if(mGrade == 2 && mGender[0] == 'm') {
			mlist2.add(new StudentInfo(mId, mScore));
			Collections.sort(mlist1, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = mlist2.get(0).mId;
			
			for(int i=0; i<mlist2.size() - 1; i++) {
				if(mlist2.get(i).mScore == mlist2.get(i+1).mScore) {
					maxId = Math.max(mlist2.get(i).mId, mlist2.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		} else if(mGrade == 3 && mGender[0] == 'm') {
			mlist3.add(new StudentInfo(mId, mScore));
			Collections.sort(mlist3, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = mlist3.get(0).mId;
			
			for(int i=0; i<mlist3.size() - 1; i++) {
				if(mlist3.get(i).mScore == mlist3.get(i+1).mScore) {
					maxId = Math.max(mlist3.get(i).mId, mlist3.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		} else if(mGrade == 1 && mGender[0] == 'f') {
			flist1.add(new StudentInfo(mId, mScore));
			Collections.sort(flist1, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = flist1.get(0).mId;
			
			for(int i=0; i<flist1.size() - 1; i++) {
				if(flist1.get(i).mScore == flist1.get(i+1).mScore) {
					maxId = Math.max(flist1.get(i).mId, flist1.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		} else if(mGrade == 2 && mGender[0] == 'f') {
			flist2.add(new StudentInfo(mId, mScore));
			Collections.sort(flist2, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = flist2.get(0).mId;
			
			for(int i=0; i<flist2.size() - 1; i++) {
				if(flist2.get(i).mScore == flist2.get(i+1).mScore) {
					maxId = Math.max(flist2.get(i).mId, flist2.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		} else if(mGrade == 3 && mGender[0] == 'f') {
			flist3.add(new StudentInfo(mId, mScore));
			Collections.sort(flist3, (s1, s2) -> s2.mScore - s1.mScore);	// 성적 DESC
			maxId = flist3.get(0).mId;
			
			for(int i=0; i<flist3.size() - 1; i++) {
				if(flist3.get(i).mScore == flist3.get(i+1).mScore) {
					maxId = Math.max(flist3.get(i).mId, flist3.get(i+1).mId);
				} else {
					return maxId;
				}
			}
		}
		return maxId; 
	}

	public int remove(int mId) {
		int maxId = 0;
		for(int i=0; i<mlist1.size(); i++) {
			if(mId == mlist1.get(i).mId) {
				mlist1.remove(i);
				if(mlist1.isEmpty())
					return 0;
				Collections.sort(mlist1, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = mlist1.get(0).mId;
				
				for(int j=0; j<mlist1.size() - 1; j++) {
					if(mlist1.get(j).mScore == mlist1.get(j+1).mScore) {
						maxId = Math.max(mlist1.get(j).mId, mlist1.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		for(int i=0; i<mlist2.size(); i++) {
			if(mId == mlist2.get(i).mId) {
				mlist2.remove(i);
				if(mlist2.isEmpty())
					return 0;
				Collections.sort(mlist2, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = mlist2.get(0).mId;
				
				for(int j=0; j<mlist2.size() - 1; j++) {
					if(mlist2.get(j).mScore == mlist2.get(j+1).mScore) {
						maxId = Math.max(mlist2.get(j).mId, mlist2.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		for(int i=0; i<mlist3.size(); i++) {
			if(mId == mlist3.get(i).mId) {
				mlist3.remove(i);
				if(mlist3.isEmpty())
					return 0;
				Collections.sort(mlist3, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = mlist3.get(0).mId;
				
				for(int j=0; j<mlist3.size() - 1; j++) {
					if(mlist3.get(j).mScore == mlist3.get(j+1).mScore) {
						maxId = Math.max(mlist3.get(j).mId, mlist3.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		for(int i=0; i<flist1.size(); i++) {
			if(mId == flist1.get(i).mId) {
				flist1.remove(i);
				if(flist1.isEmpty())
					return 0;
				Collections.sort(flist1, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = flist1.get(0).mId;
				
				for(int j=0; j<flist1.size() - 1; j++) {
					if(flist1.get(j).mScore == flist1.get(j+1).mScore) {
						maxId = Math.max(flist1.get(j).mId, flist1.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		for(int i=0; i<flist2.size(); i++) {
			if(mId == flist2.get(i).mId) {
				flist2.remove(i);
				if(flist2.isEmpty())
					return 0;
				Collections.sort(flist2, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = flist2.get(0).mId;
				
				for(int j=0; j<flist2.size() - 1; j++) {
					if(flist2.get(j).mScore == flist2.get(j+1).mScore) {
						maxId = Math.max(flist2.get(j).mId, flist2.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		for(int i=0; i<flist3.size(); i++) {
			if(mId == flist3.get(i).mId) {
				flist3.remove(i);
				if(flist3.isEmpty())
					return 0;
				Collections.sort(flist3, (s1, s2) -> s1.mScore - s2.mScore);
				maxId = flist3.get(0).mId;
				
				for(int j=0; j<flist3.size() - 1; j++) {
					if(flist3.get(j).mScore == flist3.get(j+1).mScore) {
						maxId = Math.max(flist3.get(j).mId, flist3.get(j+1).mId);
					} else {
						return maxId;
					}
				}
			}
		}
		return maxId;
	}

	public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
		
		return 0;
	}
    
    public class StudentInfo{
        int mId;
		int mScore;
		
		public StudentInfo(int mId, int mScore) {
			this.mId = mId;
			this.mScore = mScore;
		}
    }
}
