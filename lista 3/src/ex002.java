import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media, notaRecuperacao;

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 0 && media < 3){
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7){
            System.out.println("Recuperação");
            notaRecuperacao = 12 - media;
            System.out.printf("Nota necessária na recuperação: %.2f%n",  + notaRecuperacao);
        }
    }
}
