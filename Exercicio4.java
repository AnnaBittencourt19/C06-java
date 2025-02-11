import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Entre com o número de alunos matriculados: ");
        int numAlunos = entrada.nextInt();

        switch (numAlunos){
            case 10:  //tirou o sout e o break pq o caso 10 e 20 retornam a mesma coisa
            case 20:
                System.out.println("Sala 16");
            break;
            case 30:
                System.out.println("Sala 22");
            break;
        }
        entrada.close();
    }
}
