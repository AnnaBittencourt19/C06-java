import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota da NPA");
        int npa = entrada.nextInt();
        if(npa >= 60){
            System.out.println("Aprovado sem NP3! NPA = " + npa);
        }
        else{
            System.out.println("Digite a nota da NP3");
            int np3 = entrada.nextInt();
            int media = (npa + np3)/2;
            if (media >= 50){
                System.out.println("Passou! NPA = " + media);
            } else if (media >= 48 && media <= 50) {
                System.out.println("Dá uns pontinhos pra esse aluno vai! NPA = " + media);
            }
            else {
                System.out.println("Reprovou!");
            }
        }

    }
}
