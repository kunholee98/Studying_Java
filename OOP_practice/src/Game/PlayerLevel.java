package Game;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    public void go(int n){
        run();
        for (int m = 0; m < n; m++) {
            jump();
        }
        turn();
    }
}
