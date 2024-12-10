import java.util.Random;

public class Dice {
    private int totalCount;
    private Random random;

    public Dice(int count) {
        this.totalCount = count;
        this.random = new Random();
    }

    public int roll() {
        int total = 0;
        for (int count = 0; count < totalCount; count++) {
            total += random.nextInt(6) + 1;
        }
        return total;
    }
}
