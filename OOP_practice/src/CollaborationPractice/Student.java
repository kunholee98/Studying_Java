package CollaborationPractice;

public class Student {
    private String studentName;
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTexi(Texi texi) {
        texi.take(10000);
        money -= 10000;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
