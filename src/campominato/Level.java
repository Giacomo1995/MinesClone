package campominato;

public enum Level {

    EASY (9, 9, 10), // Matrix 9x9 with 10 mines
    MEDIUM (16, 16, 40), // Matrix 16x16 with 40 mines
    HARD (30, 16, 99); // Matrix 30x16 with 99 mines

    private final int rows; // Number of rows
    private final int columns; // Number of columns
    private final int mines; // Number of mines

    Level(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getMines() {
        return mines;
    }

}
