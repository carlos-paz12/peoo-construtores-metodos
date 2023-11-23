package br.edu.ifrn.peoo.construtores_metodos.calculadora;

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.println("SOMA");
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double s1 = objScanner.nextDouble();
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double s2 = objScanner.nextDouble();

        double resultado1 = Calculadora.soma(s1, s2);
        System.out.println(resultado1);

        System.out.println("");
        System.out.println("SUBTRAÇÃO");
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double subtracao1 = objScanner.nextDouble();
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double subtracao2 = objScanner.nextDouble();

        double resultado2 = Calculadora.subtracao(subtracao1, subtracao2);
        System.out.println(resultado2);

        System.out.println("");
        System.out.println("MULTIPLICAÇÃO");
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double multiplicacao1 = objScanner.nextDouble();
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double multiplicacao2 = objScanner.nextDouble();

        double resultado3 = Calculadora.multiplicacao(multiplicacao1, multiplicacao2);
        System.out.println(resultado3);

        System.out.println("");
        System.out.println("DIVISÃO");
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double divisao1 = objScanner.nextDouble();
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        double divisao2 = objScanner.nextDouble();

        double resultado4 = Calculadora.divisao(divisao1, divisao2);
        System.out.printf("%.2f", resultado4);

        objScanner.close();
    }

}
