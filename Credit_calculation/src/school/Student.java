package school;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Student {
	
	/* 학번 */
	private int studentId;
	
	/* 이름 */
	private String studentName;
	
	/* 필수과목 */
	private Subject majorSubject;

	/* 학생이 수강한 과목의 점수 리스트이다. addSubjectScore() 메서드가 호출되면 이 리스트에 추가된다. */
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
}
