package Exercicios_aula_4;

import java.util.Scanner;

public class Calcular_Primetro_Quadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" qual o valor dos lados ");
        int lados = scanner.nextInt() * 4;

        System.out.println(lados + " e o perimetro do quadrado ");

        scanner.close();
        
    }
}
