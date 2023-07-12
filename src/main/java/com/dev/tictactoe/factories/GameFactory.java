package com.dev.tictactoe.factories;

import com.dev.tictactoe.enums.PlayerType;
import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.impl.ConventionalWinningStrategy;
import com.dev.tictactoe.models.Game;
import com.dev.tictactoe.players.IPlayer;

public class GameFactory {
    public static Game launch(int dimension, PlayerType playerType1, PlayerType playerType2) {
        IPlayer player1 = PlayerFactory.createPlayer(playerType1, Symbol.X);
        IPlayer player2 = PlayerFactory.createPlayer(playerType2, Symbol.O);
        Game game = new Game(dimension, player1, player2, true, new ConventionalWinningStrategy());
        return game;
    }
}
