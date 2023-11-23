package br.edu.ifrn.peoo.construtores_metodos.serie;

public class Serie {

    //Atributos
    private String titulo, genero, diretor;
    private int temporadas, episodios;
    private double rating;

    //Construtores
    public Serie() {
    }

    public Serie(String titulo, String genero, String diretor, int temporadas, int episodios, double rating) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.rating = rating;
    }

    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("TÍTULO: ");
        sb.append(titulo);
        sb.append("\nGÊNERO: ");
        sb.append(genero);
        sb.append("\nTEMPORADAS: ");
        sb.append(temporadas);

        return sb.toString();
    }

}
