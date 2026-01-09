package h1;

public class H1_main {
    public static void main(String[] args) {
        // Testdaten aus der Aufgabenstellung
        Cell[] seed = {
            new Cell(0, 4, true),
            new Cell(1, 1, true),
            new Cell(2, 2, true),
            new Cell(2, 3, true),
            new Cell(3, 1, true),
            new Cell(3, 2, true)
        };
        
        Grid grid = new Grid(seed, 4, 5);
        
        System.out.println("Generation 0:");
        printGrid(grid.getGridArray());
        
        grid.computeGeneration(1);
        System.out.println("\nGeneration 1:");
        printGrid(grid.getGridArray());
        
        grid.computeGeneration(1);
        System.out.println("\nGeneration 2:");
        printGrid(grid.getGridArray());
    }
    
    private static void printGrid(Cell[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col].isAlive() ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
