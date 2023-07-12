package com.dev.tictactoe.models;

public class Board {

    private int dimension;
    private int[][] grid;

    public Board(int dimension) {
        this.dimension = dimension;
        grid = new int[dimension][dimension];
        for(int i = 0; i<dimension; i++){
            for(int j = 0; j<dimension; j++){
                grid[i][j] = -dimension;
            }
        }
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

    public void printBoard(){
        System.out.println("----------------------");
        for(int i = 0; i< dimension; i++){
            for(int j = 0; j< dimension; j++){
                if(grid[i][j] == 1){
                    System.out.print("X ");
                }
                else if(grid[i][j] == 0){
                    System.out.print("O ");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
