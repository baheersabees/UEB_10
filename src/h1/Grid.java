package h1;

import java.util.ArrayList;

public class Grid {
    ArrayList<ArrayList<Cell>> GridArray;

    Grid (Cell[] cells, int gridrows, int gridCols) {
        GridArray = new ArrayList<ArrayList<Cell>>();
        for (int i = 0; i < gridrows; i++) {
            GridArray.add(new ArrayList<Cell>());
            for (int j = 0; j < gridCols; j++) {
                GridArray.get(i).add(new Cell(i, j, false));
            }
        }
        for (Cell c : cells) {
            if (c.indexRow < gridrows && c.indexCol < gridCols) {
                Cell cellToActivate = GridArray.get(c.indexRow).get(c.indexCol);
                cellToActivate.alive = true;
            }
        }

        for (int i = 0; i < gridrows; i++) {
            for (int j = 0; j < gridCols; j++) {
                Cell currentCell = GridArray.get(i).get(j);
                currentCell.countLivingNeighbors(this);
            }
        }
    }

    public void compueteNextGeneration() {

    }

    public void computeGeneration(int n) {

    }
}
