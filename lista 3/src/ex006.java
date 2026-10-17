import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero:");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.print("Seu numero é par");
        }
        else{
            System.out.print("Seu numero é impar");
        }

    }
}
