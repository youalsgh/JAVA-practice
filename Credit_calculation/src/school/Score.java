package school;

import lombok.Data;

@Data
public class Score {

	/* �й� */
	private int studentId;
	
	/* ���� */
	private Subject subject;
	
	/* ���� */
	private int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
}
