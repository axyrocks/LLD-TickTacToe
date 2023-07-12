package com.dev.tictactoe.models;

import com.dev.tictactoe.players.IPlayer;
import com.dev.tictactoe.services.IWinningStrategy;

import java.io.IOException;

public class Game {
    private Board board;
    private IPlayer player1;
    private IPlayer player2;
    private boolean currentPlayer;
    private IWinningStrategy winningStrategy;

    public Game(int dimensions, IPlayer player1, IPlayer player2, boolean currentPlayer, IWinningStrategy winningStrategy) {
        this.board = new Board(dimensions);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        this.winningStrategy = winningStrategy;
    }

    public IPlayer getCurrentPlayer(){
        return currentPlayer ? player1: player2;
    }

    public void updateCurrentPlayer(){
        currentPlayer = !currentPlayer;
    }

    public void printWinner(int winner){
        if(winner == 1)
            System.out.println("Player X wins the game!! ");
        else
            System.out.println("Player O wins the game!! ");
    }

    public void run() {
        int totalTurns = board.getDimension() * board.getDimension();
        int turns = 0;
        while (turns < totalTurns) {
            board.printBoard();
            IPlayer currentPlayer = getCurrentPlayer();
            System.out.println("Player " + currentPlayer.symbol+"'s turn");
            currentPlayer.makeMove(board);
            int winner = winningStrategy.getWinner(board);
            if (winner > -1) {
                board.printBoard();
                printWinner(winner);
                return;
            }
            updateCurrentPlayer();
            turns++;
        }
        System.out.println("No result");
    }
}
