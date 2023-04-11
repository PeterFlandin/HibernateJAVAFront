package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.dto.ScoreFullDto;
import com.mycompany.tennis.basededonnee.entity.Joueur;
import com.mycompany.tennis.basededonnee.entity.Score;
import com.mycompany.tennis.basededonnee.service.ScoreService;

import java.util.Scanner;

public class ScoreController {

    private ScoreService scoreService;

    public ScoreController(){
        this.scoreService = new ScoreService();
    }



    public void afficheDetailScore() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id du joueur que vous voulez affiche ?");
        long identifiant = sc.nextLong();

        ScoreFullDto scoreFullDto = scoreService.getScore(identifiant);



if (scoreFullDto.getSet3()!=null) {
    System.out.println(scoreFullDto.getSet3());
}
        if (scoreFullDto.getSet4()!=null) {
            System.out.println(scoreFullDto.getSet4());
        }
        if (scoreFullDto.getSet5()!=null) {
            System.out.println(scoreFullDto.getSet5());
        }
        System.out.println(scoreFullDto.getMatchDto().getEpreuveFullDto().getTournoi().getNom());

    }



}

