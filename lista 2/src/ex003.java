
import java.util.Scanner;

public class ex003{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1, n2, div;

        System.out.println("Digite o primeiro número: ");
        n1 = ent.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = ent.nextInt();
        div = n1 / n2;
        System.out.println("A divisao dos dois números é " + div);
    }
}