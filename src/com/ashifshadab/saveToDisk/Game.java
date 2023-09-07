package com.ashifshadab.saveToDisk;

import java.io.Serializable;

/**
 * If We are going to persist object of that class which doesn't implements
 * Serializable interface then it will throw java.io.NotSerializableException:
 */
public class Game  {

    private int gameId;
    private  String gameName;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                '}';
    }
}
