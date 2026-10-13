package entities.Inimigos;

public class InimigoBase {
    private String nome;
    private int vidaMax;
    private int vidaAtual;
    private int ataqueBase;
    private int xpMin;
    private int xpMax;
    private int ouroMin;
    private int ouroMax;

    // Construtor
    public InimigoBase(String nome, int vida, int ataqueBase, int xpMin, int xpMax, int ouroMin, int ouroMax) {
        this.nome = nome;
        this.vidaMax = vida;
        this.vidaAtual = vida;
        this.ataqueBase = ataqueBase;
        this.xpMin = xpMin;
        this.xpMax = xpMax;
        this.ouroMin = ouroMin;
        this.ouroMax = ouroMax;
    }

    // Métodos de utilidade do combate
    public boolean estaVivo() {
        return this.vidaAtual > 0;
    }

    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
    }

    public void resetarVida() {
        this.vidaAtual = this.vidaMax;
    }

    // Getters
    public String getNome() { return nome; }
    public int getVidaAtual() { return vidaAtual; }
    public int getVidaMax() { return vidaMax; }
    public int getAtaqueBase() { return ataqueBase; }
    public int getXpMin() { return xpMin; }
    public int getXpMax() { return xpMax; }
    public int getOuroMin() { return ouroMin; }
    public int getOuroMax() { return ouroMax; }
}