package com.daw.programming;

import static com.daw.programming.Figure.setZoom;

public class CommandZoom extends Command {

    private double typeZoom;

    public CommandZoom(double typeZoom) {
        this.typeZoom = typeZoom;
    }

    public void execute() {
        if (typeZoom < 0.25) {
            typeZoom = 0.25;
        } else if (typeZoom > 2) {
            typeZoom = 2;
        }
        setZoom(typeZoom);
    }

    public void undo() {

    }
}
