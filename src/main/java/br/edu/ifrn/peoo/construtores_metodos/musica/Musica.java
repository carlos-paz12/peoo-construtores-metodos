package br.edu.ifrn.peoo.construtores_metodos.musica;

public class Musica {

    //Atributos
    private String titulo, artista, album;
    private int duracao, anoDeLancamento, ranking;

    //Construtores
    public Musica() {
    }

    public Musica(String titulo, String artista, String album, int duracao, int anoDeLancamento, int ranking) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;
        this.ranking = ranking;
    }

    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getduracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;

    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("TÍTULO: ");
        sb.append(titulo);
        sb.append("DURAÇÃO: ");
        sb.append(duracao);
        sb.append("ANO DE LANÇAMENTO: ");
        sb.append(anoDeLancamento);

        return sb.toString();
    }

}
