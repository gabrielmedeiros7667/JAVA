import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, média; 

        System.out.print("Digite sua primeira nota: ");
        nota1 = entrada.nextInt();
        System.out.print("Digite sua segunda nota: ");
        nota2 = entrada.nextInt();
        System.out.print("Digite sua terceira nota: ");
        nota3 = entrada.nextInt();
        média = nota1 + nota2 + nota3 / 3;
        System.out.print("Sua média é: " + média);
    }
}
