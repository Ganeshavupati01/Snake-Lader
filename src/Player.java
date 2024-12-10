public class Player {
    private int id;
    private String name;
    private int currentPosition;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.currentPosition = 1; // Players start at position 1
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int newPosition) {
        this.currentPosition = newPosition;
    }
}
