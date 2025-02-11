//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Exercicio1 {
    public static void main(String[] args) {

        int lanche1 = 10;
        int lanche2 = 4;
        int lanche3 = 2;

        int total = lanche1 + lanche2 + lanche3;

        float media = (float)total/3; //o total é int então usa esse (float) como casting (trocar de int pra float)

        System.out.println("Total:"  + total);
        System.out.println("Media de lanches:" + media);
    }
}
