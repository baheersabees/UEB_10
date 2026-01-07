package h1;

public class Cell {
    int indexRow;
    int indexCol;
    boolean alive;
    int numLivingNeighbors;
    boolean isAliveNextGen;

    Cell(int indexRow, int indexCol, boolean alive) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
        this.alive = alive;
    }

    Cell(int indexRow, int indexCol) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
        this.alive = false;
    }

    public void countLivingNeighbors(Grid grid) {

    }

    private void decideNextStatus() {

    }
}
