package entities;

public abstract class Personagem {

    private String nome;
    private int nivel;
    private int xp;
    private int vida;
    private int vidaMaxima;
    private int ataque;
    private int defesa;
    private int ouro;

    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.xp = 0;
        this.ouro = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getXp() {
        return xp;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getOuro() {
        return ouro;
    }

    protected void setVida(int vida) {
        this.vida = vida;
    }

    protected void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    protected void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    protected void setDefesa(int defesa) {
        this.defesa = defesa;
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

        System.out.println(nome + " recebeu " + danoFinal + " de dano.");
    }

    public void curar(int quantidade) {
        vida += quantidade;

        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void restaurarVida() {
        vida = vidaMaxima;
    }

    public void adicionarXp(int quantidade) {
        xp += quantidade;

        System.out.println("Voce ganhou " + quantidade + " XP!");

        if (xp >= nivel * 100) {
            subirNivel();
        }
    }

    private void subirNivel() {
        nivel++;
        xp = 0;

        vidaMaxima += 20;
        ataque += 5;
        defesa += 3;
        vida = vidaMaxima;

        System.out.println();
        System.out.println("******** LEVEL UP! ********");
        System.out.println("Voce chegou ao nivel " + nivel + "!");
        System.out.println("Vida maxima aumentou!");
        System.out.println("Ataque aumentou!");
        System.out.println("Defesa aumentou!");
        System.out.println("****************************");
    }

    public void adicionarOuro(int quantidade) {
        ouro += quantidade;
    }

    public boolean gastarOuro(int quantidade) {
        if (ouro >= quantidade) {
            ouro -= quantidade;
            return true;
        }

        return false;
    }

    public abstract String getClasse();

    public void mostrarPersonagem() {

        System.out.println();
        System.out.println("================================");
        System.out.println("        SEU PERSONAGEM");
        System.out.println("================================");

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + getClasse());
        System.out.println("Nivel: " + nivel);
        System.out.println("XP: " + xp);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Ouro: " + ouro);

        System.out.println("================================");
    }
}