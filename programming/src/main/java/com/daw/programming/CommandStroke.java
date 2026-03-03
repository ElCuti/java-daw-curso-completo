package com.daw.programming;

import static com.daw.programming.Figure.setStroke;

public class CommandStroke extends Command {

    private double typeStroke;
    private double amount;

    public CommandStroke(double typeStroke, double amount) {
        this.typeStroke = typeStroke;
        this.amount = amount;
    }

    public void execute() {
        typeStroke += amount;
        setStroke(typeStroke);
    }

    public void undo() {
        typeStroke += amount * -1;
        setStroke(typeStroke);
    }
}
