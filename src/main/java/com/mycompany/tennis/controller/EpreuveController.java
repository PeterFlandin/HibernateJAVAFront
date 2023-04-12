package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.dto.EpreuveFullDto;
import com.mycompany.tennis.basededonnee.dto.EpreuveLiteDto;
import com.mycompany.tennis.basededonnee.dto.JoueurDto;
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


    public void afficheDetailEpreuce() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id de l'epreuve ?");
        long identifiant = sc.nextLong();

        EpreuveFullDto epreuve = epreuveService.getEpreuveDetail(identifiant);

        for (JoueurDto joueurDto : epreuve.getParticipants()){
            System.out.println(joueurDto.getPrenom() +" "+ joueurDto.getNom());
        }

    }

    public void afficheRollandGarros() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id de l'epreuve ?");
        long identifiant = sc.nextLong();

        EpreuveLiteDto epreuve = epreuveService.getEpreuveSansTournoi(identifiant);
        System.out.println("L'epreuve ce deroule en " +epreuve.getAnnee());
    }


}

