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
			System.out.println(studentName + "�л��� " + subject.getSubjectID() + " ������ ������ " + subject.getSubjectScore() +"�Դϴ�." );
			
		}
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�." );
		
	}
	
}
