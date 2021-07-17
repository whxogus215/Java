package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentName;
	String studentID;
	ArrayList<Subject> subjectList;
	
	public Student(int studentName, String studentID) {
		this.studentID = studentID;
		this.studentName = studentName;		
		
		subjectList = new ArrayList<Subject>();
	}
	
	
	
	public void addSubject(String subjectID, int subjectScore) {
		Subject subject = new Subject();
		
		subject.setSubjectID(subjectID);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
		
	}
	
	public void showScoreInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getSubjectScore();
			System.out.println(studentName + "학생의 " + subject.getSubjectID() + " 과목의 성적은 " + subject.getSubjectScore() +"입니다." );
			
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다." );
		
	}
	
}
