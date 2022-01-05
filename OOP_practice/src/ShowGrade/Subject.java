package ShowGrade;

public class Subject {
    int score;
    String subjectName;

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
