public abstract class Mover {
    private int start;
    private int end;

    public Mover(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

class Snake extends Mover {
    public Snake(int start, int end) {
        super(start, end);
    }
}

class Ladder extends Mover {
    public Ladder(int start, int end) {
        super(start, end);
    }
}
