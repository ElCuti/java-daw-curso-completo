package com.daw.programming;

import static com.daw.programming.Figure.setStroke;

public class CommandStroke extends Command {

    private double typeStroke;

    public CommandStroke(double typeStroke) {
        this.typeStroke = typeStroke;
    }

    public void execute() {
        setStroke(typeStroke);
    }

    public void undo() {

    }
}
