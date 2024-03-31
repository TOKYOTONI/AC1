package Exercicios_aula_5;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual e a sua primeira nota");
        int numero = scanner.nextInt();

        System.out.println("qual e a sua segunda nota");
        numero = numero + scanner.nextInt();

        System.out.println("qual e a sua terceira nota");
        numero = numero + scanner.nextInt();


        int soma = numero/ 3;
        scanner.close();

        System.out.println("sua media final é " + soma);
        
    }

    
}