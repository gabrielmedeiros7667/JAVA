import java.util.Scanner;

public class ex008{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso, peso_g;

        System.out.print("Digite o seu peso em quilos: ");
        peso = entrada.nextDouble();
        peso_g = peso*1000;
        System.out.print("Seu peso em gramas é: " + peso_g + "g");

    }
}