package com.daw.programming;

import java.util.ArrayList;

public class CommandMove extends Command {

    ArrayList<Figure> figuras = new ArrayList();
    private int corX;
    private int corY;

    public CommandMove(int corX, int corY, ArrayList<Figure> figuras) {
        this.corX = corX;
        this.corY = corY;
        this.figuras = figuras;
    }

    public void execute() {
        for (Figure figura : figuras) {
            figura.moveFigure(corX, corY);
        }

    }

    public void undo() {
        for (Figure figura : figuras) {
            figura.moveFigure(corX * -1, corY * -1);
        }
    }
}
