package br.com.combat;

public class Main {
    public static void main(String[] args) {
        Lutador vetor[] = new Lutador[6];

        Lutador l0 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        Lutador l1 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        Lutador l2 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2,1);
        Lutador l3 = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        Lutador l4 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        Lutador l5 = new Lutador("Nerdaard", "EUA", 30, 1.81,105.7, 12, 2, 4);

        /*
        vetor[0] = l0;
        vetor[1] = l1;
        vetor[2] = l2;
        vetor[3] = l3;
        vetor[4] = l4;
        vetor[5] = l5;
        for (int i = 0; i <= vetor.length - 1; i++){
            System.out.println(i + " - " + vetor[i].getNome());

         */

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l4, l5);
        UEC01.lutar();
        //l0.status();
        //l1.status();



        }
        /*
        l0.apresentar();
        l2.status();
        l3.ganharLuta();
        l3.perderLuta();
        l3.empatarLuta();
        l3.empatarLuta();
        l3.status();
        l1.ganharLuta();
        l0.empatarLuta();
         */
    }