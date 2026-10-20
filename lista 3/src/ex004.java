import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.print("Digite um número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        numero2 = entrada.nextInt();
        System.out.print("Digite mais um número: ");
        numero3 = entrada.nextInt();

        if (numero1 < numero2 && numero1< numero3){
            System.out.print("A ordem cresente é:" + numero1 + numero2 + numero3);
        }
        else if (numero2 < numero1 && numero2 < numero3) {
            System.out.print("A ordem crescente é: " + numero2 + "-" + numero1 + "-" + numero3);

        }
        else {
            System.out.print("A ordem crescente é: " + numero3 + "-" + numero2 + "-" + numero1);
        }
    }
}
