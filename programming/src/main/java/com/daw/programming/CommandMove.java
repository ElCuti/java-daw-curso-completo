package com.daw.programming;

public class CommandMove extends Command {

    private int corX;
    private int corY;

    public CommandMove(int corX, int corY) {
        this.corX = corX;
        this.corY = corY;
    }

    public void execute() {

    }

    public void undo() {

    }
}
