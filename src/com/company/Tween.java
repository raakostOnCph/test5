package com.company;

public class Tween extends Abonnent {

    String navn;

    public Tween(Kilde kilde, String navn) {
        super(kilde);
        this.navn = navn;
    }


    @Override
    public String toString() {
        return "Tween{" +
                "navn='" + navn + '\'' +
                ", kilde=" + kilde.getId() +
                ", sidsteNyt='" + sidsteNyt + '\'' +
                '}';
    }
}