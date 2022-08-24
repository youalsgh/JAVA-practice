package school;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Student {
	
	/* �й� */
	private int studentId;
	
	/* �̸� */
	private String studentName;
	
	/* �ʼ����� */
	private Subject majorSubject;

	/* �л��� ������ ������ ���� ����Ʈ�̴�. addSubjectScore() �޼��尡 ȣ��Ǹ� �� ����Ʈ�� �߰��ȴ�. */
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
