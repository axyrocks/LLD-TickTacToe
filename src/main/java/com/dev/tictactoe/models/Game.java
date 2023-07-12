package com.dev.tictactoe.models;

import com.dev.tictactoe.services.IWinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private boolean currentPlayer;
    private IWinningStrategy winningStrategy;

    private Game(){

    }

    static class GameBuilder{
        private Board board;
        private List<Player> players;
        private boolean currentPlayer;
        private IWinningStrategy winningStrategy;

        public Board getBoard() {
            return board;
        }

        public void setBoard(Board board) {
            this.board = board;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
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
}
