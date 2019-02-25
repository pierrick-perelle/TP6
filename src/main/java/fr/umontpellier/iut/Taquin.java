package fr.umontpellier.iut;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin {

    private int plateau[][];

    public Taquin() {
       plateau = {{1,3,6},{2,4,7},{0,5,8}};
    }

    public Taquin(int[][] plateau) {
        this.plateau = plateau;
    }

    public boolean estGagnant() {
        return plateau[0][0] == 1 && plateau[0][1] == 2 && plateau[0][2] == 3 && plateau[1][0] == 4 && plateau[1][1] == 5 && plateau[1][2] == 6 && plateau[2][0] == 7 && plateau[2][1] == 8 && plateau[2][2] == 0;
    }

    public ArrayList<Taquin> genererFils() {
        ArrayList<Taquin> maListe = new ArrayList<>();


        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; j++) {
                if (plateau[i][j] == 0) {
                    a = i;
                    b = j;
                }
            }
        }


        //trouv








        //coin
        if (a >= 1) {
            int [][] nouveauPlateau = new int[plateau.length][plateau.length]
            for (int i = 0; i < 3; i++) {
                for (int j = 0; i < 3; j++) {
                    nouveauPlateau[i][j] = plateau[i][j];
                }
            }

            //faire permutation
            nouveauPlateau[a][b] = nouveauPlateau[a-1][b];
            nouveauPlateau[a-1][b] = 0;

            Taquin nouveau = new Taquin(nouveauPlateau);

            maListe.add(nouveau);

        }
        if(a <= plateau.length-1) {

            int [][] nouveauPlateau = new int[plateau.length][plateau.length]
            for (int i = 0; i < 3; i++) {
                for (int j = 0; i < 3; j++) {
                    nouveauPlateau[i][j] = plateau[i][j];
                }
            }

            //faire permutation
            nouveauPlateau[a][b] = nouveauPlateau[a+1][b];
            nouveauPlateau[a+1][b] = 0;

            Taquin nouveau = new Taquin(nouveauPlateau);

            maListe.add(nouveau);
        }
        if(b < 1) {

        }
        if(b > 1) {

        }


        return maListe;
    }

    @Override
    public String toString() {
        return "Taquin{" +
                "plateau 1 =" + Arrays.toString(plateau[0]) +  "plateau 2 =" + Arrays.toString(plateau[1]) +  "plateau 3 =" + Arrays.toString(plateau[2]) +
                '}';
    }
}
        /*int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        for (i=0;i<plateau.length;i++){
            for(j=0;i<plateau.length;j++) {
                if(plateau[i][j] == 0){
                    a = i;
                    b = j;
                }
            }
        }
        */