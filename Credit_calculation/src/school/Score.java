package school;

import lombok.Data;

@Data
public class Score {

	/* 학번 */
	private int studentId;
	
	/* 과목 */
	private Subject subject;
	
	/* 점수 */
	private int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
}
