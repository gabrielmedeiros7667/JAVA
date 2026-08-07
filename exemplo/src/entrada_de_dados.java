import java.util.Scanner;

public class entrada_de_dados {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite o segundo numero; ");
        numero2 = entrada.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + soma);


}
    
}
