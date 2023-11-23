package br.edu.ifrn.peoo.construtores_metodos.serie;

import java.util.Scanner;

public class SerieTeste {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        String[] titulo = new String[2];
        String[] genero = new String[titulo.length];
        String[] diretor = new String[titulo.length];
        int[] temporadas = new int[titulo.length];
        int[] episodios = new int[titulo.length];
        double[] rating = new double[titulo.length];

        int i = 0;
        do {

            System.out.print("SÉRIE TÍTULO: ");
            titulo[i] = objScanner.nextLine();
            System.out.print("GÊNERO: ");
            genero[i] = objScanner.nextLine();
            System.out.print("DIRETOR: ");
            diretor[i] = objScanner.nextLine();
            System.out.print("TEMPORADAS: ");
            temporadas[i] = objScanner.nextInt();
            System.out.print("EPISÓDIOS: ");
            episodios[i] = objScanner.nextInt();
            System.out.print("RATING: ");
            rating[i] = objScanner.nextDouble();
            objScanner.nextLine();
            System.out.println();

            i++;

        } while (i != titulo.length);

        Serie objSerie1 = new Serie(titulo[0], genero[0], diretor[0], temporadas[0], episodios[0], rating[0]);

        Serie objSerie2 = new Serie();
        objSerie2.setTitulo(titulo[1]);
        objSerie2.setGenero(genero[1]);
        objSerie2.setDiretor(diretor[1]);
        objSerie2.setTemporadas(temporadas[1]);
        objSerie2.setEpisodios(episodios[1]);
        objSerie2.setRating(rating[1]);

        Serie objSerie3 = new Serie();
        objSerie3.setTitulo("The Big Bang Theory");
        objSerie3.setGenero("Sitcom");
        objSerie3.setDiretor("Mark Cendrowski");
        objSerie3.setTemporadas(12);
        objSerie3.setEpisodios(279);
        objSerie3.setRating(8.1);

        System.out.println("\n-------- SÉRIE 1 --------");
        System.out.format("TÍTULO: %s\n", objSerie1.getTitulo());
        System.out.format("GÊNERO: %s\n", objSerie1.getGenero());
        System.out.format("DIRETOR: %s\n", objSerie1.getDiretor());
        System.out.format("TEMPORADAS: %d\n", objSerie1.getTemporadas());
        System.out.format("EPISÓDIOS: %d\n", objSerie1.getEpisodios());
        System.out.format("RATING: %.1f\n", objSerie1.getRating());

        System.out.println("\n-------- SÉRIE 2 --------");
        System.out.format("TÍTULO: %s\n", objSerie2.getTitulo());
        System.out.format("GÊNERO: %s\n", objSerie2.getGenero());
        System.out.format("DIRETOR: %s\n", objSerie2.getDiretor());
        System.out.format("TEMPORADAS: %d\n", objSerie2.getTemporadas());
        System.out.format("EPISÓDIOS: %d\n", objSerie2.getEpisodios());
        System.out.format("RATING: %.1f\n", objSerie2.getRating());

        System.out.println("\n-------- SÉRIE 3 --------");
        System.out.println(objSerie3.toString());
    }

}
