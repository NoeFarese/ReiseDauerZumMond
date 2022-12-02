package ch.css.reisedauerzummond;

public class Mondreise {
    private final int durchschnittlicheEntfernungMond = 385000;

    private double geschwindigkeit = 0;

    public Mondreise (double speedKmh){geschwindigkeit = speedKmh;}

    public double getTravelDurationHours() {return durchschnittlicheEntfernungMond / geschwindigkeit;}

    public double getTravelDurationDays (){return this.getTravelDurationHours() / 24;}

    }

