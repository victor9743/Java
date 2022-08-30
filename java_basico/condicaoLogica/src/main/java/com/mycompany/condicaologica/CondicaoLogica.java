package com.mycompany.condicaologica;
import java.util.Scanner;

public class CondicaoLogica {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.printf("Digite um número: \n");
        num = ler.nextInt();
        
        // if else
        if (num == 1){
            System.out.printf("Valor digitado: 1");
        } else if(num == 2){
            System.out.printf("Valor digitado: 2");
        } else {
            System.out.printf("Valor digitado: " + num);
        }
    }
}
