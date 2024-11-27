package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;

    public int getCurtidas() {
        return curtidas;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducao++;

    }



}
