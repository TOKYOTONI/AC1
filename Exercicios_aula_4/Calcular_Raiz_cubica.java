package Exercicios_aula_4;

import java.util.Scanner;

public class Calcular_Raiz_cubica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("qual numero que voce quer saber a raiz cubica ? ");
        double Raiz = scanner.nextInt() /3;

        System.out.println(Raiz);

        scanner.close();
        
    }
    
}
