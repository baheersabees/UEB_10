package h2;

public class Spielstein {
    private int currentRow;
    private int currentCol;
    Spielbrett brett;

    public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
        this.brett = brett;
        this.currentRow = indexRow;
        this.currentCol = indexCol;
    }

    private boolean movesOut() {
        Feld currentFeld = brett.getBrett()[currentRow][currentCol];
        char currentDir = currentFeld.getDirection();
        switch (currentDir) {
            case 'U':
                if (currentRow - 1 < 0) {
                    return true;
                }
                break;
            case 'D':
                if (currentRow + 1 >= brett.getDim()) {
                    return true;
                }
                break;
            case 'R':
                if (currentCol + 1 >= brett.getDim()) {
                    return true;
                }
                break;
            case 'L':
                if (currentCol - 1 < 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    public void go(int n) {
        // to be implemented
        Feld currentFeld = brett.getBrett()[currentRow][currentCol];
        for (int i = 0; i < n; i++) {
            char currentDir = currentFeld.getDirection();
            boolean boese = currentFeld.getBoese();

            if (boese || movesOut()) {
                break;
            }

            switch (currentDir) {
                case 'U':
                    currentRow--;
                    break;
                case 'D':
                    currentRow++;
                    break;
                case 'L':
                    currentCol--;
                    break;
                case 'R':
                    currentCol++;
                    break;
            }
            currentFeld = brett.getBrett()[currentRow][currentCol];
        }
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public Spielbrett getBrett() {
        return brett;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public void setBrett(Spielbrett brett) {
        this.brett = brett;
    }
}
