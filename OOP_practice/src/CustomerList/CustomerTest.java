package CustomerList;

class Customer {
    private static int serialId = 1000;
    int customerId;
    String customerName;
    String customerGrade;
    double bonusRatio;
    double bonusPoint;

    public Customer(String customerName) {
        customerId = serialId++;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public String showInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립률은 " + (int)(bonusRatio*100) + "% 이고, 누적 적립금은 " + bonusPoint + "점 입니다.";
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
}

class VIPCustomer extends Customer {
    double saleRatio;
    public VIPCustomer(String customerName) {
        super(customerName);
        this.customerGrade = "VIP";
        this.bonusRatio = 0.1;
        saleRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint +=  price * bonusRatio;
        return (int) (price*(1-saleRatio));
    }
}

class GoldCustomer extends Customer {
    double saleRatio;
    public GoldCustomer(String customerName) {
        super(customerName);
        this.customerGrade = "GOLD";
        this.bonusRatio = 0.05;
        saleRatio = 0.02;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint +=  price * bonusRatio;
        return (int) (price*(1-saleRatio));
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerSilver = new Customer("silver");
        Customer customerVIP = new VIPCustomer("vip");
        Customer customerGold = new GoldCustomer("gold");
        System.out.println(customerSilver.calcPrice(1000));
        System.out.println(customerSilver.showInfo());
        System.out.println(customerVIP.calcPrice(1000));
        System.out.println(customerVIP.showInfo());
        System.out.println(customerGold.calcPrice(1000));
        System.out.println(customerGold.showInfo());
    }
}