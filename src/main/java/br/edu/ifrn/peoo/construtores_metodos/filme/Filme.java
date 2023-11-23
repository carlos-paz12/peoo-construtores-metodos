package br.edu.ifrn.peoo.construtores_metodos.filme;

public class Filme {

    //Atributos
    private String titulo, genero, direcao, classificacaoEtaria;
    private int lancamento, duracao;

    //Construtores
    public Filme() {
    }

    public Filme(String titulo, String genero, String direcao, String classificacaoEtaria, int lancamento, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.direcao = direcao;
        this.classificacaoEtaria = classificacaoEtaria;
        this.lancamento = lancamento;
        this.duracao = duracao;
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

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String diretor) {
        this.direcao = diretor;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoIndicativa) {
        this.classificacaoEtaria = classificacaoIndicativa;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("TÍTULO: ");
        sb.append(titulo);
        sb.append("\nCLASSIFICAÇÃO ETÁRIA: ");
        sb.append(classificacaoEtaria);
        sb.append("\nANO DE LANÇAMENTO: ");
        sb.append(lancamento);

        return sb.toString();
    }

}
