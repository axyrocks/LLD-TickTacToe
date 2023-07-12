package com.dev.tictactoe.players;

import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.models.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer extends IPlayer{

    public HumanPlayer(Symbol symbol){
        super(symbol);
    }
    @Override
    public void makeMove(Board board) throws IOException {
        int rowNo = new BufferedReader(new InputStreamReader(System.in)).read();
        int colNo = new BufferedReader(new InputStreamReader(System.in)).read();
        int[][] boardGrid = board.getGrid();
        boardGrid[rowNo][colNo] = symbol == Symbol.X ? 1 : 0;
    }
}
