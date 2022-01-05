package ShowGrade;

import java.util.ArrayList;

public class Student {

    private static int serialId = 1000;
    private int studentId;
    private String studentName;
    ArrayList<Subject> subjectList;

    public Student(String studentName) {
        serialId++;
        this.studentId = serialId;
        this.studentName = studentName;
        this.subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject(subjectName, score);
        subjectList.add(subject);
    }
    
    public void showInfo() {
        int total = 0;
        for (Subject subject : subjectList) {
            total += subject.getScore();
            System.out.println(studentName + " 학생의 " + subject.subjectName + " 과목의 성적은 " + subject.getScore() + " 점입니다.");
        }
        System.out.println(studentName + " 학생의 총점은 " + subjectList.size() + " 과목 " + total + " 점입니다.");
        System.out.println(studentName + " 학생의 평균은 " + (float)total/subjectList.size() + " 점입니다.");
    }

}
