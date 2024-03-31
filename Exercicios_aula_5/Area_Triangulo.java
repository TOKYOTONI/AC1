package Exercicios_aula_5;

import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int Base ,altura ,soma;

        System.out.println("qual a medida da base do triangulo");
        Base = scanner.nextInt();

        System.out.println("qual é a altura do trinagulo");
        altura = scanner.nextInt();

        soma = Base * altura/ 2;

        scanner.close();

        System.out.println("À area do trinagulo com base "+ Base +"  e altura " + altura + ", é "+ soma);
    }
    
}
