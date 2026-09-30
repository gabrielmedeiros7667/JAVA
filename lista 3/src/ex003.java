import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.print("DIgite um numero: ");
        num1 = entrada.nextInt();
        System.out.print("DIgite outro numero: ");
        num2 = entrada.nextInt();

        if ( num1 > num2){
            System.out.print("O maior numero é: " + num1);
        }
        else if (num1 < num2){
            System.out.println("O maior numero é: " + num2);
        }
        else{
            System.out.println("Os dois são iguais");
        }
    }
}
