package CollaborationPractice;

public class texiTest {
    public static void main (String[] args){
        Student edward = new Student("Edward", 20000);
        Texi texi = new Texi("잘 나간다 운수");

        edward.takeTexi(texi);
        edward.showInfo();
        texi.showInfo();
    }
}
