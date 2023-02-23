package Sudoku.problemdomain;

import java.io.Serializable;

public class Sudoku implements Serializable {
    private final GameState gamestate;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gamestate, int[][]gridState){
        this.gamestate = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState(){
        return gameState;
    }

    public int[][] getGridState(){
        return SudokuUtilities.copyToNewArray(gridState);
    }

}
