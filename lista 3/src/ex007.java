import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite I (1, 2 ou 3): ");
        int i = sc.nextInt();
        System.out.print("Digite A: ");
        double a = sc.nextDouble();
        System.out.print("Digite B: ");
        double b = sc.nextDouble();
        System.out.print("Digite C: ");
        double c = sc.nextDouble();

        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        double meio = a + b + c - maior - menor;

        if (i == 1) {
            System.out.println(menor + " " + meio + " " + maior);
        } else if (i == 2) {
            System.out.println(maior + " " + meio + " " + menor);
        } else if (i == 3) {
            System.out.println(menor + " " + maior + " " + meio);
        }

        sc.close();
    }
}