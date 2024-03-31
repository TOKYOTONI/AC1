package Exercicios_aula_4;

import java.util.Scanner;

public class Calculo_Juros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("bote o valor do capital");
        int Capital = scanner.nextInt();

        System.out.println("digite o valor do juros");
        double taxa_juros = scanner.nextDouble() / 100;
    
        System.out.println("digite o tempo em meses");
        int tempo = scanner.nextInt();

        double soma = Capital * tempo *taxa_juros;

        scanner.close();

        System.out.println(soma);

       
    }

    
}