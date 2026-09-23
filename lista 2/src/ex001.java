
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int num1, num2, subtracao;
        System.out.print("Digite um número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite outro número:");
        num2 = entrada.nextInt();
        subtracao = num1 - num2;
        System.out.println("A subtração desses números é " + subtracao);
    }
}