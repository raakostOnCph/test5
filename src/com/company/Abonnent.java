package com.company;

import java.util.ArrayList;
import java.util.List;

public class Abonnent {

    Kilde kilde;   //



    String sidsteNyt = "det er ikke sket noget";


    // todo lav en liste over alle kilder en twin er tilknyttet. Lad os starte med at tale om
    //  hvornår denne liste skal ændres.

    public void skiftKide(Kilde kilde) {
        this.kilde = kilde;
        tilmeld();

    }

    public Abonnent(Kilde kilde) {
        this.kilde = kilde;
        tilmeld();
    }


    public void tilmeld() {

        kilde.registrer(this);

    }

    public void afmeld() {

        kilde.afRegistrer(this);
    }


    // todo fiks den fejl Rene fandt. problemet var den gamel kilde blev stående. problemet skyldes at tilknytningen går fra
    //  kilderne til abonnenten ved tilknytningen, og dette sættes i abonentens konstruktor. Lad os tale om hvordan en
    //  løsning kunne se ud. Start med at orientere dig i problemet ved at se det sidste i main.



    public void hentÆndring(Kilde kilde) {


        sidsteNyt = kilde.getBesked();
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Abonnent{" +
                "kilde=" + kilde.getId() +
                ", sidsteNyt='" + sidsteNyt + '\'' +
                '}';
    }
}