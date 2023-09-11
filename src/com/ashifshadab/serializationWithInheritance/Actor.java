package com.ashifshadab.serializationWithInheritance;

import java.io.Serial;
import java.io.Serializable;

public class Actor extends Movie implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int actorId;
    private String actorName;

    public Actor() {
    }

    public Actor(int movieId, String movieName, int actorId, String actorName) {
        super(movieId, movieName);
        this.actorId = actorId;
        this.actorName = actorName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return super.toString()+"Actor{" +
                "actorId=" + actorId +
                ", actorName='" + actorName + '\'' +
                '}';
    }
}
