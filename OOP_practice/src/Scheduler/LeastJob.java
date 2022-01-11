package Scheduler;

public class LeastJob implements Scheduler {

    @Override
    public void sendCallToAgent() {
        System.out.println("업무가 가장 적은 상담원에게 배분합니다.");
    }
    
}
