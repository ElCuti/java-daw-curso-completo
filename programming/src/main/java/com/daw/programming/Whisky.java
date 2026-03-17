/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class Whisky implements Posesion {

    private int age;
    private double valorBase;
    private String marca;

    public Whisky(double valorBase, int age, String marca) {
        this.valorBase = valorBase;
        this.age = age;
        this.marca = marca;
    }

    @Override
    public double valorTotal() {
        double valorWhisky = getValorBase() * Math.pow(1.01, getAge());
        if (getMarca().equals("Macallan")) {
            valorWhisky *= 1.2;
        }
        return valorWhisky;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
