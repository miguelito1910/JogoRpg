package entities;

public abstract class Inimigo {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int xpRecompensa;
    private int ouroRecompensa;

    public Inimigo(
            String nome,
            int vida,
            int ataque,
            int defesa,
            int xpRecompensa,
            int ouroRecompensa) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.xpRecompensa = xpRecompensa;
        this.ouroRecompensa = ouroRecompensa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getXpRecompensa() {
        return xpRecompensa;
    }

    public int getOuroRecompensa() {
        return ouroRecompensa;
    }

    public void receberDano(int dano) {

        int danoFinal = dano - defesa;

        if (danoFinal < 1) {
            danoFinal = 1;
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(
                nome +
                " recebeu " +
                danoFinal +
                " de dano."
        );
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract String getTipo();
}
