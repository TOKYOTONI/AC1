package Exercicios_aula_4;

import java.util.Scanner;

public class Calcular_Area_quadrado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" qual e o valor do lado ");
        int lados = scanner.nextInt();

        int Soma = lados * lados;

        System.out.println(Soma + " é a área do quadrado ");

        scanner.close();
    

    }
    
}
