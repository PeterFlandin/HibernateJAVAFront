package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.dto.MatchDto;
import com.mycompany.tennis.basededonnee.dto.TournoiDto;
import com.mycompany.tennis.basededonnee.service.MatchService;

import java.util.Scanner;

public class MatchController {

   private MatchService matchService;


   public MatchController(){
      this.matchService = new MatchService();
   }

   public void afficheDetailsMatch(){

      Scanner sc = new Scanner(System.in);

      System.out.println("Ecrivé le numéro d'identification de l'epreuve  ?");
      long id = sc.nextLong();
      MatchDto matchDto = matchService.getMatch(id);
      System.out.println(matchDto.getEpreuveFullDto().getAnnee());
      System.out.println("le nom du gagnat est : " + matchDto.getVainqueur().getNom() );
      System.out.println("le nom du finaliste est : " + matchDto.getFinaliste().getNom() );

   }



}
