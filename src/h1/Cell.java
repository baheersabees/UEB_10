package h1;

public class Cell {
    private int indexRow;
    private int indexCol;
    private boolean alive;
    private int numLivingNeighbors;
    private boolean isAliveNextGen;

    public Cell(int indexRow, int indexCol, boolean alive) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
        this.alive = alive;
    }

    public Cell(int indexRow, int indexCol) {
        this(indexRow, indexCol, false);
    }

    public void countLivingNeighbors(Cell[][] gridArray) {
        numLivingNeighbors = 0;
        for (int dRow = -1; dRow <= 1; dRow++) {
            for (int dCol = -1; dCol <= 1; dCol++) {
                int row = indexRow + dRow;
                int col = indexCol + dCol;
                if (row < 0 || col < 0 || row >= gridArray.length || col >= gridArray[0].length) {
                    continue;
                }
                if (row == indexRow && col == indexCol) {
                    continue;
                }
                Cell neighbor = gridArray[row][col];
                numLivingNeighbors += neighbor.alive ? 1 : 0;
            }
        }
        decideNextStatus();
    }

    private void decideNextStatus() {
        if (alive && (numLivingNeighbors == 2 || numLivingNeighbors == 3)) {
            isAliveNextGen = true;
        } else if (!alive && numLivingNeighbors == 3) {
            isAliveNextGen = true;
        } else {
            isAliveNextGen = false;
        }
    }

    public int getIndexRow() {
        return indexRow;
    }

    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }

    public int getIndexCol() {
        return indexCol;
    }

    public void setIndexCol(int indexCol) {
        this.indexCol = indexCol;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getNumLivingNeighbors() {
        return numLivingNeighbors;
    }

    public void setNumLivingNeighbors(int numLivingNeighbors) {
        this.numLivingNeighbors = numLivingNeighbors;
    }

    public boolean isAliveNextGen() {
        return isAliveNextGen;
    }

    public void setAliveNextGen(boolean aliveNextGen) {
        isAliveNextGen = aliveNextGen;
    }
}
