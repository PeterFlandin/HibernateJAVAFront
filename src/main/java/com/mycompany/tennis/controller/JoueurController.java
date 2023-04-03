package com.mycompany.tennis.controller;

import com.mycompany.tennis.basededonnee.entity.Joueur;
import com.mycompany.tennis.basededonnee.service.JoueurService;

import java.util.Scanner;

public class JoueurController {
    private JoueurService joueurService;

    public JoueurController() {
        this.joueurService = new JoueurService();
    }

    public void afficheDetailJoueur() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est l'id du joueur que vous voulez affiche ?");
        long identifiant = sc.nextLong();

        Joueur joueur = joueurService.getJoueur(identifiant);
        System.out.println("Le joueur s'appelle" + joueur.getNom() + "" + joueur.getPrenom());
    }

    public void creerJoueur() {

        Scanner sc = new Scanner(System.in);

        Joueur joueur = new Joueur();

        System.out.println("Le nom du joueur ?");
        joueur.setNom(sc.nextLine());

        System.out.println("Le prenom du joueur ?");
        joueur.setPrenom(sc.nextLine());

        System.out.println("Le sexe du joueur ?");
        joueur.setSexe(sc.nextLine().charAt(0));

        joueurService.createJoueur(joueur);

        System.out.println("Joueur créer s'appelle "+joueur.getPrenom());

    }


    public void renommeJoueur(){

        Scanner sc = new Scanner(System.in);
        System.out.println("L'identifiant du jouer à renommer ?");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Par quel nom voulez-vous le remplacer ?");

       String nom = sc.nextLine();


joueurService.renomme(id, nom);






    }

}
