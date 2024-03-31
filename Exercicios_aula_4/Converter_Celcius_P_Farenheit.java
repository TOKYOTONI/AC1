package Exercicios_aula_4;

import java.util.Scanner;

public class Converter_Celcius_P_Farenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor em em celsius");
        int celsius = (scanner.nextInt() * 9) /5 + 32;

        scanner.close();

        System.out.println(celsius);


        
    }

    
}
    