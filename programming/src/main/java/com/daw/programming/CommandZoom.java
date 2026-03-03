package com.daw.programming;

import static com.daw.programming.Figure.setZoom;

public class CommandZoom extends Command {

    private double typeZoom;
    private double amount;

    public CommandZoom(double typeZoom, double amount) {
        this.typeZoom = typeZoom;
        this.amount = amount;
    }

    public void execute() {
        typeZoom += amount;
        if (typeZoom < 0.25) {
            typeZoom = 0.25;
        } else if (typeZoom > 2) {
            typeZoom = 2;
        }
        setZoom(typeZoom);
    }

    public void undo() {
        typeZoom += amount * -1;
        if (typeZoom < 0.25) {
            typeZoom = 0.25;
        } else if (typeZoom > 2) {
            typeZoom = 2;
        }
        setZoom(typeZoom);
    }
}
