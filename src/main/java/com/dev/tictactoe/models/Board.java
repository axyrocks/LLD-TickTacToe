package com.dev.tictactoe.models;

public class Board {

    private int dimension;
    private int[][] grid;

    public Board(int dimension) {
        this.dimension = dimension;
        grid = new int[dimension][dimension];
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int getRowSum(int row){
        int rowSum = 0;
        for(int i = 0; i < dimension; i++){
            rowSum+= grid[row][i];
        }
        return rowSum;
    }

    public int getColSum(int col){
        int colSum = 0;
        for(int i = 0; i < dimension; i++){
            colSum+= grid[i][col];
        }
        return colSum;
    }
}
