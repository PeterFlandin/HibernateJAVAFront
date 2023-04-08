package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.entity.Epreuve;
import com.mycompany.tennis.basededonnee.entity.Joueur;
import com.mycompany.tennis.basededonnee.repository.EpreuveRepository;
import com.mycompany.tennis.basededonnee.service.EpreuveService;

import java.util.Scanner;

public class EpreuveController {

    private EpreuveService epreuveService;

    public EpreuveController (){
        this.epreuveService = new EpreuveService();
    }


    public void afficheDerniereEpreuve() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id de l'epreuve ?");
        long identifiant = sc.nextLong();

        Epreuve epreuve = epreuveService.getEpreuveAvecTournoi(identifiant);
        System.out.println( "Le nom du tournoi est "+epreuve.getTournoi().getNom());
    }

    public void afficheRollandGarros() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id de l'epreuve ?");
        long identifiant = sc.nextLong();

        Epreuve epreuve = epreuveService.getEpreuveSansTournoi(identifiant);
        System.out.println("L'epreuve ce deroule en " + epreuve.getAnnee());
    }


}

