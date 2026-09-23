
import java.util.Scanner;

public class ex005{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Float preco, newpreco;

        preco = ent.nextFloat();
        System.out.println("O produto está saíndo por " + preco);
        newpreco = (preco * 10) / 100;
        System.out.println("Mas como vc term 10% de desconto o produto vai sair por " + newpreco );
    }
}