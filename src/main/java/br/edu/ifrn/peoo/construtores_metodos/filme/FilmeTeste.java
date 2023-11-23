package br.edu.ifrn.peoo.construtores_metodos.filme;

import java.util.Scanner;

public class FilmeTeste {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        String[] titulo = new String[2];
        String[] genero = new String[titulo.length];
        String[] direcao = new String[titulo.length];
        String[] classificacaoEtaria = new String[titulo.length];
        int[] lancamento = new int[titulo.length];
        int[] duracao = new int[titulo.length];

        int i = 0;
        do {

            System.out.print("FILME TÍTULO: ");
            titulo[i] = objScanner.nextLine();
            System.out.print("GÊNERO: ");
            genero[i] = objScanner.nextLine();
            System.out.print("DIREÇÃO: ");
            direcao[i] = objScanner.nextLine();
            System.out.print("CLASSIFICAÇÃO INDICATIVA: ");
            classificacaoEtaria[i] = objScanner.nextLine();
            System.out.print("ANO DE LANÇAMENTO: ");
            lancamento[i] = objScanner.nextInt();
            System.out.print("DURAÇÃO (minutos): ");
            duracao[i] = objScanner.nextInt();
            objScanner.nextLine();
            System.out.println();

            i++;

        } while (i != titulo.length);

        Filme objFilme1 = new Filme(titulo[0], genero[0], direcao[0], classificacaoEtaria[0], lancamento[0], duracao[0]);

        Filme objFilme2 = new Filme();
        objFilme2.setTitulo(titulo[1]);
        objFilme2.setGenero(genero[1]);
        objFilme2.setDirecao(direcao[1]);
        objFilme2.setClassificacaoEtaria(classificacaoEtaria[1]);
        objFilme2.setLancamento(lancamento[1]);
        objFilme2.setDuracao(duracao[1]);

        Filme objFilme3 = new Filme();
        objFilme3.setTitulo("Avengers: Endgame");
        objFilme3.setGenero("Acao/Aventura/Drama");
        objFilme3.setDirecao("Anthony Russo/Joe Russo");
        objFilme3.setClassificacaoEtaria("12+");
        objFilme3.setLancamento(2019);
        objFilme3.setDuracao(182);

        System.out.println("\n-------- FILME 1 --------");
        System.out.format("TÍTULO: %s\n", objFilme1.getTitulo());
        System.out.format("GÊNERO: %s\n", objFilme1.getGenero());
        System.out.format("DIRETOR: %s\n", objFilme1.getDirecao());
        System.out.format("CLASSIFICAÇÃO INDICATIVA: %s\n", objFilme1.getClassificacaoEtaria());
        System.out.format("ANO DE LANÇAMENTO: %d\n", objFilme1.getLancamento());
        System.out.format("DURAÇÃO: %dm\n", objFilme1.getDuracao());

        System.out.println("\n-------- FILME 2 --------");
        System.out.format("TÍTULO: %s\n", objFilme2.getTitulo());
        System.out.format("GÊNERO: %s\n", objFilme2.getGenero());
        System.out.format("DIRETOR: %s\n", objFilme2.getDirecao());
        System.out.format("CLASSIFICAÇÃO INDICATIVA: %s\n", objFilme2.getClassificacaoEtaria());
        System.out.format("ANO DE LANÇAMENTO: %d\n", objFilme2.getLancamento());
        System.out.format("DURAÇÃO: %dm\n", objFilme2.getDuracao());

        System.out.println("\n-------- FILME 3 --------");
        System.out.println(objFilme3.toString());
    }

}
