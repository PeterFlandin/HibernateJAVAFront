package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.entity.Tournoi;
import com.mycompany.tennis.basededonnee.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    private TournoiService tournoiService;

    public TournoiController() {
        this.tournoiService=new TournoiService();
    }

    public void afficheDetailsTournoi(){

        Scanner sc = new Scanner(System.in);

      System.out.println("Ecrivé le numéro d'identification de l'epreuve  ?");
        long id = sc.nextLong();
       Tournoi tournoi = tournoiService.getTournoi(id);

       System.out.println("le nom du tournoi est : " );

    }

    public void creerTournoi() {

        Scanner sc = new Scanner(System.in);
        Tournoi tournoi=new Tournoi();

        System.out.println("Donnée un nom de tournoi ?");
        tournoi.setNom(sc.nextLine());

        System.out.println("maintnant un code référence");
        tournoi.setCode(sc.nextLine());

        tournoiService.createTournoi(tournoi);


    }

    public  void  deleteTournoi (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Id du tournoi à supprimer ?");
        long id = sc.nextLong();
        tournoiService.deleteTournoiSelectionne(id);

    }


}
