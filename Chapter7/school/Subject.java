package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; // Defalut; 기본적으로는 A,B 학점 제도(TYPE)
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) { // 수강신청
		studentList.add(student);
	}
}
