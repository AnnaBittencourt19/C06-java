public class PC {
    private String marca;
    private double preco;
    private HardwareBasico processador;
    private HardwareBasico memoriaRAM;
    private HardwareBasico hd;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public PC(String marca, double preco, HardwareBasico processador, HardwareBasico memoriaRAM,
              HardwareBasico hd, SistemaOperacional sistemaOperacional, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.hd = hd;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaUSB = memoriaUSB;
    }

    public String getMarca() { return marca; }
    public double getPreco() { return preco; }
    public HardwareBasico getProcessador() { return processador; }
    public HardwareBasico getMemoriaRAM() { return memoriaRAM; }
    public HardwareBasico getHd() { return hd; }
    public SistemaOperacional getSistemaOperacional() { return sistemaOperacional; }
    public MemoriaUSB getMemoriaUSB() { return memoriaUSB; }
}