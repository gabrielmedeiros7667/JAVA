import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3, numero4;

        System.out.print("Digite três numeros em ordem crescente. ");
        System.out.println("Primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Terceiro numero: ");
        numero3 = entrada.nextInt();

        System.out.println("Agora escreva um numero fora da ordem: ");
        numero4 = entrada.nextInt();

        if (numero4 > numero3 ){
            System.out.println("A ordem decrescente é: " + numero4 + "-" + numero3 + "-" + numero2 + "-" + numero1);
        }
        else if (numero4 > numero2 && numero4 < numero2) {
            System.out.println("A ordem decrescente é: ");
        }
    }
}
