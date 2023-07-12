package com.dev.tictactoe.services;

import com.dev.tictactoe.models.Board;

public interface IWinningStrategy {
    int getWinner(Board b);
}
