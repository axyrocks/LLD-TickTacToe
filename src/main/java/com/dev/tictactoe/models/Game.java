package com.dev.tictactoe.models;

import com.dev.tictactoe.players.IPlayer;
import com.dev.tictactoe.services.IWinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<IPlayer> players;
    private boolean currentPlayer;
    private IWinningStrategy winningStrategy;

    public Game(int dimensions, List<IPlayer> players, boolean currentPlayer, IWinningStrategy winningStrategy) {
        this.board = new Board(dimensions);
        this.players = players;
        this.currentPlayer = currentPlayer;
        this.winningStrategy = winningStrategy;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<IPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<IPlayer> players) {
        this.players = players;
    }

    public boolean isCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public IWinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(IWinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }
}
