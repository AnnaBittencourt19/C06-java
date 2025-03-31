import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nBem vindo(a) a loja PCMania, nessa semana estamos com promoções ótimas para você estudante, o foco da nossa loja são PCs porém nossa promoção só abrange notebooks\nPara começar nosso atendimento preciso de alguns dos seus dados:");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua matrícula: ");
        int matricula = input.nextInt();
        input.nextLine();
        System.out.print("Digite seu curso: ");
        String curso = input.nextLine();
        Cliente cliente = new Cliente(nome, matricula, curso);

        PC[] compras = new PC[100];
        int quantidade = 0;

        int codigo;
        do {
            System.out.print("\nEsse mês nossa loja faz aniversário de 10 anos de funcionamento e para comemorar estamos lançado a nossa promoção que é testar a sorte dos estudantes. \nO preço dos nossos notebooks será definido pela sua matrícula na universidade, vamos dar especificações do produto e o preço você já sabe, na primeira opção o preço será sua matrícula, na segunda sua matrícula mais o valor de 1234 e na terceira opção sua matricula mais o valor de 5678\nNossa promoção é baseada em parceria com marcas e tudo mais, então um notebook com especificações melhores pode ter um preço mais barato então a escolha vai do seu gosto\n");
            System.out.println("\nOpção 1, Macbook pelo valor da sua matricula, oportunidade única se sua matricula for menos de 6000 - Promoção de Macbook, macboook mais barato do mercado você só encontra aqui na PC Mania, suas especificações incluem: \n Processador M2 e 8gb de RAM");
            System.out.println("\nOpção 2, Samsung com um preço elevado igual a sua memória RAM e sua capacidade de rodar aplicativos do dia a dia - Promoção de notebook com intel core i5 e RAM de 16gb");
            System.out.println("\nOpção 3, Dell Gamer para você jogar seu league of legends sem precisar dar murro na parede porque seu notebook travou enquanto joga - Promoção de notebook Ryzen 5, teclado com led e 16gb de RAM");
        System.out.println("Digite a sua opção: (1-3) ou 0 para finalizar a compra (Espero que a sua matricula nn seja um número muito baixo");
            codigo = input.nextInt();
            if (codigo >= 1 && codigo <= 3) {
                PC pc = criarPC(codigo, matricula);
                compras[quantidade] = pc;
                quantidade++;
                System.out.println("PC adicionado à compra!");
            } else if (codigo != 0) {
                System.out.println("Código inválido!");
            }
        } while (codigo != 0);

        System.out.println("\n--- RESUMO DA COMPRA ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Matrícula: " + cliente.getMatricula());
        System.out.println("Curso: " + cliente.getCurso());
        System.out.println("\nNotebooks Adquiridos:");
        System.out.println("Volte sempre! E obrigado pela preferência!");

        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            PC pc = compras[i];
            System.out.println("\nNotebook " + (i + 1) + ":");
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Preço: R$" + pc.getPreco());
            System.out.println("Processador: " + pc.getProcessador().getNome() + " (" + pc.getProcessador().getCapacidade() + " Mhz)");
            System.out.println("Memória RAM: " + pc.getMemoriaRAM().getCapacidade() + " Gb");
            System.out.println("HD: " + pc.getHd().getCapacidade() + " Gb");
            System.out.println("Sistema Operacional: " + pc.getSistemaOperacional().getNome() + " (" + pc.getSistemaOperacional().getTipo() + " bits)");
            System.out.println("Memória USB: " + pc.getMemoriaUSB().getNome() + " (" + pc.getMemoriaUSB().getCapacidade() + " Gb)");
            total += pc.getPreco();
        }

        System.out.println("\nTotal da compra: R$" + total);
        input.close();
    }

    private static PC criarPC(int codigo, int matricula) {
        switch (codigo) {
            case 1:
                return new PC(
                        "Apple", matricula,
                        new HardwareBasico("M2", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("SSD", 500),
                        new SistemaOperacional("MACOS", 64),
                        new MemoriaUSB("Pen-drive", 16)
                );
            case 2:
                return new PC(
                        "Samsung", matricula + 1234,
                        new HardwareBasico("Intel Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000),
                        new SistemaOperacional("Windows 8", 64),
                        new MemoriaUSB("Pen-drive", 32)
                );
            case 3:
                return new PC(
                        "Dell", matricula + 5678,
                        new HardwareBasico("Ryzen 5", 4500),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("SSD", 1000),
                        new SistemaOperacional("Windows 10", 64),
                        new MemoriaUSB("HD Externo", 1000)
                );
            default:
                return null;
        }
    }
}