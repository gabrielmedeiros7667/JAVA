
import java.util.Scanner;

public class ex002{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n1, n2, n3, soma;

        System.out.println("Digite o primeiro número: ");
        n1 = ent.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = ent.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = ent.nextInt();
        soma = n1 * n2 * n3;
        System.out.println("A multiplicação desses 3 números é igual a " + soma);
    }

}