import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, peso1, peso2, peso3, média;

        System.out.print("Digite sua primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.print("Digite o peso respectivo a nota 1: ");
        peso1 = entrada.nextFloat();
        System.out.print("Digite o peso respectivo a nota 2: ");
        peso2 = entrada.nextFloat();
        System.out.print("Digite o peso resspectivo a nota 3: ");
        peso3 = entrada.nextFloat();

        média = ((nota1*peso1) + (nota2 * peso2) + (nota3 * peso3));

        System.out.println("Essa é a média das notas com o peso: " + média);
    }
}
