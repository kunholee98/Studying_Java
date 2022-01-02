package CollaborationPractice;

public class Texi {
    private String taxiName;
    private int income;

    public Texi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int pay) {
        income += pay;
    }

    public void showInfo() {
        System.out.println(taxiName + "수입은 " + income + "원 입니다.");
    }
}
