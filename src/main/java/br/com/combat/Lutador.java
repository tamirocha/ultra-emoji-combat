package br.com.combat;

public class Lutador {

    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private final static int ONE = 1;

    // Métodos Epeciais

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        //this.peso = peso;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
            System.out.println("Inválido: lutador abaixo do peso permitido, não pode competir!");
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
            System.out.println("Categoria: Peso Leve");
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
            System.out.println("Categoria: Peso Médio");
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
            System.out.println("Categoria: Peso Pesado");
        } else {
            this.categoria = "Inválido";
            System.out.println("Inválido: lutador acima do peso permitido, não pode competir!");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos

    public void apresentar() {
        System.out.println("---------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("diretamente de(a) " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println("e medindo " + this.getAltura() + " m de altura");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println("ganhou: " + this.getVitorias() + " lutas");
        System.out.println("perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("empatou: " + this.getEmpates() + " lutas");
    }
    public void status() {
        System.out.println("---------------------------------------------------");
        System.out.println("O lutador " + this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println("com " + this.getVitorias() + " vitórias,");
        System.out.println("com " + this.getDerrotas() + " derrotas");
        System.out.println("e com " + this.getEmpates() + " empates");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + ONE);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + ONE);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + ONE);
    }
}
