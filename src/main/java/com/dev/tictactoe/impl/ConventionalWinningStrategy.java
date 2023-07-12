package com.dev.tictactoe.impl;

import com.dev.tictactoe.models.Board;
import com.dev.tictactoe.services.IWinningStrategy;

public class ConventionalWinningStrategy implements IWinningStrategy {
    @Override
    public int getWinner(Board board) {
        for(int i = 0; i< board.getDimension(); i++){
            int rowSum = board.getRowSum(i);
            int colSum = board.getColSum(i);

            if(rowSum == board.getDimension() || colSum == board.getDimension()){
                return 1;
            }
            else if(rowSum == 0 || colSum == 0){
                return 0;
            }
        }
        return -1;
    }
}
