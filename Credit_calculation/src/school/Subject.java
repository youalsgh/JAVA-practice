package school;

import java.util.ArrayList;

import lombok.Data;
import utils.Define;

@Data
public class Subject {
	
	/* ���� �̸� */
	private String subjectName;
	
	/* ���� ������ȣ */
	private int subjectId;
	
	/* ���� �� ��å */
	private int gradeType;
	
	/* �� ������ ���� ��û�� �л� ����Ʈ�̴�. register() �޼��带 ȣ���ϸ� �� ����Ʈ�� �߰��ȴ�. */
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	
}
