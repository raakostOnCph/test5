package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here




//        Abonnent abonnent = new Abonnent(sedney);
//        Abonnent abonnent1 = new Abonnent(sedney);
//        Abonnent abonnent2 = new Abonnent(gustav);
//        Abonnent abonnent3 = new Abonnent(sedney);
//        Abonnent rene = new Abonnent(gustav);
//
//        sedney.setBesked("man kan ikke være for stiv til sex med pinball maskine");
//
//        System.out.println("nu prøver vi gustav");
//
//        gustav.setBesked("fuld trusserne med brocoli... sir gustav");
//
//
//        Tween tween = new Tween(sedney,"joy");
//
//        sedney.setBesked("jeg har været hjernedød længe");
//
//
//        tween.afmeld();
//
//        sedney.setBesked("jeg har spildt penge på psykolog fordi jeg hjerne død");
//
//        tween.skiftKide(gustav);
//
//        gustav.setBesked("halv pris på første træning, med happy ending");
//

//        sedney.setBesked("månen er ikke lavet grøn ost !!!!");
//



        Kilde sedney = new Kilde("Sedney Lee");

        Kilde gustav = new Kilde("Gustav s");

        Kilde fie = new Kilde("fie pigen");

        Tween lukas = new Tween(gustav,"Lukas");

        lukas.skiftKide(sedney);   // todo bør skiftkilde have et andet navn.

        lukas.skiftKide(fie);

        fie.setBesked("se hvad jeg fik lavet i polen for 100 kr");

        gustav.setBesked("jeg har fået ny kærste");


        sedney.setBesked("huske mundbind i swingerklubben");



    }
}



// todo  lav en liste over alle twins vi kan løbe igennem

// todo alle kilderne lever jo af at have følgere. gør sådan at hver enkelt kilde kan skrive alle sine følgere ud, og lave det sådan at man bare kan få et antal

// todo lav det sådan at hver enkelt kilde kan skrive alle følgerne ud for at dokumentere dem. "fie.txt"

// todo lav det sådan at alle indlæg for kilderne gemmes, enten i en fil for hver, eller en samlet fil for alle kilderne.
