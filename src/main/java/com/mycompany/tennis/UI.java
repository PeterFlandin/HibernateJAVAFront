package com.mycompany.tennis;

import com.mycompany.tennis.controller.EpreuveController;
import com.mycompany.tennis.controller.JoueurController;
import com.mycompany.tennis.controller.ScoreController;
import com.mycompany.tennis.controller.TournoiController;

public class UI {

    public static void main(String... args){

       // JoueurController joueurController = new JoueurController();

        //  joueurController.afficheDetailJoueur();
        // joueurController.renommeJoueur();
        //joueurController.changementDeSexe();
        //  joueurController.suprimeJouer();
        //  joueurController.creerJoueur();


        // ---------------------------------------------------

        //   TournoiController tournoiController = new TournoiController();

        // tournoiController.afficheDetailsTournoi();
        //  tournoiController.creerTournoi();
        //  tournoiController.deleteTournoi();

        //---------------------------------------------------

        //   ScoreController scoreController = new ScoreController();
        //  scoreController.afficheDetailScore();

        //------------------------------------------------------

        EpreuveController epreuveController = new EpreuveController();
        epreuveController.afficheDerniereEpreuve();




    }




}
