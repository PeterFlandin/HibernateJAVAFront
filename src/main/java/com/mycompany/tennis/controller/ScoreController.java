package com.mycompany.tennis.controller;

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

        Score score = scoreService.getScore(identifiant);
        System.out.println(score.getSet1());
        System.out.println(score.getSet2());


if (score.getSet3()!=null) {
    System.out.println(score.getSet3());
}
        if (score.getSet4()!=null) {
            System.out.println(score.getSet4());
        }
        if (score.getSet5()!=null) {
            System.out.println(score.getSet5());
        }

    }

}

