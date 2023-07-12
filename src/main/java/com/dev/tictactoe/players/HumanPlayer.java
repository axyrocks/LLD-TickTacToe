package com.dev.tictactoe.players;

import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.models.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HumanPlayer extends IPlayer{

    public HumanPlayer(Symbol symbol){
        super(symbol);
    }
    @Override
    public void makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        int rowNo = sc.nextInt();
        int colNo = sc.nextInt();
        int grid[][] = board.getGrid();
        grid[rowNo][colNo] = symbol == Symbol.X ? 1 : 0;
    }
}
