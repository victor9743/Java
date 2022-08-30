package com.mycompany.entradadedados;
import java.util.Scanner;
public class Entradadedados {

    public static void main(String[] args) {
        // instanciando a classe scanner
        Scanner ler = new Scanner(System.in);
        String msg;
        float valor;
        int inteiro;
        
        // lendo uma variável string nextLine()
        System.out.printf("Digite um conjunto de caracteres \n");
        msg = ler.nextLine();
        
        ler.nextLine();
        
        // lendo uma variável double
        System.out.printf("Digite um valor flutuante \n");
        valor = ler.nextFloat();
        
        ler.nextLine();
        
        // lendo uma variável inteira
        System.out.printf("digite um número \n");
        inteiro = ler.nextInt();
        
        System.out.printf("1- " + msg + " 2- " + valor + " 3- " + inteiro);
    }
}
