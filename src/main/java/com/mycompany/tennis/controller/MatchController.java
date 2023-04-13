package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.dto.*;
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

      System.out.println(matchDto.getScoreFullDto().getSet1());
      System.out.println(matchDto.getScoreFullDto().getSet2());

      if (matchDto.getScoreFullDto().getSet3()!=null) {
         System.out.println(matchDto.getScoreFullDto().getSet3());
      }
      if (matchDto.getScoreFullDto().getSet4()!=null) {
         System.out.println(matchDto.getScoreFullDto().getSet4());
      }
      if (matchDto.getScoreFullDto().getSet5()!=null) {
         System.out.println(matchDto.getScoreFullDto().getSet5());
      }
   }

   public void tapistapisVert(){

      Scanner sc = new Scanner(System.in);

      System.out.println("Ecrivé le numéro d'identification du match que vous voulez annuler  ?");
      long id = sc.nextLong();
      matchService.tapisVert(id);

   }

   public void ajouterMatch(){
      Scanner sc = new Scanner(System.in);
      System.out.println("identifiant de l'epreuve  ?");
      Long epreuveId = sc.nextLong();
      sc.nextLine();

      System.out.println("identifiant du vainqueur");
      Long vainqueurId = sc.nextLong();
      sc.nextLine();

      System.out.println("identifiant du finaliste");
      Long finalisteId = sc.nextLong();
      sc.nextLine();

      MatchDto dto = new MatchDto();

      dto.setEpreuveFullDto(new EpreuveFullDto());
      dto.getEpreuveFullDto().setId(epreuveId);

      dto.setFinaliste(new JoueurDto());
      dto.getFinaliste().setId(finalisteId);

      dto.setVainqueur(new JoueurDto());
      dto.getVainqueur().setId(vainqueurId);


      System.out.println("quel est la valeur du set ?");
      byte set1 = sc.nextByte();
      sc.nextLine();

      System.out.println("quel est la valeur du set ?");
      byte set2 = sc.nextByte();
      sc.nextLine();

      System.out.println("quel est la valeur du set ?");
      byte set3 = sc.nextByte();
      sc.nextLine();

      System.out.println("quel est la valeur du set ?");
      byte set4 = sc.nextByte();
      sc.nextLine();

      System.out.println("quel est la valeur du set ?");
      byte set5 = sc.nextByte();
      sc.nextLine();

      ScoreFullDto scoreFullDto = new ScoreFullDto();
      scoreFullDto.setSet1(set1);
      scoreFullDto.setSet2(set2);
      scoreFullDto.setSet3(set3);
      scoreFullDto.setSet4(set4);
      scoreFullDto.setSet5(set5);

 dto.setScoreFullDto(scoreFullDto);

 scoreFullDto.setMatchDto(dto);

 matchService.createMatch(dto);
   }

   }
