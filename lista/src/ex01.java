import java.util.Scanner;

public class ex01{
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite o primeiro numero da soma: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo numero da soma: ");
        num2 = entrada.nextInt();
        soma = num1 + num2;
        System.out.print("A soma dos dois numeros é: " + soma);

    }
}
