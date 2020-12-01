package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kilde {

    private String besked;

    private String id;

    public Kilde(String id) {
        this.id = id;
    }

    List<Abonnent > abonnentList = new ArrayList<>();

    // todo lav det sådan at en kilde kan skrive alle sine følgere ud, med navn (cast ned)

    public String getId() {
        return id;
    }


    public String getBesked() {
        return besked;
    }

    public void setBesked(String besked) {
        this.besked = besked;
        meldÆndring();
    }


    public void registrer(Abonnent abonnent) {

        abonnentList.add(abonnent);

    }

    public void meldÆndring() {

        for (Abonnent a: abonnentList ) {

            a.hentÆndring(this);
        }

    }


    public void afRegistrer(Abonnent abonnent) {

        abonnentList.remove(abonnent);

    }
}