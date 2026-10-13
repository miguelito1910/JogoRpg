package entities.Inimigos;

public class GerarInimigos {

    public static InimigoBase criarInimigoPorCenario(String cenario, int resultado) {
        String cenarioNormalizado = cenario.toLowerCase().trim();

        // Construtor: (Nome, Vida, Ataque, OuroMin, OuroMax)
        switch (cenarioNormalizado) {
            case "floresta":
                switch (resultado) {
                    case 0: return new InimigoBase("Urso Faminto", 45, 10, 15, 30);
                    case 1: return new InimigoBase("Goblin Maluco", 30, 7, 10, 25);
                    case 2: return new InimigoBase("Javali Furioso", 35, 8, 12, 28);
                }
                break;

            case "caverna":
                switch (resultado) {
                    case 0: return new InimigoBase("Morcego", 20, 5, 5, 15);
                    case 1: return new InimigoBase("Aranha Peludaça", 40, 9, 18, 35);
                    case 2: return new InimigoBase("Troll com Faquinha de Serra", 60, 12, 25, 50);
                }
                break;

            case "masmorra":
                switch (resultado) {
                    case 0: return new InimigoBase("Esqueleto Dançarino", 50, 11, 20, 40);
                    case 1: return new InimigoBase("Rato Gigante", 25, 6, 8, 20);
                    case 2: return new InimigoBase("Múmia Muito Louca", 65, 13, 30, 60);
                }
                break;

            case "castelo":
                switch (resultado) {
                    case 0: return new InimigoBase("Guarda", 70, 14, 35, 70);
                    case 1: return new InimigoBase("Mago", 60, 18, 50, 90);
                    case 2: return new InimigoBase("Fantasma do Rei", 100, 22, 80, 150);
                }
                break;
        }

        throw new IllegalArgumentException("Cenário ou evento inválido!");
    }
}
