import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int sal, salreceber, grat, imp;

        System.out.println("Digite seu salario atual: ");
        sal = entrada.nextInt();
        
        grat = sal * 5/100;
        System.out.println("Gratificação de: " + grat);

        imp = sal * 7/100;
        System.out.println("Imposto de: " + imp);

        salreceber = sal + grat - imp;
        System.out.println("Salario liquido de: " + salreceber);
    }
}
