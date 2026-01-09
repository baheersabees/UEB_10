package h1;

public class Grid {
    private Cell[][] gridArray;

    public Grid(Cell[] cells, int gridRows, int gridCols) {
        gridArray = new Cell[gridRows][gridCols];
        for (int row = 0; row < gridRows; row++) {
            for (int col = 0; col < gridCols; col++) {
                gridArray[row][col] = new Cell(row, col);
            }
        }

        for (Cell c : cells) {
            if (c.getIndexRow() >= 0 && c.getIndexRow() < gridRows && c.getIndexCol() >= 0 && c.getIndexCol() < gridCols) {
                gridArray[c.getIndexRow()][c.getIndexCol()].setAlive(true);
            }
        }

        initializeNeighborData();
    }

    private void initializeNeighborData() {
        for (int row = 0; row < gridArray.length; row++) {
            for (int col = 0; col < gridArray[row].length; col++) {
                gridArray[row][col].countLivingNeighbors(gridArray);
            }
        }
    }

    public void computeNextGen() {


        for (int row = 0; row < gridArray.length; row++) {
            for (int col = 0; col < gridArray[row].length; col++) {
                Cell cell = gridArray[row][col];
                cell.setAlive(cell.isAliveNextGen());
                cell.setNumLivingNeighbors(0);
            }
        }

        initializeNeighborData();
    }

    public void computeGeneration(int n) {
        for (int i = 0; i < n; i++) {
            computeNextGen();
        }
    }

    public Cell[][] getGridArray() {
        return gridArray;
    }

    public void setGridArray(Cell[][] gridArray) {
        this.gridArray = gridArray;
    }
}
