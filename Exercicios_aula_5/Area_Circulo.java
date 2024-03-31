package Exercicios_aula_5;

import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        

        System.out.println("qual e o raio do circulo");
        int raio =  scanner.nextInt();

        int soma = (raio * raio);

        pi = pi * soma;

        scanner.close();

        System.out.println(pi);



        

    }
    
}
