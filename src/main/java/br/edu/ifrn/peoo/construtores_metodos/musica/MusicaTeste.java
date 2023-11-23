package br.edu.ifrn.peoo.construtores_metodos.musica;

import java.util.Scanner;

public class MusicaTeste {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        String[] titulo = new String[2];
        String[] artista = new String[titulo.length];
        String[] album = new String[titulo.length];
        int[] duracao = new int[titulo.length];
        int[] anoDeLancamento = new int[titulo.length];
        int[] ranking = new int[titulo.length];

        int i = 0;
        do {

            System.out.print("TTULO DA MÚSICA: ");
            titulo[i] = objScanner.nextLine();
            System.out.print("ARTISTA: ");
            artista[i] = objScanner.nextLine();
            System.out.print("NOME DO ALBUM: ");
            album[i] = objScanner.nextLine();
            System.out.print("DURAÇÃO DO CLIPE: ");
            duracao[i] = objScanner.nextInt();
            System.out.print("ANO DE LANÇAMENTO: ");
            anoDeLancamento[i] = objScanner.nextInt();
            System.out.print("RANKING EM QUE SE ENCONTRA: ");
            ranking[i] = objScanner.nextInt();
            objScanner.nextLine();
            System.out.println("");

            i++;

        } while (i != titulo.length);

        Musica objMusica1 = new Musica(titulo[0], artista[0], album[0], duracao[0], anoDeLancamento[0], ranking[0]);

        Musica objMusica2 = new Musica();
        objMusica2.setTitulo(titulo[1]);
        objMusica2.setArtista(artista[1]);
        objMusica2.setAlbum(album[1]);
        objMusica2.setDuracao(duracao[1]);
        objMusica2.setAnoDeLancamento(anoDeLancamento[1]);
        objMusica2.setRanking(ranking[1]);

        Musica objMusica3 = new Musica();
        objMusica3.setTitulo("Here comes the sun");
        objMusica3.setArtista("The Beatles");
        objMusica3.setAlbum("Abbey road");
        objMusica3.setDuracao(186);
        objMusica3.setAnoDeLancamento(1969);
        objMusica3.setRanking(3);

        System.out.println("-------- SÉRIE 1 --------");
        System.out.println("TÍTULO: " + objMusica1.getTitulo());
        System.out.println("ARTISTA: " + objMusica1.getArtista());
        System.out.println("ALBUM: " + objMusica1.getAlbum());
        System.out.println("DURAÇÃO: " + objMusica1.getduracao());
        System.out.println("ANO DE LANÇAMENTO: " + objMusica1.getAnoDeLancamento());
        System.out.println("RANKING: " + objMusica1.getRanking());
        System.out.println("\n-------- SÉRIE 2 --------");
        System.out.println("TÍTULO: " + objMusica2.getTitulo());
        System.out.println("ARTISTA: " + objMusica2.getArtista());
        System.out.println("ALBUM: " + objMusica2.getAlbum());
        System.out.println("DURAÇÃO: " + objMusica2.getduracao());
        System.out.println("ANO DE LANÇAMENTO: " + objMusica2.getAnoDeLancamento());
        System.out.println("RANKING: " + objMusica2.getRanking());
        System.out.println("\n-------- SÉRIE 3 --------");
        System.out.println(objMusica3.toString());

        objScanner.close();
    }

}
