
import java.util.Scanner;

public class ex004{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double n1, n2, peso1, peso2, media;
    
        System.out.println("Digite a primeira nota: ");
        n1 = ent.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ent.nextDouble();

        System.out.println("Digite o primeiro peso: ");
        peso1 = ent.nextDouble();
        System.out.println("Digite o segundo peso: ");
        peso2 = ent.nextDouble();

        media = (n1 * peso1) + (n2* peso2) / (peso1 + peso2);
        System.out.println("a média é " + media);
    }
}