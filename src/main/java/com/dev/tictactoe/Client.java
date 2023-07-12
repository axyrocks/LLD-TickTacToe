package com.dev.tictactoe;

import com.dev.tictactoe.enums.PlayerType;
import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.factories.GameFactory;
import com.dev.tictactoe.impl.ConventionalWinningStrategy;
import com.dev.tictactoe.models.Board;
import com.dev.tictactoe.models.Game;
import com.dev.tictactoe.players.HumanPlayer;
import com.dev.tictactoe.players.IPlayer;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Game game = GameFactory.launch(3, PlayerType.Human, PlayerType.Human);
    }
}