import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);//Scanner = entrada de dados
        System.out.println("Digite a quantidade de lanche1:");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite a quantidade de lanche2:");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite a quantidade de lanche3:");
        int lanche3 = entrada.nextInt();
        entrada.close();

        int total = lanche1 + lanche2 + lanche3;
        int media = total/3;

        System.out.println("Total:" + total);
        System.out.println("Media:" + media);
    }
}
