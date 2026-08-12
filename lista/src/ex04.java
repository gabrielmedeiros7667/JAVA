import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float salario, bonificação;

        System.out.print("Digite seu salário atual: ");
        salario = entrada.nextFloat();
        
        bonificação = salario + salario * 25/100;

        System.out.print("Esse é seu salário depois da binificação de 25%: " + bonificação);
    }
}
