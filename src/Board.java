public class Board {

    int gridSize;
    int[][] grid;

    public Board(int size) {
        gridSize = size;
        grid = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int e = 0; e < size; e++) {
                grid[i][e] = 0;
            }
        }
    }
    public int checkgrid(int x, int y)  {
        System.out.println("the current size is " + gridSize);
        return grid[y][x];
    }
}
