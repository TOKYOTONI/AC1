package Exercicios_aula_4;

import java.util.Scanner;

public class Calcular_Perimetro_Retangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o valor dos lados");
        int lado =scanner.nextInt()* 2 ;

        System.out.println("Qual o valor das bases");
        int base = scanner.nextInt()* 2;
        
        int perimetro = base + lado;

        System.out.println(perimetro +" é o perimetro");
       

        scanner.close();
        
    }
}