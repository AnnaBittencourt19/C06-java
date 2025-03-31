public class Cliente {
    private String nome;
    private int matricula;
    private String curso;

    public Cliente(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public String getCurso() { return curso; }
}