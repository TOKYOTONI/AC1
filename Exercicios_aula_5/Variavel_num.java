package Exercicios_aula_5;

import java.util.Scanner;

public class Variavel_num {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor da variavel Num");
        int Num = scanner.nextInt();

        Num = Num*Num;

        scanner.close();

        System.out.println("a variavel Num é "+ Num);

    }
    
}
