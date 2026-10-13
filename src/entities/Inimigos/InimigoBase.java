package entities.Inimigos;

public class InimigoBase {
    private String nome;
    private int vidaMax;
    private int vidaAtual;
    private int ataqueBase;
    private int ouroMin;
    private int ouroMax;

    // Construtor sem XP
    public InimigoBase(String nome, int vida, int ataqueBase, int ouroMin, int ouroMax) {
        this.nome = nome;
        this.vidaMax = vida;
        this.vidaAtual = vida;
        this.ataqueBase = ataqueBase;
        this.ouroMin = ouroMin;
        this.ouroMax = ouroMax;
    }

    // Métodos de combate
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
    public int getOuroMin() { return ouroMin; }
    public int getOuroMax() { return ouroMax; }
}