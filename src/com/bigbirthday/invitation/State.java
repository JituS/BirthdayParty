package com.bigbirthday.invitation;

public class State {
    private final String state;
    public State(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state+"";
    }
}
