package ShowGrade;

public class ScoreTest {
    public static void main(String[] args) {
        Student kuno = new Student("kuno");
        Student mingook = new Student("mingook");
        kuno.addSubject("국어", 100);
        kuno.addSubject("수학", 50);
        mingook.addSubject("국어", 70);
        mingook.addSubject("수학", 85);
        mingook.addSubject("영어", 100);

        kuno.showInfo();
        System.out.println("=====================================");
        mingook.showInfo();
    }
}
