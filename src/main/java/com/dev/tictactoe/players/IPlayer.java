package com.dev.tictactoe.players;

import com.dev.tictactoe.enums.Symbol;
import com.dev.tictactoe.models.Board;

import java.io.IOException;

public abstract class IPlayer {
    public abstract void makeMove(Board board);
    public Symbol symbol;

    public IPlayer(Symbol symbol){
        this.symbol = symbol;
    }
}
