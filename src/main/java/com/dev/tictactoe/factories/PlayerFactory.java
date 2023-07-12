package com.dev.tictactoe.factories;

import com.dev.tictactoe.enums.PlayerType;
import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.players.ComputerPlayer;
import com.dev.tictactoe.players.HumanPlayer;
import com.dev.tictactoe.players.IPlayer;

public class PlayerFactory {
    public static IPlayer createPlayer(PlayerType playerType, Symbol symbol){
        switch (playerType){
            case Human:
                return new HumanPlayer(symbol);
            case Computer:
                return new ComputerPlayer(symbol);
            default:
                return null;
        }
    }
}
