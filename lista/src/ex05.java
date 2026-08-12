import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int sal, perc, aumento, novosal;

        System.out.println("Digite seu salario atual: ");
        sal = entrada.nextInt();
        System.out.println("Digite o percentual de aumento: ");
        perc = entrada.nextInt();
        
        aumento = sal * perc/100;

        System.out.println("O aumento foi de: " + aumento);

        novosal = sal + aumento;
        System.out.println("Esse é seu novo salário: " + novosal);
    }
}
