package com.dev.tictactoe;

import com.dev.tictactoe.enums.PlayerType;
import com.dev.tictactoe.factories.GameFactory;
import com.dev.tictactoe.models.Game;

public class Client {
    public static void main(String[] args) {
        Game game = GameFactory.launch(3, PlayerType.Human, PlayerType.Human);
        game.run();
    }
}