package br.com.combat;

import java.util.Random;

    //Atributos
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private Lutador vencedor;

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("====== RESULTADO DA LUTA ======");
            switch (vencedor) {                                                        // switch é a estrutura escola do Java
                case 0:                                                               // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();                                     // Desafiado vence
                    break;
                case 2:
                    System.out.println("Vitória do: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();                                     // Desafiante vence
                    break;
            }
            System.out.println("=================================================");

        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }


    /*
    public Lutador aleatorio(Lutador desafiado, Lutador desafiante) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(3);
        if (valor == 1) {
            return desafiado;
        } else if (valor == 2) {
            return desafiante;
        } else {
            return null;
        }
    }

     */


    // Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
