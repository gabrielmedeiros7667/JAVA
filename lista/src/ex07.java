import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int sal, salreceber, imp;

        System.out.println("Digite seu salário: ");
        sal = entrada.nextInt();

        imp = sal * 10/100;
        System.out.println("O imposto é de: " + imp);

        salreceber = sal + 50 - imp;
        System.out.println("Salario liquido: " + salreceber);
    }
}
