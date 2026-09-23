
import java.util.Scanner;



public class ex007{
    public static void main(String[] args) {
        double peso, engordou, emagreceu;
        Scanner ent = new Scanner(System.in);

        System.out.println("Qual seu peso:");
        peso = ent.nextDouble();
        System.out.println("Seu peso é de " + peso + "kg");
        //A
        engordou = peso + ((peso * 15) / 100);
        System.out.println("Você engordou 15% assim ficando com " + engordou + "kg");
        //B
        emagreceu = peso - ((peso * 20) / 100);
        System.out.println("Você emagreceu 20% assim ficando com " + emagreceu + "kg");

    }
}