
import java.util.Scanner;

public class Aula5_AC1 {
    public static void main(String[] args){

        double AC1, AC2, AG, AF, Soma = 0;
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua nota de AC1 ?");       
       AC1 = 0.15 * scanner.nextDouble();
 
        System.out.println("Qual a sua nota de AC1 ?");       
       AC2 = 0.30 * scanner.nextDouble();
       
        System.out.println("Qual a sua nota de AC1 ?");   
       AG = 0.10 * scanner.nextDouble();

        System.out.println("Qual a sua nota de AC1 ?");  
       AF = 0.45 * scanner.nextDouble();

        scanner.close();

        Soma = (AC1 + AC2 + AG + AF);

            System.out.println(Soma);
        }
        
        
        
}
