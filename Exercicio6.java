import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println(x);
        for(int i = 0; i <= 10; i++){
            System.out.println("Digite um numero: ");
            int numero = entrada.nextInt();

            if (numero < x){
                System.out.println("Menor!");
            } else if (numero == x) {
                System.out.println("Acertou!");
                break;
            } else {
                System.out.println("Maior! ");
            }
        }

    }
}