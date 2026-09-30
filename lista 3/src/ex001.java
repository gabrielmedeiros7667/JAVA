import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double trabalho, avaliacao, provafinal, media;

        System.out.print("Escreva sua nota do trabalho: ");
        trabalho = entrada.nextDouble();

        System.out.print("Escreva sua nota da avaliação: ");
        avaliacao = entrada.nextDouble();

        System.out.print("Escreva sua nota da prova final: ");
        provafinal = entrada.nextDouble();

        media = (trabalho * 2 + avaliacao * 3 + provafinal * 5) / 10;
        if (media >= 8 && media <= 10){
            System.out.print("Obteve conceito A");
        }
        else if (media >= 7 && media < 8){
            System.out.print("Obteve conceito B");
        }
        else if (media >= 6 && media < 7){
            System.out.print("obteve conceito C");
        }
        else if (media >= 5 && media < 6){
            System.out.print("Obteve conceito D");
        }
        else {
            System.out.print("Obteve conceito E");
        }
    }
}