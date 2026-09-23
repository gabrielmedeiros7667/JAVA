
import java.util.Scanner;

public class ex006{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float salario, aumento, newsalario;
        int vendas;
        System.out.println("Digite o salário do funcionario: ");
        salario = ent.nextFloat();
        System.out.println("Vendeu quantos produtos: ");
        vendas= ent.nextInt();
        aumento = (salario * 4) / 100;
        newsalario = salario + (aumento * vendas);
        System.out.println("Novo salário é de " + newsalario);

        
    }
}