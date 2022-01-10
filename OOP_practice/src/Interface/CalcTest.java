package Interface;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 2;
        
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.divide(num1, num2));
        //calc.showInfo() 는 불가!
    }
}
