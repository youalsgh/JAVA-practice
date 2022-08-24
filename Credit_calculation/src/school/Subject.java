package school;

import java.util.ArrayList;

import lombok.Data;
import utils.Define;

@Data
public class Subject {
	
	/* 과목 이름 */
	private String subjectName;
	
	/* 과목 고유번호 */
	private int subjectId;
	
	/* 학점 평가 정책 */
	private int gradeType;
	
	/* 이 과목을 수강 신청한 학생 리스트이다. register() 메서드를 호출하면 이 리스트에 추가된다. */
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
